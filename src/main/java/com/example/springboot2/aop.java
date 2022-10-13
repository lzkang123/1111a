package com.example.springboot2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aop
{
    @Pointcut("execution(* Mapper.StudentMapper.*(..))")
    public void pt(){};

    @Around("pt()")
    public Object a1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object ob;
        System.out.println("========前");
        ob=proceedingJoinPoint.proceed();
        System.out.println("========后");
        return ob;
    }
}
