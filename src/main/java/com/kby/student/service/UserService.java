package com.kby.student.service;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 14:11
 */
public interface UserService {

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    Boolean login(String username, String password);


}
