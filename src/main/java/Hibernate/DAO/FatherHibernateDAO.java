package Hibernate.DAO;

import java.util.List;

public interface FatherHibernateDAO<T> {
    void insert(T customers);
    void update(T customers);
    void remove(T customers);
    T getById(Integer id);
    List<T> getAll();
}
