package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class Singer implements Performer, BeanNameAware {

    private String song;

    private String name;

    public Singer(){

    }
    public void setSong(String song) {
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

}
