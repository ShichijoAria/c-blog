package org.yorha.cblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yorha.cblog.dao.UserMapper;
import org.yorha.cblog.Entity.UserEntity;
import org.yorha.cblog.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
