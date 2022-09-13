package com.imooc.service;

import com.imooc.pojo.Carousel;

import java.util.List;

/**
 * @Description：
 * @Author: hmm
 * @Date: 2021/7/19
 */
public interface CarouselService {

    /**
     * 查询所有轮播图
     * @param isShow
     * @return
     */
    public List<Carousel> queryAll(Integer isShow);
}
