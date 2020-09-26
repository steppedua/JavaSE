package Hibernate.DAO;

import Hibernate.Model.Customers;
import Hibernate.Util.HibernateUtil;
import Hibernate.Util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SimpleHibernateDAO implements FatherHibernateDAO<Customers> {

    @Override
    public void insert(Customers customers) {
        SessionUtil sessionUtil = new SessionUtil();
        openSession(sessionUtil).save(customers);

        closeSession(sessionUtil);
    }

    @Override
    public void update(Customers customers) {
        SessionUtil sessionUtil = new SessionUtil();
        openSession(sessionUtil).update(customers);

        closeSession(sessionUtil);
    }

    @Override
    public void remove(Customers customers) {
        SessionUtil sessionUtil = new SessionUtil();
        openSession(sessionUtil).delete(customers);

        closeSession(sessionUtil);
    }

    @Override
    public Customers getById(Integer id) {
        SessionUtil sessionUtil = new SessionUtil();

        Query query = openSession(sessionUtil).createNativeQuery("SELECT * FROM customers WHERE ID = :id").addEntity(Customers.class);
        query.setParameter("id", id);
        Customers customer = (Customers) query.getSingleResult();

        closeSession(sessionUtil);

        return customer;
    }

    @Override
    public List<Customers> getAll() {
        SessionUtil sessionUtil = new SessionUtil();

        Query query = openSession(sessionUtil).createNativeQuery("SELECT * FROM customers").addEntity(Customers.class);
        List<Customers> customersList = query.list();

        closeSession(sessionUtil);

        return customersList;
    }

    private Session openSession(SessionUtil sessionUtil) {
        sessionUtil.openTransactionSession();
        Session session = sessionUtil.getSession();

        return session;
    }

    private void closeSession(SessionUtil sessionUtil) {
        sessionUtil.closeTransactionSession();
    }


    public void closeSessionFactory() {
        HibernateUtil.getSessionFactory().close();
    }
}
