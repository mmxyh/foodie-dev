package com.imooc.enums;

/**
 * @Description： 性别 枚举
 * @Author: hmm
 * @Date: 2021/6/23
 */
public enum Sex {
    woman(0,"女"),
    man(1,"男"),
    secret(2,"保密");

    public final Integer type;
    public final String value;

    Sex(Integer type, String value) {
        this.type = type;
        this.value = value;
    }


}
