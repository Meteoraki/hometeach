package com.mybatis.demo.demo.service;

import com.mybatis.demo.demo.model.User;
import com.mybatis.demo.demo.util.Result;
import org.springframework.stereotype.Service;


public interface UserService {
    Result hasUser(User user);
}
