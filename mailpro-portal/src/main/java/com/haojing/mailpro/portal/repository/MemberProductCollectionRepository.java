package com.haojing.mailpro.portal.repository;

import com.haojing.mailpro.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 商品收藏Repository
 * @author jiange
 * @date 2020/6/16 14:24
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection,String> {

    /**
     * @param memberId
     * @param productId
     * @return
     */
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 取消收藏
     * @param memberId
     * @param productId
     * @return
     */
    int deleteByMemberIdAndProductId(Long memberId,Long productId);

    /**
     * 分页查询收藏列表
     * @param memberId
     * @param pageable
     * @return
     */
    Page<MemberProductCollection> findByMemberId(Long memberId, Pageable pageable);
}
