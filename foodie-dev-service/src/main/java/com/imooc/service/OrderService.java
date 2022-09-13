package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.bo.SumbitOrderBO;
import com.imooc.pojo.vo.OrderVO;

import javax.swing.text.html.FormSubmitEvent;
import java.util.List;

/**
 * @Description：
 * @Author: hmm
 * @Date: 2021/7/19
 */
public interface OrderService {

    /**
     * 创建订单相关
     *
     * @param sumbitOrderBO
     * @return orderId
     */
    OrderVO createOrder(SumbitOrderBO sumbitOrderBO);


    /**
     * 修改订单状态
     *
     * @param orderId
     * @param orderStatus
     * @return
     */
    void updateOrderStatus(String orderId, Integer orderStatus);


    /**
     * 查询订单状态
     *
     * @param orderId
     * @return
     */
    OrderStatus queryOrderStatusInfo(String orderId);

    /**
     * 关闭超时未支付订单
     */
    void closeOrder();
}
