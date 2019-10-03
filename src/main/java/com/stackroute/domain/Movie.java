package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor;
    private ApplicationContext context = null;

    public Movie(Actor actor) {
        this.actor = actor;
    }
    //@Autowired
//    @Qualifier("actorObject1")
//    public void setActor(Actor actor) {
//       this.actor = actor;
//    }

    @Override
    public String  toString() {
        return "Actor name : " +actor.getName() +
                " Actor age : " + actor.getAge() +
                " Actor gender :- " + actor.getGender();
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is " + beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("i am in the bean factory");
    }

}
