package com.haojing.mailpro.admin.service.impl;

import com.haojing.mailpro.admin.service.OmsOrderSettingService;
import com.haojing.mailpro.mbg.mapper.OmsOrderSettingMapper;
import com.haojing.mailpro.mbg.model.OmsOrderSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiange
 * @date 2020/6/23 17:38
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}