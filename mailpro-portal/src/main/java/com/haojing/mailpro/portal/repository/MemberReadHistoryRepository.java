package com.haojing.mailpro.portal.repository;

import com.haojing.mailpro.portal.domain.MemberReadHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员商品浏览历史Repository
 * @author jiange
 * @date 2020/6/16 14:46
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {

    Page<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId, Pageable pageable);

}
