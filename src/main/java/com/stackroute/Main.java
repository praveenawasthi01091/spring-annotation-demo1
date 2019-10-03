package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.demo.BeanPostProcessorDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        BeanPostProcessorDemo beanPostProcessorDemo=applicationContext.getBean(BeanPostProcessorDemo.class);
        System.out.println(beanPostProcessorDemo);
        AnnotationConfigApplicationContext axt=(AnnotationConfigApplicationContext) applicationContext;
        axt.close();
    }
}
