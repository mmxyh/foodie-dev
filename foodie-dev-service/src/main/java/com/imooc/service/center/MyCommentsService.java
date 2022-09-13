package com.imooc.service.center;

import com.imooc.pojo.OrderItems;
import com.imooc.pojo.bo.center.OrderItemsCommentBO;
import com.imooc.utils.PagedGridResult;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @author: hmm
 * @date: 2022/3/8
 */
public interface MyCommentsService {
    /**
     * 根据订单id查询管理的商品
     *
     * @param orderId
     * @return
     */
    List<OrderItems> queryPendingComment(String orderId);

    /**
     * 保存评价
     *
     * @param userId
     * @param orderId
     * @param commentList
     * @return
     */
    void saveComments(String userId, String orderId, List<OrderItemsCommentBO> commentList);

    /**
     * 查询我的评价列表
     * @param userId
     * @param page
     * @param pageSize
     * @return
     */
    PagedGridResult queryMyComments(String userId, Integer page, Integer pageSize);
}
