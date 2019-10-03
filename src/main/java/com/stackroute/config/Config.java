package com.stackroute.config;

import com.stackroute.demo.BeanPostProcessorDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.demo")
public class Config {

   @Bean
    public BeanPostProcessorDemo beanPostProcessor()
    {
        return new BeanPostProcessorDemo();
    };

}
