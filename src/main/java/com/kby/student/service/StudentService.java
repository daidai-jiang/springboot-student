package com.kby.student.service;

import com.github.pagehelper.PageInfo;
import com.kby.student.entity.Student;

import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 15:59
 */
public interface StudentService {

    /**
     * 通过学与和姓名查询学生
     *
     * @param stuNo
     * @param stuName
     * @return
     */
    List<Student> queryStudent(Integer stuNo, String stuName);

    /**
     * 增加
     *
     * @param student
     * @return
     */
    Boolean add(Student student);

    /**
     * 删除
     *
     * @param stuNo
     * @return
     */
    Boolean del(Integer stuNo);

    /**
     * 修改
     *
     * @param student
     * @return
     */
    Boolean update(Student student);

    /**
     * 查询列表，带分页
     *
     * @param stuNo
     * @param stuName
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Student> queryPage(Integer stuNo, String stuName, Integer pageNum, Integer pageSize);

}
