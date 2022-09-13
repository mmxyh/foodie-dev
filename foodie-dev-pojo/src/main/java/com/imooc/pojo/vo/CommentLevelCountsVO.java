package com.imooc.pojo.vo;

import io.swagger.models.auth.In;

/**
 * @Description： 用于展示商品评价数量 VO
 * @Author: hmm
 * @Date: 2021/7/25
 */
public class CommentLevelCountsVO {
    private Integer badCounts;
    private Integer goodCounts;
    private Integer normalCounts;
    private Integer totalCounts;

    public Integer getBadCounts() {
        return badCounts;
    }

    public void setBadCounts(Integer badCounts) {
        this.badCounts = badCounts;
    }

    public Integer getGoodCounts() {
        return goodCounts;
    }

    public void setGoodCounts(Integer goodCounts) {
        this.goodCounts = goodCounts;
    }

    public Integer getNormalCounts() {
        return normalCounts;
    }

    public void setNormalCounts(Integer normalCounts) {
        this.normalCounts = normalCounts;
    }

    public Integer getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
    }
}
