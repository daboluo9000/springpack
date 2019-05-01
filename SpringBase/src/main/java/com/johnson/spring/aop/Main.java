package com.johnson.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        AnnotationService as = context.getBean(AnnotationService.class);
        as.annotationMethod();

        MethodService methodService = context.getBean(MethodService.class);
        methodService.methodMethod();
    }
}