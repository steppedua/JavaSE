package Hibernate.DAO;

import Hibernate.Model.Customers;
import Hibernate.Util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class SimpleHibernateDAO implements FatherHibernateDAO<Customers> {

    @Override
    public void insert(Customers customers) {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();

        session.save(customers);

        sessionUtil.closeTransactionSession();
    }

    @Override
    public void update(Customers customers) {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.update(customers);

        sessionUtil.closeTransactionSession();
    }

    @Override
    public void remove(Integer id) {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.remove(id);


        sessionUtil.closeTransactionSession();
    }

    @Override
    public Customers getById(Integer id) {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();

        Query query = session.createNativeQuery("SELECT * FROM customers WHERE ID = :id").addEntity(Customers.class);
        query.setParameter("id", id);
        Customers customer = (Customers) query.getSingleResult();

        sessionUtil.closeTransactionSession();

        return customer;
    }

    @Override
    public List<Customers> getAll() {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery("SELECT * FROM customers").addEntity(Customers.class);
        List<Customers> customersList = query.list();

        sessionUtil.closeTransactionSession();

        return customersList;
    }


}
