package com.pluralsight.northwind_traders_springboot.repository;

import com.pluralsight.northwind_traders_springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {


    List<Customer> findAllCustomers();

    Optional<Customer> findById(String id);

    boolean existsById(String id);

    void deleteById(String id);

    Customer save(Customer customer);
}
