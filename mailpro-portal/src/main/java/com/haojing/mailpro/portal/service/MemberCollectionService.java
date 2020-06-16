package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

/**
 * 会员收藏Service
 * @author jiange
 * @date 2020/6/16 14:21
 */
public interface MemberCollectionService {

    /**
     * 添加到收藏
     * @param productCollection
     * @return
     */
    int add(MemberProductCollection productCollection);

    /**
     * 取消收藏
     * @param productId
     * @return
     */
    int delete(Long productId);

    /**
     * 分页查询收藏列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);
}
