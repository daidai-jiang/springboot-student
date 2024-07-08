package com.kby.student.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kby.student.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 16:00
 */
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * 通过学号和姓名查询
     *
     * @param stuNo
     * @param stuName
     * @return
     */
    List<Student> queryStudent(@Param("stuNo") Integer stuNo, @Param("stuName") String stuName);

    /**
     * 增加
     *
     * @param student
     * @return
     */
    //int add(@Param("stu") Student student);

    /**
     * 删除
     *
     * @param stuNo
     * @return
     */
    //int del(@Param("stuNo") Integer stuNo);

    /**
     * 修改
     *
     * @param student
     * @return
     */
    //int update(@Param("stu") Student student);

    /**
     * 查询数据，带分页
     *
     * @param stuNo
     * @param stuName
     * @param index
     * @param pageSize
     * @return
     */
    //List<Student> queryPage(@Param("stuNo") Integer stuNo, @Param("stuName") String stuName, @Param("index") Integer index, @Param("pageSize") Integer pageSize);

    /**
     * 获取总条数
     *
     * @param stuNo
     * @param stuName
     * @return
     */
    //int getTotalCount(@Param("stuNo") Integer stuNo, @Param("stuName") String stuName);


}
