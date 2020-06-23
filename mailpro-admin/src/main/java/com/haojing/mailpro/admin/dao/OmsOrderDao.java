package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.admin.dto.OmsOrderDeliveryParam;
import com.haojing.mailpro.admin.dto.OmsOrderDetail;
import com.haojing.mailpro.admin.dto.OmsOrderQueryParam;
import com.haojing.mailpro.mbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 * @author jiange
 * @date 2020/6/23 16:12
 */
public interface OmsOrderDao {

    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
