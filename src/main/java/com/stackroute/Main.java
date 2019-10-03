package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = applicationContext.getBean(Movie.class);
        System.out.println(movie);
        System.out.println(applicationContext.getBean(Movie.class)==applicationContext.getBean(Movie.class));
    }
}
