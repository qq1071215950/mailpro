package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 * @author jiange
 * @date 2020/6/23 15:22
 */
public interface PmsProductAttributeCategoryDao {

    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
