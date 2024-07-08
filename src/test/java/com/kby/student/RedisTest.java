package com.kby.student;

import com.kby.student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/7/8 15:17
 */
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    //@Resource
    //private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        Student zhangSan = Student.builder().studentNo(10000).studentName("张三").phone("13212345678").build();
        redisTemplate.opsForValue().set("zs", zhangSan);

        System.out.println(redisTemplate.opsForValue().get("zs"));
    }

}
