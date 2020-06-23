package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.mbg.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品和专题关系操作Dao
 * @author jiange
 * @date 2020/6/23 11:29
 */
public interface CmsSubjectProductRelationDao {


    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
