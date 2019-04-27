package com.johnson.spring.beanInit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.johnson.spring.beanInit")
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService getBeanWay(){
        return new BeanWayService();
    }

    @Bean
    public JSR250BeanWay getJSR250(){
        return new JSR250BeanWay();
    }

}
