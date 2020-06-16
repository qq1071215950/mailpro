package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.mbg.model.OmsCartItem;
import com.haojing.mailpro.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/16 10:18
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);

}
