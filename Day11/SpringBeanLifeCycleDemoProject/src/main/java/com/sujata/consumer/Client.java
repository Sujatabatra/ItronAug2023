package com.sujata.consumer;

import com.sujata.producer.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performance.xml");

        springContainer.registerShutdownHook();
//        Auditorium auditorium=(Auditorium) springContainer.getBean("fikkiAuditorium");
//
//        auditorium.performance();

        Performer performer1=(Performer) springContainer.getBean("Amrit");
        performer1.perform();

        Performer performer2=(Performer) springContainer.getBean("Arindam");
        performer2.perform();
    }
}
