package com.imooc.enums;

/**
 * @Description： 商品评价等级 枚举
 * @Author: hmm
 * @Date: 2021/7/25
 */
public enum CommentLevel {
    GOOD(1,"好评"),

    NORMAL(2,"中评"),

    BAD(3,"差评");


    public final Integer type;
    public final String value;

    CommentLevel(Integer type, String value) {
        this.type = type;
        this.value = value;
    }

}
