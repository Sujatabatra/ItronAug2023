package com.sujata.consumer;

import com.sujata.producer.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("performance.xml");

        Auditorium auditorium=(Auditorium) springContainer.getBean("fikkiAuditorium");

        auditorium.performance();
    }
}
