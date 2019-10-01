package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean  implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("after destroy");
    }

    public void  customInit(){
        System.out.println("In custom init");
    }

    public void customDestroy(){
        System.out.println("In custom destroy");
    }

}
