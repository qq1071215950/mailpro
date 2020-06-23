package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.SmsFlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义限时购商品关系管理Dao
 * @author jiange
 * @date 2020/6/23 19:41
 */
public interface SmsFlashPromotionProductRelationDao {
    /**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
