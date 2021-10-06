package com.lz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.lz")
public class AppConfig1 {

//    @Bean
//    public OrderService orderService1(){
//        return new OrderService();
//    }
//
//    @Bean
//    public OrderService orderService2(){
//        return new OrderService();
//    }
}
