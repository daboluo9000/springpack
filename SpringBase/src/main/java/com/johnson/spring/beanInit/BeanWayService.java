package com.johnson.spring.beanInit;

public class BeanWayService {

    public void init(){
        System.out.println("@Bean-Init-Method");
    }


    public BeanWayService(){
        super();
        System.out.println("construct BeanWayService");
    }


    public void destroy(){
        System.out.println("@Destroy-Method");
    }
}
