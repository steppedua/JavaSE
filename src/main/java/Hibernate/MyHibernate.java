package Hibernate;

import Hibernate.DAO.SimpleHibernateDAO;

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
        SimpleHibernateDAO simpleHibernateDAO = new SimpleHibernateDAO();

        simpleHibernateDAO.getById(5);

        simpleHibernateDAO.closeSessionFactory();
    }
}
