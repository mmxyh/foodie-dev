package com.imooc.service;

import com.imooc.pojo.UserAddress;
import com.imooc.pojo.bo.AddressBO;

import java.util.List;

/**
 * @Description：
 * @Author: hmm
 * @Date: 2021/8/26
 */
public interface AddressService {
    /**
     * 根据用户Id查询所有收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> queryAll(String userId);

    /**
     * 新增收货地址
     * @param addressBO
     */
    public void addNewUserAddress(AddressBO addressBO);

    /**
     * 用户修改地址
     * @param addressBO
     */
    public void updateUserAddress(AddressBO addressBO);


    /**
     * 根据用户id和地址id，删除对应的用户地址信息
     * @param userId
     * @param addressId
     */
    public void deleteUserAddress(String userId, String addressId);



    /**
     * 修改默认地址
     * @param userId
     * @param addressId
     */
    public void updateUserAddressToBeDefault(String userId, String addressId);


    /**
     * 根据userId 和 addressId，查询具体的用户对象地址信息
     * @param userId
     * @param addressId
     */
    public UserAddress queryUserAddress(String userId, String addressId);
}
