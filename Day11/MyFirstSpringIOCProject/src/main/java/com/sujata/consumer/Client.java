package com.sujata.consumer;

import com.sujata.producer.Performer;
import com.sujata.producer.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        //Consumer of Spring Application : need not to create object but life cycle of object will be maintained by spring container
//        Performer performer=new Singer();
        /*
        ApplicationContext will read .xml file and will run the life cycle of all the components specified in <bean> tag
         as of now life cycle: create object
         */
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("performance.xml");

        Performer performer1=(Performer) springContainer.getBean("Prateek");
        System.out.println("performer1 : "+performer1);

        Performer performer2=(Performer) springContainer.getBean("Prateek");
        System.out.println("performer2 : "+performer2);
    }
}
