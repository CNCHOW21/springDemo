package com.lz;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService implements InitializingBean {

    @Autowired
    private OrderService orderService;

    @Autowired
    private User admin;

//    public UserService(){
//        System.out.println("无参构造方法");
//    }


    public UserService(OrderService orderService1){
        System.out.println("有参构造方法1");
    }

//    @Autowired
//    public UserService(OrderService orderService1,OrderService orderService){
//        System.out.println("有参构造方法2");
//    }

    public void test(){
        System.out.println(admin);
    }

    public void getUser(){
        System.out.println(admin.getName());
    }


    @PostConstruct
    public void setUser(){
        System.out.println("初始化前");
        admin.setName("2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
        admin.setName("1");
    }
}
