package com.haojing.mailpro.portal.repository;

import com.haojing.mailpro.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员关注Repository
 * @author jiange
 * @date 2020/6/16 14:11
 */
public interface MemberBrandAttentionRepository  extends MongoRepository<MemberBrandAttention,String> {


    /**
     * 查询关注品牌
     * @param memberId
     * @param brandId
     * @return
     */
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 删除关注的品牌
     * @param memberId
     * @param brandId
     * @return
     */
    int deleteByMemberIdAndBrandId(Long memberId,Long brandId);

    /**
     * 分页查询关注的品牌
     * @param memberId
     * @param pageable
     * @return
     */
    Page<MemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);

}
