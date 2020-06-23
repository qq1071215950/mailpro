package com.haojing.mailpro.admin.service.impl;

import com.haojing.mailpro.admin.service.OmsCompanyAddressService;
import com.haojing.mailpro.mbg.mapper.OmsCompanyAddressMapper;
import com.haojing.mailpro.mbg.model.OmsCompanyAddress;
import com.haojing.mailpro.mbg.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/23 16:02
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {

    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
