package com.example.demo.config;

import com.example.demo.aop.WriteLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class AopConfig {
    @Bean
    public WriteLog writeLog(){
        return new WriteLog();
    }
}
