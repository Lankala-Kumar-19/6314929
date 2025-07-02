package com.example.Flipkart.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flipkart.Entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	List<Order> findTop3ByOrderByAmountDesc();
}
