package com.kby.student.entity;

import lombok.ToString;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 14:08
 */
@ToString
public class User {

    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
