package com.sujata.client;

import com.sujata.demo.Employee;
import com.sujata.demo.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainClient {
    public static void main(String[] args) {

        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

        SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

        Project project1=new Project("P001","Project Mobile App","Noida");
        Project project2=new Project("P002","Project Web App","Bangalore");
        Project project3=new Project("P003","Project Book Store App","Pune");

        Employee employee1=new Employee(1,"AAAA","Team Lead",45000,project2);
        Employee employee2=new Employee(2,"BBBB","Tester",55000,project1);
        Employee employee3=new Employee(3,"CCCC","Project Manager",175000,project2);
        Employee employee4=new Employee(4,"DDDD","Team Member",58000,project1);
        Employee employee5=new Employee(5,"EEEE","Team Lead",85000,project1);
        Employee employee6=new Employee(6,"FFFF","Team Member",45000,project2);
        Employee employee7=new Employee(7,"GGGG","Sr. Tester",145000,project3);
        Employee employee8=new Employee(8,"HHHH","Scrum Master",245000,project3);

        session.save(project1);
        session.save(project2);
        session.save(project3);

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);
        session.save(employee4);
        session.save(employee5);
        session.save(employee6);
        session.save(employee7);
        session.save(employee8);

        transaction.commit();

        session.close();

    }
}
