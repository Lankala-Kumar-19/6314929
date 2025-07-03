package com.example.Flipkart.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flipkart.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
