package com.hillel.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by alexei.yakushyn on 05.10.2017.
 */
public class Main {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = createSessionFactory()) {
            Session session = sessionFactory.openSession();
            Students students = new Students();
            session.toString();
            @SuppressWarnings("unchecked")
            List<Students> resultList = session.createQuery(" from Students ").getResultList();
            System.out.println(resultList.get(0));
            session.close();
        }
    }

    private static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Students.class)
                .addAnnotatedClass(Progress.class)
                .configure();
        StandardServiceRegistryBuilder builder =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }
}
