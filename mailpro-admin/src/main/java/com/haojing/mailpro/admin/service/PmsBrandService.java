package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.admin.dto.PmsBrandParam;
import com.haojing.mailpro.mbg.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台品牌管理
 * @author jiange
 * @date 2020/6/23 10:08
 */
public interface PmsBrandService {

    /**
     * 获取所有品牌
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     */
    int createBrand(PmsBrandParam pmsBrandParam);

    /**
     * 修改品牌
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    /**
     * 删除品牌
     */
    int deleteBrand(Long id);

    /**
     * 批量删除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分页查询品牌
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * 获取品牌
     */
    PmsBrand getBrand(Long id);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改厂家制造商状态
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);

}
