package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 自定义优惠券管理Dao
 * @author jiange
 * @date 2020/6/23 17:47
 */
public interface SmsCouponDao {

    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
