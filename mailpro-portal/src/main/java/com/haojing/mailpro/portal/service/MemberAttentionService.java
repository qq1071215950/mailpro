package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;

/**
 * 会员品牌关注管理
 * @author jiange
 * @date 2020/6/16 14:08
 */
public interface MemberAttentionService {

    /**
     * 添加关注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long brandId);

    /**
     * 获取用户关注列表
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

}
