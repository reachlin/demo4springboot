package com.reachlin.demo4springboot.repository;

import com.reachlin.demo4springboot.model.Customer;

import java.util.List;

public class CustomCustomerRepositoryImpl implements CustomCustomerRepository {
    @Override
    public List<Customer> findActiveCustomerByName(String name) {
        // TODO: implement your special search here...
        return null;
    }
}
