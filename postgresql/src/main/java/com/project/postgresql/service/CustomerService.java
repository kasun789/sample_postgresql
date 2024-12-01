package com.project.postgresql.service;

import com.project.postgresql.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer addCustomer(Customer customer);
}
