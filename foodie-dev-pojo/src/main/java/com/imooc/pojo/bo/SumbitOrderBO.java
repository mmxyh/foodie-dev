package com.imooc.pojo.bo;

import io.swagger.models.auth.In;

/**
 * 用于创建订单的VO对象
 * @author: hmm
 * @date: 2021/12/1
 */
public class SumbitOrderBO {
    private String userId;
    /**
     * 商品规格
     */
    private String itemSpecIds;
    /**
     * 地址
     */
    private String addressId;
    /**
     * 支付方式
     */
    private Integer payMethod;
    /**
     * 备注
     */
    private String leftMsg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getItemSpecIds() {
        return itemSpecIds;
    }

    public void setItemSpecIds(String itemSpecIds) {
        this.itemSpecIds = itemSpecIds;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getLeftMsg() {
        return leftMsg;
    }

    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg;
    }

    @Override
    public String toString() {
        return "SumbitOrderBO{" +
                "userId='" + userId + '\'' +
                ", itemSpecIds='" + itemSpecIds + '\'' +
                ", addressId='" + addressId + '\'' +
                ", payMethod='" + payMethod + '\'' +
                ", leftMsg='" + leftMsg + '\'' +
                '}';
    }
}
