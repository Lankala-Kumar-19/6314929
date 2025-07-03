package com.example.Flipkart.Entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="flipkart_order")
public class Order {
	@Id @GeneratedValue
	@Column(name="o_id")
	private Long id;
	
	@Column(name="o_date")
	private LocalDate orderDate;
	
	@Column(name="o_amount")
	private double amount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToMany
	@JoinTable(
	name="order_product",
	joinColumns= @JoinColumn(name="order_id"),
	inverseJoinColumns= @JoinColumn(name="product_id")
	)
	private List<Product> products;
	
	public Order(){
		
	}
	public long getId() {
		return id;
	}
	public void setProducts(List<Product> products) {
		this.products=products;
	}
	public List<Product> getProducts(){
		return products;
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	public void setDate(LocalDate orderDate) {
		this.orderDate=orderDate;
	}
	public double getAmount() {
		return amount;
	}
	public LocalDate getDate() {
		return orderDate;
	}
	@Override
	public String toString() {
	    return "Order{" +
	            "id=" + id +
	            ", amount=" + amount +
	            ", date=" + orderDate +
	            ", customerId=" + (customer != null ? customer.getId() : null) +
	            '}';
	}

}
