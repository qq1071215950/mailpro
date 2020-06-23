package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.mbg.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义优惠券和商品关系关系Dao
 * @author jiange
 * @date 2020/6/23 17:44
 */
public interface SmsCouponProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductRelation> productRelationList);
}

