package com.kby.student.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.beans.Transient;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 15:55
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student extends Model<Student> {

    @TableId(type = IdType.NONE)
    private Integer studentNo;

    // student_no

    //@TableField("studentName")
    private String studentName;

    private String loginPwd;

    private String sex;

    private Integer gradeId;

    @TableField(exist = false)
    private String gradeName;

    private String phone;

    private String address;

    //@TableLogic
    //private Boolean isDelete;


}
