package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.mbg.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品审核日志管理Dao
 * @author jiange
 * @date 2020/6/23 11:36
 */
public interface PmsProductVertifyRecordDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
