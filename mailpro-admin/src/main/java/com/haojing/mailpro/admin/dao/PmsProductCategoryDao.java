package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 *商品分类自定义Dao
 * @author jiange
 * @date 2020/6/23 10:28
 */
public interface PmsProductCategoryDao {

    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
