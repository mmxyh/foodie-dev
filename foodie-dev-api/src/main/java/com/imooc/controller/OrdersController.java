package com.imooc.controller;


import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayMethod;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.bo.SumbitOrderBO;
import com.imooc.pojo.vo.MerchantOrdersVO;
import com.imooc.pojo.vo.OrderVO;
import com.imooc.service.OrderService;
import com.imooc.utils.CookieUtils;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author: hmm
 * @date: 2021/12/1 22:54
 */
@Api(value = "订单相关", tags = {"订单相关的api接口"})
@RestController
@RequestMapping("orders")
public class OrdersController extends BaseController {
    final static Logger logger = LoggerFactory.getLogger(OrdersController.class);
    @Autowired
    private OrderService orderService;
    /**
     * 需要在WebMvcConfig配置bean
     */
    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "用户下单", notes = "用户下单", httpMethod = "POST")
    @PostMapping("/create")
    public IMOOCJSONResult create(@ApiParam(name = "sumbitOrderBO", value = "用于创建订单的VO对象", required = true)
                                  @RequestBody SumbitOrderBO sumbitOrderBO,
                                  HttpServletRequest request,
                                  HttpServletResponse response) {
        if (sumbitOrderBO.getPayMethod() != PayMethod.WEIXIN.type && sumbitOrderBO.getPayMethod() != PayMethod.ALIPAY.type) {
            return IMOOCJSONResult.errorMsg("支付方式不支持");
        }

        System.out.println(sumbitOrderBO.toString());
        // 1.创建订单
        OrderVO orderVO = orderService.createOrder(sumbitOrderBO);
        String orderId = orderVO.getOrderId();


        // 2.
        /**
         * 1001
         * 2002 -> 用户购买
         * 3003 -> 用户购买
         * 4004
         */
        // TODO 整合redis之后，完善购物车中的已结算商品清除，并且同步到前端的cookie
//        CookieUtils.setCookie(request, response, FOODIE_SHOPCART, "", true);

        // 3.向支付发送当前订单，用于保存支付中的订单数据
        MerchantOrdersVO merchantOrdersVO = orderVO.getMerchantOrdersVO();
        merchantOrdersVO.setReturnUrl(payReturnUrl);

        // 为了方便测试购买，所以所有的支付金额豆统一改为1分钱
        merchantOrdersVO.setAmount(1);

        // HTTP消息头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("imoocUserId", "imooc");
        headers.add("password", "imooc");

        // HTTP请求的实体和HTTP响应的实体
        HttpEntity<MerchantOrdersVO> entity =
                new HttpEntity<>(merchantOrdersVO, headers);
        // 发送请求
        ResponseEntity<IMOOCJSONResult> responseEntity =
                restTemplate.postForEntity(paymentUrl,
                        entity,
                        IMOOCJSONResult.class);
        // 返回结果
        IMOOCJSONResult paymentResult = responseEntity.getBody();
        if (paymentResult.getStatus() != 200) {
            logger.error("发送错误：{}", paymentResult.getMsg());
            return IMOOCJSONResult.errorMsg("支付中心订单创建失败，请联系管理员！");
        }

        return IMOOCJSONResult.ok(orderId);
    }


    @ApiOperation(value = "通知商家订单已支付", notes = "通知商家订单已支付", httpMethod = "POST")
    @PostMapping("/notifyMerchantOrderPaid")
    public Integer notifyMerchantOrderPaid(String merchantOrderId) {
        // 修改订单状态为已支付
        orderService.updateOrderStatus(merchantOrderId, OrderStatusEnum.WAIT_DELIVER.type);
        return HttpStatus.OK.value();
    }

    /**
     * 查询订单信息
     * post方式：http://payment.t.mukewang.com/foodie-payment/payment/getPaymentCenterOrderInfo?merchantOrderId=210303ABC8FGMRAW&merchantUserId=210226ANR29SWS5P
     * 注意header添加imoocUserId：imooc，password：imooc
     */



    @ApiOperation(value = "查询订单状态", notes = "查询订单状态", httpMethod = "POST")
    @PostMapping("/getPaidOrderInfo")
    public IMOOCJSONResult getPaidOrderInfo(String orderId) {
        OrderStatus orderStatus = orderService.queryOrderStatusInfo(orderId);
        return IMOOCJSONResult.ok(orderStatus);
    }





}
