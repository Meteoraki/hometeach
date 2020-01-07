package com.mybatis.demo.demo.service.impl;

import com.mybatis.demo.demo.dao.UserMapper;
import com.mybatis.demo.demo.model.User;
import com.mybatis.demo.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

//    @Autowired
//    UserMapper userMapper;
//
//    Result hasUser(User user){
//        User baseUser  = userMapper.selectUserByUserNameAndPassword(user);
//        if(baseUser!=null){
//            return Result.createSuccessResult(user);
//        }else{
//            return Result.createByFailure("用户名或密码错误");
//        }
//    }
}
