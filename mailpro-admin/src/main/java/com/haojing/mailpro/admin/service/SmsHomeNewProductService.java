package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.SmsHomeNewProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 新品管理
 * @author jiange
 * @date 2020/6/24 10:23
 */
public interface SmsHomeNewProductService {

    /**
     * 添加首页推荐
     */
    @Transactional
    int create(List<SmsHomeNewProduct> homeNewProductList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
