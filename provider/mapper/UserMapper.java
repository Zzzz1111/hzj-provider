package com.huzijun.hzjprovider.provider.mapper;

import entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


public interface UserMapper {
//    @Select("select * from user where id = #{id}")
    User selectUserById(String id);
}
