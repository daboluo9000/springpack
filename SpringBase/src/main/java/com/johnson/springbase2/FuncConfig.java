package com.johnson.springbase2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FuncConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService usf = new UseFunctionService();
        usf.setFs(functionService());
        return usf;
    }

    @Bean UseFunctionService useFunctionService(FunctionService fs){
        UseFunctionService usf = new UseFunctionService();
        usf.setFs(fs);
        return usf;
    }
}
