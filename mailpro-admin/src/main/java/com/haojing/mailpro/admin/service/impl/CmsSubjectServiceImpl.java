package com.haojing.mailpro.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.haojing.mailpro.admin.service.CmsSubjectService;
import com.haojing.mailpro.mbg.mapper.CmsSubjectMapper;
import com.haojing.mailpro.mbg.model.CmsSubject;
import com.haojing.mailpro.mbg.model.CmsSubjectExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/22 20:13
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
