package org.perscholas;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        try {
            // Create session factory
            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();

            // Get session
            var session = factory.getCurrentSession();

            // Print a success message if everything works
            System.out.println("Hibernate is connected to MySQL successfully!");

            session.close();
            factory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

