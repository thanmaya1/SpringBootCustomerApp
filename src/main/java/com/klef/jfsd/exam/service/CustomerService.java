package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer updateCustomer(Long id, String name, String address) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setName(name);
        customer.setAddress(address);
        return customerRepository.save(customer);
    }
}
