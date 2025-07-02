package com.cognizant.EmployeeManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="e_id")
    private int id;
	
	@Column(name="e_name")
	private String name;
	
	@Column(name="e_age")
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Name: "+name+" Age: "+age;
	}
	
}
