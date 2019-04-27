package com.johnson.spring.EL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = context.getBean(ELConfig.class);
        elConfig.getResources();


    }
}
