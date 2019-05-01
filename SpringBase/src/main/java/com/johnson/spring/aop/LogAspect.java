package com.johnson.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MemberSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.johnson.spring.aop.Advice)")
    public void myPointcut(){}

    @After("myPointcut()")
    public void annotationAspect(JoinPoint joinPoint){
        Signature sig = joinPoint.getSignature();
        MethodSignature mg = (MethodSignature) sig;
//        MemberSignature memg = (MemberSignature) sig;

        System.out.println(mg.getMethod().getName());
        System.out.println(mg.getMethod().getAnnotation(Advice.class));

    }



    @Before("execution(* com.johnson.spring.aop.MethodService.*(..))")
    public void methodAspect(JoinPoint joinPoint){
        MethodSignature mg = (MethodSignature) joinPoint.getSignature();
        System.out.println(mg.getMethod().getName());
    }
}
