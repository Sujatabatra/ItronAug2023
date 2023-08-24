package com.sujata.client;

import com.sujata.producer.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication : @Configuration+@ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata")
public class MyFirstSpringBootIocProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Prateek")
	Performer performer;

	public static void main(String[] args) {

		SpringApplication.run(MyFirstSpringBootIocProjectApplication.class, args);

//		ApplicationContext applicationContext= SpringApplication.run(MyFirstSpringBootIocProjectApplication.class, args);
//
//		Performer performer1=(Performer) applicationContext.getBean("Prateek");
//		performer1.perform();
	}

	@Override
	public void run(String... args) throws Exception {
		performer.perform();
	}
}
