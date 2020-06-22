package com.haojing.mailpro.admin.service.impl;

import com.haojing.mailpro.admin.service.CmsPrefrenceAreaService;
import com.haojing.mailpro.mbg.mapper.CmsPrefrenceAreaMapper;
import com.haojing.mailpro.mbg.model.CmsPrefrenceArea;
import com.haojing.mailpro.mbg.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/22 20:06
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;
    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
