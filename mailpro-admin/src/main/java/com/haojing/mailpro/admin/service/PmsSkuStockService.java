package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.PmsSkuStock;

import java.util.List;

/**
 * sku商品库存管理Service
 * @author jiange
 * @date 2020/6/23 14:06
 */
public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
