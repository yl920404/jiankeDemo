package com.jianke.jiankeservice.service.impl;

import com.jianke.jiankedataaccess.dao.UserMapper;
import com.jianke.jiankedataaccess.entity.User;
import com.jianke.jiankeservice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 查询用户名
     *
     * @param userId
     * @return
     * @author yanglei
     */
    @Override
    public String getUserNameById(Integer userId) {
        if (null == userId) {
            return "用户id不能为空!";
        }
        User user = userMapper.getUserByKey(userId);
        return null == user ? null : user.getUserName();
    }
}
