package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * 自定义商品管理Dao
 * @author jiange
 * @date 2020/6/23 11:32
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
