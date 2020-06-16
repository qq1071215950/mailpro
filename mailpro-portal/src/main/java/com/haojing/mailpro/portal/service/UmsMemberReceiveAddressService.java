package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.mbg.model.UmsMemberReceiveAddress;

import java.util.List;

/**
 * 用户地址管理Service
 * @author jiange
 * @date 2020/6/16 13:53
 */
public interface UmsMemberReceiveAddressService {

    /**
     * 添加收货地址
     */
    int add(UmsMemberReceiveAddress address);

    /**
     * 删除收货地址
     * @param id 地址表的id
     */
    int delete(Long id);

    /**
     * 修改收货地址
     * @param id 地址表的id
     * @param address 修改的收货地址信息
     */
    int update(Long id, UmsMemberReceiveAddress address);

    /**
     * 返回当前用户的收货地址
     */
    List<UmsMemberReceiveAddress> list();

    /**
     * 获取地址详情
     * @param id 地址id
     */
    UmsMemberReceiveAddress getItem(Long id);
}
