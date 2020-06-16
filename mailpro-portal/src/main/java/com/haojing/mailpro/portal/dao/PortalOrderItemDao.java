package com.haojing.mailpro.portal.dao;

import com.haojing.mailpro.mbg.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  前台订单自定义Dao
 * @author jiange
 * @date 2020/6/16 15:38
 */
public interface PortalOrderItemDao {

    int insertList(@Param("list") List<OmsOrderItem> list);

}
