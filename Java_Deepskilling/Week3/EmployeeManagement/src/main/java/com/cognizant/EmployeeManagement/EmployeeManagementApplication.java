package com.cognizant.EmployeeManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.EmployeeManagement.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementApplication {
	private static final Logger logger=LoggerFactory.getLogger(EmployeeManagementApplication.class);
	private static EmployeeService ser;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeManagementApplication.class, args);
		ser=context.getBean(EmployeeService.class);
		testAddEmployee();
		
	}
	public static void testAddEmployee() {
		Employee e=new Employee();
		e.setAge(21);
		e.setName("Kumar");
		logger.debug("Start");
		ser.addEmployee(e);
		logger.debug("employee added");
		logger.debug("end");
		
	}

}
