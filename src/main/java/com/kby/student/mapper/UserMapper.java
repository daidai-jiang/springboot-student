package com.kby.student.mapper;

import com.kby.student.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 14:13
 */
public interface UserMapper {

    /**
     * 通过用户名查询用户
     *
     * @param username
     * @return
     */
    User queryUserByName(@Param("username") String username);


}
