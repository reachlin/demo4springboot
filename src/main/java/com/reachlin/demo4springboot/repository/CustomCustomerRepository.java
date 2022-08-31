package com.reachlin.demo4springboot.repository;

import com.reachlin.demo4springboot.model.Customer;

import java.util.List;

public interface CustomCustomerRepository {
    public List<Customer> findActiveCustomerByName(String name);
}
