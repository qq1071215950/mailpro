package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理
 * @author jiange
 * @date 2020/6/19 17:22
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
