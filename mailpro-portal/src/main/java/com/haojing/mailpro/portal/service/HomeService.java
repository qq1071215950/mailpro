package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.mbg.model.CmsSubject;
import com.haojing.mailpro.mbg.model.PmsProduct;
import com.haojing.mailpro.mbg.model.PmsProductCategory;
import com.haojing.mailpro.portal.domain.HomeContentResult;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/11 10:41
 */
public interface HomeService {

    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 首页商品推荐
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * 获取商品分类
     * @param parentId 0:获取一级分类；其他：获取指定二级分类
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 根据专题分类分页获取专题
     * @param cateId 专题分类id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);

    /**
     * 分页获取人气推荐商品
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * 分页获取新品推荐商品
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);

}
