package com.kby.student.service.impl;

import com.kby.student.entity.User;
import com.kby.student.mapper.UserMapper;
import com.kby.student.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 14:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Boolean login(String username, String password) {
        User user = userMapper.queryUserByName(username);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }
        return false;
    }


}
