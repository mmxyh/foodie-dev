package com.imooc.pojo.vo;

import io.swagger.models.auth.In;

import java.util.Date;
import java.util.List;

/**
 * @Description：  用户中心，我的订单列表VO
 * @Author: hmm
 * @Date: 2022/3/7
 */
public class MyOrdersVO {
    /**
     * 订单Id
     */
    private String orderId;
    /**
     * 订单创建时间（成交时间）
     */
    private Date createTime;
    /**
     * 支付方式
     */
    private Integer payMethod;
    /**
     * 实际支付总价格
     */
    private Integer realPayAmount;
    /**
     * 邮费;默认可以为零，代表包邮
     */
    private Integer postAmount;
    /**
     * 买家是否评价
     */
    private Integer isComment;
    /**
     * 订单状态
     */
    private Integer orderStatus;


    List<MySubOrderItemVO> subOrderItemList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getRealPayAmount() {
        return realPayAmount;
    }

    public void setRealPayAmount(Integer realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    public Integer getPostAmount() {
        return postAmount;
    }

    public void setPostAmount(Integer postAmount) {
        this.postAmount = postAmount;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<MySubOrderItemVO> getSubOrderItemList() {
        return subOrderItemList;
    }

    public void setSubOrderItemList(List<MySubOrderItemVO> subOrderItemList) {
        this.subOrderItemList = subOrderItemList;
    }
}
