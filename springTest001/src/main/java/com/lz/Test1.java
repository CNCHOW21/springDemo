package com.lz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 切面
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        UserService1 userService = (UserService1) context.getBean("userService1");
        userService.test();
    }
}
