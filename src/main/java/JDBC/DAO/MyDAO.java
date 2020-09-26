package JDBC.DAO;

import JDBC.Model.Customers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyDAO implements FatherDAO<Customers> {
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    @Override
    public boolean insert(Customers customers) {

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customers VALUES (?, ?, ?, ?, ?)");

            preparedStatement.setInt(1, customers.getId());
            preparedStatement.setString(2, customers.getFirstName());
            preparedStatement.setString(3, customers.getLastName());
            preparedStatement.setString(4, customers.getEmail());
            preparedStatement.setInt(5, customers.getAge());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customers getById(Integer id) {
        try {

            ResultSet resultSet = connectionAndStatement().executeQuery("SELECT * FROM customers WHERE id =" + id);

            if (resultSet.next()) {
                System.out.println("Метод getById() завершился успешно!");

                return extractCustomersFromResultSet(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean update(Customers customers) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE customers SET age=? WHERE id=?");

            preparedStatement.setInt(1, customers.getAge());
            preparedStatement.setInt(2, customers.getId());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(Customers customers) {

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM customers WHERE id=" + customers.getId());

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Customers> getAll() {
        try {

            ResultSet resultSet = connectionAndStatement().executeQuery("SELECT * FROM customers ");

            List<Customers> customers = new ArrayList<>();

            while (resultSet.next()) {
                Customers customer = extractCustomersFromResultSet(resultSet);
                customers.add(customer);
            }

            System.out.println("Метод getAll() завершился успешно!");

            return customers;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private Customers extractCustomersFromResultSet(ResultSet resultSet) throws SQLException {
        Customers customers = new Customers();

        customers.setId(resultSet.getInt("id"));
        customers.setFirstName(resultSet.getString("firstName"));
        customers.setLastName(resultSet.getString("lastName"));
        customers.setEmail(resultSet.getString("email"));
        customers.setAge(resultSet.getInt("age"));

        System.out.println("id: " + customers.getId());
        System.out.println("firstName: " + customers.getFirstName());
        System.out.println("lastName: " + customers.getLastName());
        System.out.println("email: " + customers.getEmail());
        System.out.println("age: " + customers.getAge() + "\n");

        return customers;
    }

    private Statement connectionAndStatement() {

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement statement = connection.createStatement();

            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
