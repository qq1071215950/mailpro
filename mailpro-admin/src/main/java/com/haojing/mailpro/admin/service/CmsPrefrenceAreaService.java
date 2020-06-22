package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.mbg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区Service
 * @author jiange
 * @date 2020/6/22 20:06
 */
public interface CmsPrefrenceAreaService {

    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
