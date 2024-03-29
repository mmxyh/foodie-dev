package com.imooc.service.center;

import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.Orders;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.center.CenterUserBO;
import com.imooc.pojo.vo.OrderStatusCountsVO;
import com.imooc.utils.PagedGridResult;
import io.swagger.models.auth.In;

/**
 * @author: hmm
 * @date: 2022/2/21
 */
public interface MyOrdersService {
    /**
     * 查询我的订单列表
     *
     * @param userId
     * @param orderStatus
     * @return
     */
    PagedGridResult queryMyOrders(String userId, Integer orderStatus, Integer page, Integer pageSize);

    /**
     * 订单状态 --> 商家发货
     *
     * @param orderId
     */
    void updateDeliverOrderStatus(String orderId);

    /**
     * 查询我的订单
     *
     * @param orderId
     * @param userId
     */
    Orders queryMyOrder(String orderId, String userId);


    /**
     * 更新订单状态 -> 确认收货
     *
     * @param orderId
     */
    boolean updateReceiveOrderStatus(String orderId);

    /**
     * 更新订单状态 -> 删除订单(逻辑删除)
     *
     * @param userId
     * @param orderId
     */
    boolean deleteOrder(String userId, String orderId);


    /**
     * @param userId
     */
    OrderStatusCountsVO getMyOrderStatusCounts(String userId);


    /**
     * 获取分页的订单动向
     * @param userId
     * @param page
     * @param pageSize
     * @return
     */
    PagedGridResult getMyOrderTrend(String userId, Integer page, Integer pageSize);
}
