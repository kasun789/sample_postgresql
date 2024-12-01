package com.project.postgresql.controller;

import com.project.postgresql.model.Customer;
import com.project.postgresql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/add")
    public Customer addCustomer(Customer customer) {
        return customerService.addCustomer(customer);
    }
}
