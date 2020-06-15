package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.common.api.CommonPage;
import com.haojing.mailpro.mbg.model.PmsBrand;
import com.haojing.mailpro.mbg.model.PmsProduct;

import java.util.List;

/**
 * 首页品牌管理
 * @author jiange
 * @date 2020/6/15 10:22
 */
public interface PortalBrandService {

    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);

}
