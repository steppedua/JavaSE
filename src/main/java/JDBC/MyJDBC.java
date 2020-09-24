package JDBC;

import JDBC.DAO.MyDAO;
import JDBC.Model.Customers;

/**
 * JDBC:
 * - создать в БД тестовую таблицу (например User c 5-6 полями разного типа).
 * Настроить коннекшен из Java-приложения к БД с помощью JDBC-драйвера.
 * Применив паттерн DAO, реализовать на JDBC операции по работе с таблицей User:
 * создание записи, обновление записи, удаление записи, получение записи по id,
 * получение списка записей (причем с фильтрацией по полям и с пагинацией).
 */

/*
CREATE TABLE customers
    (
        id SERIAL PRIMARY KEY,
        firstName VARCHAR(30),
        lastName VARCHAR(30),
        email VARCHAR(30),
        age INTEGER
    );
*/

/*          VALUES
            (1, 'Ivan', 'Ivanov', 'ivan@gmail.com', 18),
            (2, 'Jack', 'Sparrow', 'sparrow@gmail.com', 20),
            (3, 'Dolli', 'Shape', 'shape@gmail.com', 30),
            (4, 'Ballu', 'Horse', 'ballu@mail.ru', 23),
            (5, 'Kotlin', 'Jvm', 'kotlin-jvm@list.ua', 54);
*/
public class MyJDBC {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        MyDAO myDAO = new MyDAO();

        myDAO.getById(4);

        System.out.println("------------------------");

        myDAO.getAll();

        System.out.println("------------------------");

//        Customers customers1 = new Customers(6, "Vasya", "Petrov", "vasya-petrov@gmail.com", 50);
//        myDAO.insert(customers1);
//
//        System.out.println("insert - OK");
//        System.out.println("------------------------");
//
//        Customers customers2 = new Customers(6,54);
//        myDAO.update(customers2);
//
//        System.out.println("update - OK");
//        System.out.println("------------------------");

        Customers customers3 = new Customers(6, "SCALA", "Jvm", "scala-jvm@list.ua", 50);
        myDAO.delete(customers3);

        System.out.println("delete - OK");
    }
}

