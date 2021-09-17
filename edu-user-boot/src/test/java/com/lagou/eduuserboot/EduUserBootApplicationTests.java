package com.lagou.eduuserboot;

import com.lagou.eduuserboot.mapper.UserMapper;
import com.lagou.eduuserboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EduUserBootApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @Test
    void contextLoads() {

    }


}
