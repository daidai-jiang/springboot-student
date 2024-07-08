package com.kby.student.controller;

import com.kby.student.entity.User;
import com.kby.student.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 14:09
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 登录
     *
     * @param user
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean login(@RequestBody User user) {
        return userService.login(user.getUsername(), user.getPassword());
    }


}
