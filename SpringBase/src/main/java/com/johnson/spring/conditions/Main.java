package com.johnson.spring.conditions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        IService is = context.getBean(IService.class);
        is.service();
        context.close();
    }
}
