package com.example.Flipkart.Services;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flipkart.Entities.Customer;
import com.example.Flipkart.Entities.Order;
import com.example.Flipkart.Entities.Product;
import com.example.Flipkart.Repos.CustomerRepository;
import com.example.Flipkart.Repos.OrderRepository;
import com.example.Flipkart.Repos.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private CustomerRepository c_repo;
	
	@Autowired 
	private ProductRepository p_repo;
	
	
	@Transactional
	public Order placeOrder(List<Long> productIds, Long customerId) {
		Customer c= c_repo.findById(customerId).orElse(null);
		List<Product> p_list=p_repo.findAllById(productIds);
		
		Order order = new Order();
		order.setCustomer(c);
		order.setProducts(p_list);
		order.setAmount(p_list.stream().mapToDouble(Product::getPrice).sum());
		order.setDate(LocalDate.now());
		return repo.save(order);
		
	}
	
	
}
