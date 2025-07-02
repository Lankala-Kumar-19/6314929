package com.example.Flipkart;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Flipkart.Entities.Customer;
import com.example.Flipkart.Entities.Product;
import com.example.Flipkart.Repos.ProductRepository;
import com.example.Flipkart.Services.CustomerService;
import com.example.Flipkart.Services.OrderService;

@SpringBootApplication
public class FlipkartApplication implements CommandLineRunner{
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired 
	private ProductRepository p_repo;
	

	public static void main(String[] args) {
		SpringApplication.run(FlipkartApplication.class, args);
		//FlipkartApplication fa= new FlipkartApplication();
	}
	
	public void run(String... args) throws Exception {
	    Customer c = new Customer();
	    c.setName("Amit");
	    c.setEmail("amit@gmail.com");
	    customerService.addCustomer(c);

	    // Add Products first
	    Product p1 = new Product();
	    p1.setName("Laptop");
	    p1.setPrice(60000.0);

	    Product p2 = new Product();
	    p2.setName("Mouse");
	    p2.setPrice(800.0);

	    // Save products
	    p_repo.save(p1);
	    p_repo.save(p2);

	    // Place orders with product IDs
	    orderService.placeOrder(Arrays.asList(p1.getId(), p2.getId()), c.getId());

	    System.out.println("Customer Orders:");
	    customerService.getCustomerOrders(c.getId()).forEach(System.out::println);
	}



}
