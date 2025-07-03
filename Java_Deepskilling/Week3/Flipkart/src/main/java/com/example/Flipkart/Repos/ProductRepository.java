package com.example.Flipkart.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flipkart.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
