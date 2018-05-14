package org.yorha.cblog.service;

import org.yorha.cblog.Entity.UserEntity;

public interface UserService {

    UserEntity selectByPrimaryKey(Long id);
}
