package com.haojing.mailpro.portal.dao;

import com.haojing.mailpro.portal.domain.SmsCouponHistoryDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员优惠券领取历史自定义Dao
 * @author jiange
 * @date 2020/6/16 10:09
 */
public interface SmsCouponHistoryDao {

    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);

}
