package com.example.mycatdemo;

import com.example.mycatdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MycatDemoApplicationTests {
  @Autowired private UserService userService;

  @Test
  public void contextLoads() {}

  @Test
  public void testUser() {
    userService.testUser();
  }
}
