package com.sujata.entity.client;

import com.sujata.entity.Husband;
import com.sujata.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainClass {
    public static void main(String[] args) {

        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

        SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

        Wife wife1=new Wife("W001","Wife A");
        Wife wife2=new Wife("W002","Wife B");
        Wife wife3=new Wife("W003","Wife C");
        Wife wife4=new Wife("W004","Wife D");

        Husband husband1=new Husband("H001","Husband Z");
        Husband husband2=new Husband("H002","Husband Y");
        Husband husband3=new Husband("H003","Husband X");
        Husband husband4=new Husband("H004","Husband W");

        husband1.setWife(wife4);
        husband2.setWife(wife3);
        husband3.setWife(wife2);
        husband4.setWife(wife1);

        session.save(wife1);
        session.save(wife2);
        session.save(wife3);
        session.save(wife4);

        session.save(husband1);
        session.save(husband2);
        session.save(husband3);
        session.save(husband4);

        transaction.commit();

        session.close();

    }
}
