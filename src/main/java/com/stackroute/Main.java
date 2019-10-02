package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {

        /* create object (bean) using ApplicationContext*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie);
        Movie movie1 = (Movie) applicationContext.getBean("movie2");
        System.out.println(movie1);
    }
}
