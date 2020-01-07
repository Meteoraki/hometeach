package com.mybatis.demo.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.demo.demo.dao.AdminMapper;
import com.mybatis.demo.demo.dao.StudentMapper;
import com.mybatis.demo.demo.dao.TeacherMapper;
import com.mybatis.demo.demo.model.Admin;
import com.mybatis.demo.demo.model.Student;
import com.mybatis.demo.demo.model.Teacher;
import com.mybatis.demo.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘佳昇
 * @Date 2020/1/7 21:16
 */

@Service
public class LoginService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    AdminMapper adminMapper;

    public Result login(String userName,String password){
        Admin admin = new Admin();
        Student student = new Student();
        Teacher teacher = new Teacher();
        admin.setAdminName(userName);
        admin.setAdminPassword(password);

        student.setStudentName(userName);
        student.setStudentPassword(password);

        teacher.setTeacherName(userName);
        teacher.setTeacherPassword(password);

        Student baseStudent  = studentMapper.selectByUserNameAndPassword(student);

        Admin baseAdmin = adminMapper.selectByNameAndPsd(admin);

        Teacher baseTeacher = teacherMapper.selectByNameAndPsd(teacher);


        //flag 用来判断用户身份
        if (baseStudent != null){
            JSONObject res = new JSONObject();
            res.put("flag",1);
            res.put("student",baseStudent);
            return Result.createSuccessResult(res);
        }else if (baseTeacher != null){
            JSONObject res = new JSONObject();
            res.put("flag",2);
            res.put("teacher",baseTeacher);
            return Result.createSuccessResult(res);
        }else if (baseAdmin != null){
            JSONObject res = new JSONObject();
            res.put("flag",3);
            res.put("admin",baseAdmin);
            return Result.createSuccessResult(res);
        }else {
            return Result.createByFailure("登录失败没有用户");
        }
    }
}
