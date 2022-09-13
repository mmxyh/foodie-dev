package com.imooc.pojo.vo;

/**
 * @Description：  三级级分类VO
 * @Author: hmm
 * @Date: 2021/7/19
 */
public class SubCategoryVO {
    /**
     * 主键 分类id主键
     */
    private Integer subId;

    /**
     * 分类名称 分类名称
     */
    private String subName;

    /**
     * 分类类型 分类得类型，
     * 1:一级大分类
     * 2:二级分类
     * 3:三级小分类
     */
    private Integer subType;

    /**
     * 父id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    private Integer subFatherId;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public Integer getSubFatherId() {
        return subFatherId;
    }

    public void setSubFatherId(Integer subFatherId) {
        this.subFatherId = subFatherId;
    }
}
