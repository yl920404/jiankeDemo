package com.jianke.jiankedataaccess.dao;

import com.jianke.jiankedataaccess.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 根据id获取用户信息
     * @param userId
     * @return
     */
    @Select("select id,user_name as userName ,password ,email from user where id = #{userId}")
    User getUserById(Integer userId);

    /**
     * 根据主键获取用户信息
     * @param userId
     * @return
     */
    User getUserByKey(@Param("userId") Integer userId);
}
