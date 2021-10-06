package com.lz.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 事务
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        UserService2 userService = (UserService2) context.getBean("userService2");
        userService.test();
    }
}
