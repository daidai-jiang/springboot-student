package com.kby.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kby.student.mapper")
public class SpringbootStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentApplication.class, args);
    }

}
