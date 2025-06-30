package com.library.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService ser=context.getBean("bookBean",BookService.class);
		
		ser.print();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
