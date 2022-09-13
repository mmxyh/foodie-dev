package com.imooc.pojo.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

/**
 * @Description：  二级分类VO
 * @Author: hmm
 * @Date: 2021/7/19
 */
public class CategoryVO {
    /**
     * 主键 分类id主键
     */
    private Integer id;

    /**
     * 分类名称 分类名称
     */
    private String name;

    /**
     * 分类类型 分类得类型，
     * 1:一级大分类
     * 2:二级分类
     * 3:三级小分类
     */
    private Integer type;

    /**
     * 父id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    private Integer fatherId;

    // 三级分类vo list
    private List<SubCategoryVO> subCatList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public List<SubCategoryVO> getSubCatList() {
        return subCatList;
    }

    public void setSubCatList(List<SubCategoryVO> subCatList) {
        this.subCatList = subCatList;
    }
}
