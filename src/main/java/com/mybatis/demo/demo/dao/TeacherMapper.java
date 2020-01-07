package com.mybatis.demo.demo.dao;

import com.mybatis.demo.demo.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int deleteByPrimaryKey(Integer teacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    Teacher selectByPrimaryKey(Integer teacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int updateByPrimaryKey(Teacher record);

    Teacher selectByNameAndPsd(Teacher teacher);
}