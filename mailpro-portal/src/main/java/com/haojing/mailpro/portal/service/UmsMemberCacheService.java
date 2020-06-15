package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.mbg.model.UmsMember;

/**
 * 会员信息缓存业务类
 * @author jiange
 * @date 2020/6/15 10:46
 */
public interface UmsMemberCacheService {

    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(String username);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);

    /**
     * 设置验证码
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);

}
