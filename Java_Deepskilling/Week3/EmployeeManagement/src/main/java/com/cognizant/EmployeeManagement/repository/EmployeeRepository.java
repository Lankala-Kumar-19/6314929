package com.cognizant.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.EmployeeManagement.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
