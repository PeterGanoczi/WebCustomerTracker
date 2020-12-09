package sk.itsovy.ganoczi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sk.itsovy.ganoczi.entity.Customer;


import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {

        Session currentSession= sessionFactory.getCurrentSession();

        Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);

        List<Customer> customers=theQuery.getResultList();


        return customers;
    }


}
