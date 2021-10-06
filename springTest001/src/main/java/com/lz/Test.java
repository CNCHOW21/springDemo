package com.lz;

import com.lz.AppConfig;
import com.lz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
//        System.out.println(context.getBean("orderService"));
//        System.out.println(context.getBean("orderService1"));
//        System.out.println(context.getBean("orderService2"));
//        Field[] fields = userService.getClass().getFields();
//         for (Field field : fields) {
//             if(field.isAnnotationPresent(Autowired.class)){
//                 System.out.println(field.getName());
//             }
//        }
    }
}
