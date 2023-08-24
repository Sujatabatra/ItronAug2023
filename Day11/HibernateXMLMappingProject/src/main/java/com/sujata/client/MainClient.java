package com.sujata.client;

import com.sujata.entity.Employee;
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

        Employee employee=new Employee(12,"LLLL","Sr. Director","Operations",450000.0);

        session.save(employee);

        transaction.commit();

        session.close();

    }
}
