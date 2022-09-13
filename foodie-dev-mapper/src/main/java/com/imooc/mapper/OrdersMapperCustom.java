package com.imooc.mapper;

import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.MyOrdersVO;
import com.imooc.pojo.vo.NewItemsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface OrdersMapperCustom {


    /**
     * 根据订单状态 - 查询我的订单
     * @param map
     * @return
     */
    public List<MyOrdersVO> queryMyOrders(@Param("paramsMap") Map<String, Object> map);

    /**
     * 根据用户Id、订单状态 - 查询数量
     * @param map
     * @return
     */
    public Integer getMtOrderStatusCounts(@Param("paramsMap") Map<String, Object> map);

    /**
     * 查询订单动向
     * @param map
     * @return
     */
    public List<OrderStatus> getMyOrderTrend(@Param("paramsMap") Map<String, Object> map);

}