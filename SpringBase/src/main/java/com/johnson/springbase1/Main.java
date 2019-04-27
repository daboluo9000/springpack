package com.johnson.springbase1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig.class);

        UseFunctionService ufs = context.getBean(UseFunctionService.class);
        String world = ufs.SayHello("world");
        System.out.println(world);
        context.close();
    }
}
