package com.sujata.client;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class EmployeeClient {
    public static void main(String args[]){
//        EmployeePresentation employeePresentation=new EmployeePresentationImpl();
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Scanner scanner=new Scanner(System.in);

        EmployeePresentation employeePresentation=(EmployeePresentation)applicationContext.getBean("presentation");

        while(true){
            employeePresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice=scanner.nextInt();
            employeePresentation.performMenu(choice);
        }
    }
}
