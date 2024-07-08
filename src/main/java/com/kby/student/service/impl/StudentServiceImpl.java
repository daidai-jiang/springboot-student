package com.kby.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kby.student.entity.Student;
import com.kby.student.mapper.StudentMapper;
import com.kby.student.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 16:00
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 通过学号和姓名查询
     *
     * @param stuNo
     * @param stuName
     * @return
     */
    @Override
    public List<Student> queryStudent(Integer stuNo, String stuName) {
        //Student student = new Student();
        //Student stu = Student.builder().studentNo(123456).studentName("aaa").address("456789adsfa").build();

        //new Student().insert();
        //Student.builder().studentNo(stuNo).studentName(stuName).loginPwd("456789").build().insert();

        return studentMapper.queryStudent(stuNo, stuName);

        // 查询条件
        //QueryWrapper<Student> query = new QueryWrapper<>();
        //query.eq("studentNo", stuNo);
        //query.like("studentName", stuName);
        //List<Student> students = studentMapper.selectList(query);
        //return students;

    }

    /**
     * 增加
     *
     * @param student
     * @return
     */
    @Override
    public Boolean add(Student student) {
        //return studentMapper.add(student) == 1;
        return studentMapper.insert(student) == 1;
    }

    /**
     * 删除
     *
     * @param stuNo
     * @return
     */
    @Override
    public Boolean del(Integer stuNo) {
        //return studentMapper.del(stuNo) == 1;
        return studentMapper.deleteById(stuNo) == 1;
    }

    /**
     * 修改
     *
     * @param student
     * @return
     */
    @Override
    public Boolean update(Student student) {
        //return studentMapper.update(student) == 1;
        return studentMapper.updateById(student) == 1;
    }

    /**
     * 查询列表，带分页
     *
     * @param stuNo
     * @param stuName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Student> queryPage(Integer stuNo, String stuName, Integer pageNum, Integer pageSize) {
        // 计算分页开始的下标
        //Integer index = (pageNum - 1) * pageSize;
        // 查询每页要展示的数据
        //List<Student> students = studentMapper.queryPage(stuNo, stuName, index, pageSize);

        // 查询出总条数
        //int totalCount = studentMapper.getTotalCount(stuNo, stuName);

        // 计算出总页数
        //int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;

        //Page<Student> page = new Page<>();
        //page.setPageNum(pageNum);
        //page.setPageSize(pageSize);
        //page.setTotalCount(totalCount);
        //page.setTotalPage(totalPage);
        //page.setList(students);
        //return page;

        // 开始分页
        PageHelper.startPage(pageNum, pageSize);
        List<Student> students = studentMapper.queryStudent(stuNo, stuName);

        return new PageInfo<>(students);

    }


}
