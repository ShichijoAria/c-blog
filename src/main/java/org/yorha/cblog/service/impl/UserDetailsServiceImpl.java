package org.yorha.cblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.yorha.cblog.Entity.UserEntity;
import org.yorha.cblog.dao.UserMapper;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity= userMapper.selectByName(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        System.out.println("s:"+username);
        System.out.println("username:"+userEntity.getUsername()+";password:"+userEntity.getPassword());
        Object obj=userEntity.getAuthorities();
        System.out.println(obj);
        return userEntity;
    }
}
