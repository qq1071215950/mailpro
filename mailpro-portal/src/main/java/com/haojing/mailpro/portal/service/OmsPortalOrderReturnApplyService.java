package com.haojing.mailpro.portal.service;

import com.haojing.mailpro.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * @author jiange
 * @date 2020/6/16 17:11
 */
public interface OmsPortalOrderReturnApplyService {

    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
