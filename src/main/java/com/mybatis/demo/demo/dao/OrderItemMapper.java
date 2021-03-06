package com.mybatis.demo.demo.dao;

import com.mybatis.demo.demo.model.OrderItem;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderitem
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderitem
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderitem
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderitem
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    OrderItem selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderitem
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_orderitem
     *
     * @mbggenerated Tue Jan 07 21:15:34 CST 2020
     */
    int updateByPrimaryKey(OrderItem record);
}