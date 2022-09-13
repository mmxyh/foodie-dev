package com.imooc.pojo.vo;

import io.swagger.models.auth.In;

/**
 * 订单状态概览数量VO
 *
 * @author: hmm
 * @date: 2022/3/14
 */
public class OrderStatusCountsVO {
    private Integer waitPayCounts;
    private Integer waitDeliverCounts;
    private Integer waitReceiveCounts;
    private Integer waitCommentCounts;

    public OrderStatusCountsVO(Integer waitPayCounts, Integer waitDeliverCounts, Integer waitReceiveCounts, Integer waitCommentCounts) {
        this.waitPayCounts = waitPayCounts;
        this.waitDeliverCounts = waitDeliverCounts;
        this.waitReceiveCounts = waitReceiveCounts;
        this.waitCommentCounts = waitCommentCounts;
    }

    public Integer getWaitPayCounts() {
        return waitPayCounts;
    }

    public void setWaitPayCounts(Integer waitPayCounts) {
        this.waitPayCounts = waitPayCounts;
    }

    public Integer getWaitDeliverCounts() {
        return waitDeliverCounts;
    }

    public void setWaitDeliverCounts(Integer waitDeliverCounts) {
        this.waitDeliverCounts = waitDeliverCounts;
    }

    public Integer getWaitReceiveCounts() {
        return waitReceiveCounts;
    }

    public void setWaitReceiveCounts(Integer waitReceiveCounts) {
        this.waitReceiveCounts = waitReceiveCounts;
    }

    public Integer getWaitCommentCounts() {
        return waitCommentCounts;
    }

    public void setWaitCommentCounts(Integer waitCommentCounts) {
        this.waitCommentCounts = waitCommentCounts;
    }
}
