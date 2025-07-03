package com.example.Flipkart.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Product {
	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private double price;
	
	@ManyToMany(mappedBy="products")
	private List<Order> orders;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return "id="+id+", name="+name+", price="+price;
	}
}
