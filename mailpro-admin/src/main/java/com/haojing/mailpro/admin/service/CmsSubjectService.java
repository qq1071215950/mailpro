package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.CmsSubject;

import java.util.List;

/**
 * 商品专题Service
 * @author jiange
 * @date 2020/6/22 20:12
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);

}
