package com.johnson.spring.springbase2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FuncConfig.class);

        UseFunctionService usf = context.getBean(UseFunctionService.class);

        System.out.println(usf.SayHi("World"));

        context.close();
    }
}
