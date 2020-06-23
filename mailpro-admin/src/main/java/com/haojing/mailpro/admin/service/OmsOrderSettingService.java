package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.OmsOrderSetting;

/**
 * 订单设置Service
 * @author jiange
 * @date 2020/6/23 17:37
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
