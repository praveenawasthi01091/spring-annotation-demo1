package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.demo.BeanLifeCycleDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        BeanLifeCycleDemo beanLifeCycleDemo=applicationContext.getBean(BeanLifeCycleDemo.class);
        System.out.println(beanLifeCycleDemo);
        AnnotationConfigApplicationContext axt=(AnnotationConfigApplicationContext) applicationContext;
        axt.close();
    }
}
