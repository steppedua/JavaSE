package Hibernate.DAO;

import java.util.List;

public interface FatherHibernateDAO<T> {
    void insert(T customers);
    void update(T customers);
    void remove(Integer id);
    T getById(Integer id);
    List<T> getAll();
}
