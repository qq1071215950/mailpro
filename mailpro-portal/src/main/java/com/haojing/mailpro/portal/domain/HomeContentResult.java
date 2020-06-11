package com.haojing.mailpro.portal.domain;

import com.haojing.mailpro.mbg.model.CmsSubject;
import com.haojing.mailpro.mbg.model.PmsBrand;
import com.haojing.mailpro.mbg.model.PmsProduct;
import com.haojing.mailpro.mbg.model.SmsHomeAdvertise;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 首页内容返回信息封装
 * @author jiange
 * @date 2020/6/11 10:42
 */
@Setter
@Getter
public class HomeContentResult {
    //轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //推荐品牌
    private List<PmsBrand> brandList;
    //当前秒杀场次
    private HomeFlashPromotion homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
    //推荐专题
    private List<CmsSubject> subjectList;
}
