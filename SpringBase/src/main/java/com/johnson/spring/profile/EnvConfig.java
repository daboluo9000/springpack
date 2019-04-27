package com.johnson.spring.profile;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.johnson.spring.profile")
public class EnvConfig {

    @Bean
    @Profile("dev")
    public EnvBean getEnv(){
        return new EnvBean("this is dev env");
    }

    @Bean
    @Profile("prod")
    public EnvBean getProdEnv(){
        return new EnvBean("this is prod env");
    }


}
