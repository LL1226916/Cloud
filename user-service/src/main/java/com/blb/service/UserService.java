package com.blb.service;

import com.blb.mapper.UserMapper;
import com.blb.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserInfo queryUserByid(Long i) {
        return userMapper.selectByPrimaryKey(i);
    }

}
