package Hibernate.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory sessionFactory;

    //Возвращает sessionFactory, необходимую для создания сессии
    public static SessionFactory getSessionFactory() {

        try {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            e.printStackTrace();
        }

        return null;
    }
}
