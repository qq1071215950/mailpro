package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.UmsResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理Service
 * @author jiange
 * @date 2020/6/19 18:47
 */
public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);

}
