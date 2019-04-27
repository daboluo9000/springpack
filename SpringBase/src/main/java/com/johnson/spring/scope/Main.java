package com.johnson.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        SingleBean sb1 = context.getBean(SingleBean.class);
        SingleBean sb2 = context.getBean(SingleBean.class);

        ProtoType pt1 = context.getBean(ProtoType.class);
        ProtoType pt2 = context.getBean(ProtoType.class);

        System.out.println("single compare:"+(sb1==sb2));
        System.out.println("single compare:"+(pt1==pt2));
    }
}
