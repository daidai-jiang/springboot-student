package com.kby.student.controller;

import com.github.pagehelper.PageInfo;
import com.kby.student.common.Result;
import com.kby.student.entity.Student;
import com.kby.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 15:55
 */
@RequestMapping("/stu")
@RestController
public class StudentController {


    @Resource
    private StudentService studentService;

    /**
     * 查询学生列表
     *
     * @param studentNo
     * @param studentName
     * @return
     */
    //@RequestMapping(value = "/query", method = RequestMethod.GET)
    @GetMapping("/query")
    public Result<List<Student>> queryStudent(@RequestParam(value = "stuNo", required = false) Integer studentNo,
                                              @RequestParam(value = "stuName", required = false) String studentName) {
        //return studentService.queryStudent(studentNo, studentName);
        return new Result<List<Student>>().success(studentService.queryStudent(studentNo, studentName));
    }

    /**
     * 查询列表数据，带分页
     *
     * @param studentNo
     * @param studentName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/query/page", method = RequestMethod.GET)
    public PageInfo<Student> queryPage(@RequestParam(value = "stuNo", required = false) Integer studentNo,
                                       @RequestParam(value = "stuName", required = false) String studentName,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                       @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return studentService.queryPage(studentNo, studentName, pageNum, pageSize);
    }

    /**
     * 增加
     *
     * @param student
     * @return
     */
    //@RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public Boolean add(@RequestBody Student student) {
        return studentService.add(student);
    }

    /**
     * 删除
     *
     * @param studentNo
     * @return
     */
    //@RequestMapping(value = "/del/{stuNo}", method = RequestMethod.DELETE)
    @DeleteMapping("/del/{stuNo}")
    public Boolean del(@PathVariable("stuNo") Integer studentNo) {
        return studentService.del(studentNo);
    }

    /**
     * 修改
     *
     * @param student
     * @return
     */
    //@RequestMapping(value = "update", method = RequestMethod.PUT)
    @PutMapping("/update")
    public Boolean update(@RequestBody Student student) {
        return studentService.update(student);
    }

}
