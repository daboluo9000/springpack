package com.johnson.spring.conditions;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:conditions/system.properties")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public IService getWindowsService(){
        return new WindowsService();
    }


    @Bean
    @Conditional(LinuxCondition.class)
    public IService getLinuxService(){
        return new LinuxService();
    }
}
