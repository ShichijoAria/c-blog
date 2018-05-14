package org.yorha.cblog.dao;

import org.yorha.cblog.Entity.PermissionEntity;

import java.util.List;

public interface PermissionMapper {

    List<PermissionEntity> findByAdminUserId(long userId);

    List<PermissionEntity> findAll();

    int deleteByPrimaryKey(Long id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}