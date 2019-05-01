package com.johnson.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAnnotationConfig.class);
        MyAnnotationService myAnnotationService = context.getBean(MyAnnotationService.class);
        myAnnotationService.myAnnottationMethod();
    }
}
