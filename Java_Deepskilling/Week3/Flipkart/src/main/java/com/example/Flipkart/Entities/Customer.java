package com.example.Flipkart.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {
	@Id @GeneratedValue
	@Column(name="c_id")
	private Long id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_email")
	private String email;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Order> orders;
	
	public Customer() {
		
	}
	public long getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public List<Order> getOrders(){
		return orders;
	}
	public String toString() {
		return "id: "+id+" name: "+name+" email: "+email;
	}
	
}
