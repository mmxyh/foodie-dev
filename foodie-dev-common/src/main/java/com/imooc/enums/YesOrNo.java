package com.imooc.enums;

/**
 * @Description： 是否 枚举
 * @Author: hmm
 * @Date: 2021/6/23
 */
public enum YesOrNo {
    NO(0,"否"),
    YES(1,"是");

    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }


}
