package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements Performer, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String song;

    private String name;

    public Singer(){
        System.out.println("1. Singer Constructor");
    }
    public void setSong(String song) {
        System.out.println("2. Singer song Setter");
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.println(name+" is singing "+song+"!");
    }

    @Override
    public void setBeanName(String s) {
    System.out.println("3. BeanNameAware -> setBeanName()");
    this.name=s;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. BeanFactoryAware-> setBeanFactory()");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5. ApplicationContextAware -> setApplicationContext()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. InitializingBean -> afterPropertiesSet()");
    }

    public void singerInit(){
        System.out.println("8. Custom Init Method for Singer "+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("1. Distruction Call : DisposableBean->destroy");
    }

    public void singerDestroy(){
        System.out.println("2. Custom destroy for "+name);
    }
}
