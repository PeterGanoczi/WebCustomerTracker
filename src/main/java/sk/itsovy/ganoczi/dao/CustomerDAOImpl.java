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
    public List<Customer> getCustomers() {

        Session currentSession= sessionFactory.getCurrentSession();

        Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

        List<Customer> customers=theQuery.getResultList();


        return customers;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {

        Session currentSession= sessionFactory.getCurrentSession();

        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public Customer getCustomer(int theId) {
        Session currentSession=sessionFactory.getCurrentSession();

        return currentSession.get(Customer.class, theId);
    }

    @Override
    public void deleteCustomer(int theId) {
        Session currentSession=sessionFactory.getCurrentSession();


        Query theQuery= currentSession.createQuery("delete from Customer where id=:customerId");
        theQuery.setParameter("customerId", theId);

        theQuery.executeUpdate();
    }


}
