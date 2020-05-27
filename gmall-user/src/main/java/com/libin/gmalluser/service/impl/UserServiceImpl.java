package com.libin.gmalluser.service.impl;

import com.libin.gmalluser.mapper.UserMapper;
import com.libin.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by libin on 2020/5/27
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
