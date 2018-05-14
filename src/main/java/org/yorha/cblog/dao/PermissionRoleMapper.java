package org.yorha.cblog.dao;

import org.yorha.cblog.Entity.PermissionRoleEntity;

public interface PermissionRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionRoleEntity record);

    int insertSelective(PermissionRoleEntity record);

    PermissionRoleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionRoleEntity record);

    int updateByPrimaryKey(PermissionRoleEntity record);
}