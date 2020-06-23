package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * @author jiange
 * @date 2020/6/23 16:02
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
