package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.OmsOrderReturnApplyResult;
import com.haojing.mailpro.admin.dto.OmsReturnApplyQueryParam;
import com.haojing.mailpro.mbg.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *订单退货申请自定义Dao
 * @author jiange
 * @date 2020/6/23 17:03
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
