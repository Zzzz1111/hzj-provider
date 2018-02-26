package com.huzijun.hzjprovider.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huzijun.hzjprovider.provider.mapper.UserMapper;
import comApi.UserApi;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserApiImp implements UserApi {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(String id) {
        return userMapper.selectUserById(id);
    }
}
