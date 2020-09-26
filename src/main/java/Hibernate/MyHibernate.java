package Hibernate;

import Hibernate.Model.Customers;
import Hibernate.Util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hibernate:
 * - Создать отдельное Java-приложение, которое подключается к той же БД (таблица User), но уже с помощью Hibernate.
 * Применив паттерн DAO, реализовать на Hibernate операции по работе с таблицей User:
 * создание записи, обновление записи, удаление записи,
 * получение записи по id, получение списка записей (причем с фильтрацией по полям и с пагинацией).
 * Для каждой из операций должно быть две реализации: с использованием Criteria API и с использованием HQL (Hibernate Query Language).
 */

public class MyHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Customers customers = new Customers(7, "Petro", "Vetro", "petro-vetro@gmail.com", 55);

        session.save(customers);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
