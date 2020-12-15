package sk.itsovy.ganoczi.service;

import sk.itsovy.ganoczi.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
