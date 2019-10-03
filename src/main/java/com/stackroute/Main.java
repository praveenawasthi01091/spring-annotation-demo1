package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        BeanPostProcessorDemo bean=applicationContext.getBean(BeanLifeCycleDemo.class);
        System.out.println(beanLifeCycleDemo);
        AnnotationConfigApplicationContext axt=(AnnotationConfigApplicationContext) applicationContext;
        axt.close();
    }
}
