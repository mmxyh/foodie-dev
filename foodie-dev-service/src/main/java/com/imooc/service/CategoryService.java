package com.imooc.service;

import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;

import java.util.List;

/**
 * @Description：
 * @Author: hmm
 * @Date: 2021/7/19
 */
public interface CategoryService {

    /**
     * 查询所有一级分类
     * @return
     */
    public List<Category> queryAllRootLevelCat();

    /**
     * 根据一级分类id查询子分类信息
     * @param rootCatId
     * @return
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);


    /**
     * 查询首页每个一级分类6条商品数据
     * @param rootCatId
     * @return
     */
    public List<NewItemsVO> getSixNewItemLazy(Integer rootCatId);
}
