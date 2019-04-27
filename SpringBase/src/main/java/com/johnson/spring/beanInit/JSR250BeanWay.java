package com.johnson.spring.beanInit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250BeanWay {

    @PostConstruct
    public void init(){
        System.out.println("#jsr250-INIT-METHOD");
    }

    public JSR250BeanWay(){
        super();
        System.out.println("Construct-JSR250");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy");
    }
}


