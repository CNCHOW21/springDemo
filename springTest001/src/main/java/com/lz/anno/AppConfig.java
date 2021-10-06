package com.lz.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lz")
public class AppConfig {

    @Bean
    public OrderService orderService1(){
        return new OrderService();
    }
//
//    @Bean
//    public OrderService orderService2(){
//        return new OrderService();
//    }
}
