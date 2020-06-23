package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.mbg.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义会员阶梯价格Dao
 * @author jiange
 * @date 2020/6/23 11:19
 */
public interface PmsProductLadderDao {

    int insertList(@Param("list") List<PmsProductLadder> productLadderList);

}
