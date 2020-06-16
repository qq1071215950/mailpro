package com.haojing.mailpro.portal.service.impl;

import com.haojing.mailpro.mbg.mapper.OmsOrderReturnApplyMapper;
import com.haojing.mailpro.mbg.model.OmsOrderReturnApply;
import com.haojing.mailpro.portal.domain.OmsOrderReturnApplyParam;
import com.haojing.mailpro.portal.service.OmsPortalOrderReturnApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 * @author jiange
 * @date 2020/6/16 17:12
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
