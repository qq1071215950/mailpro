package com.haojing.mailpro.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.haojing.mailpro.admin.service.SmsCouponHistoryService;
import com.haojing.mailpro.mbg.mapper.SmsCouponHistoryMapper;
import com.haojing.mailpro.mbg.model.SmsCouponHistory;
import com.haojing.mailpro.mbg.model.SmsCouponHistoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/23 19:20
 */
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {

    @Autowired
    private SmsCouponHistoryMapper historyMapper;
    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if(couponId!=null){
            criteria.andCouponIdEqualTo(couponId);
        }
        if(useStatus!=null){
            criteria.andUseStatusEqualTo(useStatus);
        }
        if(!StringUtils.isEmpty(orderSn)){
            criteria.andOrderSnEqualTo(orderSn);
        }
        return historyMapper.selectByExample(example);
    }
}
