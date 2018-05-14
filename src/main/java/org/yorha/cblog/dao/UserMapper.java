package org.yorha.cblog.dao;

import org.yorha.cblog.Entity.UserEntity;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    UserEntity selectByName(String name);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}