package com.example.Flipkart.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flipkart.Entities.Customer;
import com.example.Flipkart.Entities.Order;
import com.example.Flipkart.Repos.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	
	@Transactional
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}
	
	@Transactional
	public List<Order> getCustomerOrders(Long customerId){
		Customer c= repo.findById(customerId).orElse(null);
		if(c!=null) {
			c.getOrders().size();
			return c.getOrders();
		}
		return new ArrayList<>();
	}
	
	
}
