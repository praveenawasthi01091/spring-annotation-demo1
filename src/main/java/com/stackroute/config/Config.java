package com.stackroute.config;

import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.domain")
public class Config {
    @Bean
    public Actor actor()
    {
        return new Actor("SRK","Male",50);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("Salman","Male",50);
    }

}
