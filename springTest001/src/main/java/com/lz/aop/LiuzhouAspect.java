package com.lz.aop;

import com.lz.aop.UserService1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LiuzhouAspect {

    @Before("execution(public void com.lz.aop.UserService1.test())")
    public void liuzhouBefore(JoinPoint joinPoint){
        UserService1 userService1 = (UserService1)joinPoint.getTarget();
        System.out.println("liuzhouBefore");
    }

}
