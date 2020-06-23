package com.haojing.mailpro.admin.service.impl;

import com.haojing.mailpro.admin.dao.PmsSkuStockDao;
import com.haojing.mailpro.admin.service.PmsSkuStockService;
import com.haojing.mailpro.mbg.mapper.PmsSkuStockMapper;
import com.haojing.mailpro.mbg.model.PmsSkuStock;
import com.haojing.mailpro.mbg.model.PmsSkuStockExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品sku库存管理Service实现类
 * @author jiange
 * @date 2020/6/23 14:07
 */
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService {
    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsSkuStockDao skuStockDao;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockDao.replaceList(skuStockList);
    }

}
