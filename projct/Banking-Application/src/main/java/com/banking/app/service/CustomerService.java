package com.banking.app.service;

import com.banking.app.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Long id, Customer customer);
    public void deleteCustomer(Long id);
    public List<Customer> getCustomers();
    public Customer getCustomerById(Long id);
}
