package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Actor getActor1()
    {
        return new Actor("SRK","Male",50);
    }

    @Bean
    public Actor getActor2()
    {
        return new Actor("Salman","Male",45);
    }

    @Bean(name = "movie1")
    public Movie getMovie1()
    {
        return new Movie(getActor1());
    }

    @Bean(name = "movie2")
    public Movie getMovie2()
    {
        return new Movie(getActor2());
    }

}
