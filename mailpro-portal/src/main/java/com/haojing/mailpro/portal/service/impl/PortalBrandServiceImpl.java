package com.haojing.mailpro.portal.service.impl;

import com.github.pagehelper.PageHelper;
import com.haojing.mailpro.common.api.CommonPage;
import com.haojing.mailpro.mbg.mapper.PmsBrandMapper;
import com.haojing.mailpro.mbg.mapper.PmsProductMapper;
import com.haojing.mailpro.mbg.model.PmsBrand;
import com.haojing.mailpro.mbg.model.PmsProduct;
import com.haojing.mailpro.mbg.model.PmsProductExample;
import com.haojing.mailpro.portal.dao.HomeDao;
import com.haojing.mailpro.portal.service.PortalBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页品牌管理
 * @author jiange
 * @date 2020/6/15 10:23
 */
@Service
public class PortalBrandServiceImpl implements PortalBrandService {

    @Autowired
    private HomeDao homeDao;
    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public List<PmsBrand> recommendList(Integer pageNum, Integer pageSize) {
        int offset = (pageNum - 1) * pageSize;
        return homeDao.getRecommendBrandList(offset, pageSize);
    }

    @Override
    public PmsBrand detail(Long brandId) {
        return brandMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andDeleteStatusEqualTo(0)
                .andBrandIdEqualTo(brandId);
        List<PmsProduct> productList = productMapper.selectByExample(example);
        return CommonPage.restPage(productList);
    }
}
