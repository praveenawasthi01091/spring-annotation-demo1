package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after  property set  method called");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method called");

    }

    @Override
    public String toString()
    {
        return "BeanLifecycleDemoBean{}";
    }

    /* custom init */
    @PostConstruct
    public void customInit()
    {
        System.out.println("customInit() called");
    }

    /* custom destroy*/
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("customDestroy() called");
    }


}
