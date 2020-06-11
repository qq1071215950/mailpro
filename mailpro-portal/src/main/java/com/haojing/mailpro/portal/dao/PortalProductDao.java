package com.haojing.mailpro.portal.dao;

import com.haojing.mailpro.mbg.model.SmsCoupon;
import com.haojing.mailpro.portal.domain.CartProduct;
import com.haojing.mailpro.portal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台系统自定义商品Dao
 * @author jiange
 * @date 2020/6/11 14:15
 */
public interface PortalProductDao {

    CartProduct getCartProduct(@Param("id") Long id);

    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId")Long productCategoryId);

}
