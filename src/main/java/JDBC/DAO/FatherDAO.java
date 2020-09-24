package JDBC.DAO;

import java.util.List;

public interface FatherDAO<T> {
    boolean insert(T customers);
    T getById(Integer id);
    boolean update(T customers);
    boolean delete(T customers);
    List<T> getAll();
}
