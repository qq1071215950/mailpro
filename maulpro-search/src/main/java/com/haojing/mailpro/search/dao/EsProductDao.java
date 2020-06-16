package com.haojing.mailpro.search.dao;

import com.haojing.mailpro.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * @author jiange
 * @date 2020/6/16 17:33
 */
public interface EsProductDao {

    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
