package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.mbg.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品满减Dao
 * @author jiange
 * @date 2020/6/23 11:25
 */
public interface PmsProductFullReductionDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
