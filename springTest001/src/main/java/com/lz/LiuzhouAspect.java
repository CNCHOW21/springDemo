package com.lz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LiuzhouAspect {

    @Before("execution(public void com.lz.UserService1.test())")
    public void liuzhouBefore(JoinPoint joinPoint){
        UserService1 userService1 = (UserService1)joinPoint.getTarget();
        System.out.println("liuzhouBefore");
    }

}
