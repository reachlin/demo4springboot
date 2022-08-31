package com.reachlin.demo4springboot.repository;

import com.reachlin.demo4springboot.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String>, CustomCustomerRepository {
    // MongoRepository inherits from CRUD repository
    // more complex query can be defined here

    List<Customer> findByLastName(@Param("name") String name);

    @Query(value="{ 'createdAt': { $gt: ?0, $lt: ?1 } }")
    List<Customer> findAllBetween(LocalDateTime startTime, LocalDateTime endTime);
}
