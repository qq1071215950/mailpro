package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.admin.dto.OmsOrderReturnApplyResult;
import com.haojing.mailpro.admin.dto.OmsReturnApplyQueryParam;
import com.haojing.mailpro.admin.dto.OmsUpdateStatusParam;
import com.haojing.mailpro.mbg.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 * @author jiange
 * @date 2020/6/23 17:01
 */
public interface OmsOrderReturnApplyService {

    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}

