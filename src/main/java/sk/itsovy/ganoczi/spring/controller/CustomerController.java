package sk.itsovy.ganoczi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.itsovy.ganoczi.dao.CustomerDAO;
import sk.itsovy.ganoczi.entity.Customer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model theModel){

        List<Customer> theCustomers=customerDAO.getCustomers();

        theModel.addAttribute("customers",theCustomers);

        return "list-customers";
    }
}
