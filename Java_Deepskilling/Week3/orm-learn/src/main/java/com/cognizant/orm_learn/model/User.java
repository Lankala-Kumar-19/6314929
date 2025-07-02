package com.cognizant.orm_learn.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id@GeneratedValue
	@Column(name="u_id")
	private int id;
	
	@Column(name="u_name")
	private String name;
	
	@Column(name="u_email")
	private String email;
	
	@Column(name="u_sal")
	private double salary;
	
	@Column(name="u_date")
	private Date createdDate;
	
	public User() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate=createdDate;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public double getSalary() {
		return salary;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public String toString() {
		return "id: "+id+" name: "+name+" email: "+email+" salary: "+salary;
	}
	
	
	
}
