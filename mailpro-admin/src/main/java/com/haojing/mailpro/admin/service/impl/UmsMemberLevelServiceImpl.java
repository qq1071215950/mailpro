package com.haojing.mailpro.admin.service.impl;

import com.haojing.mailpro.admin.service.UmsMemberLevelService;
import com.haojing.mailpro.mbg.mapper.UmsMemberLevelMapper;
import com.haojing.mailpro.mbg.model.UmsMemberLevel;
import com.haojing.mailpro.mbg.model.UmsMemberLevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理
 * @author jiange
 * @date 2020/6/19 17:23
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
