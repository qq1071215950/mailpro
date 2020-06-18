package com.haojing.mailpro.admin.dao;

import com.haojing.mailpro.mbg.model.UmsMenu;
import com.haojing.mailpro.mbg.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义角色dao
 * @author jiange
 * @date 2020/6/18 11:31
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
