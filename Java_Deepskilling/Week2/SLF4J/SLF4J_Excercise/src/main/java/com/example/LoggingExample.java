package com.example;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
	private static final Logger logger=LoggerFactory.getLogger(LoggingExample.class);
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name : ");
		String x=sc.nextLine();
		logger.info("{} logged in ",x);
		
//		logger.error("This is an error message");
//		logger.warn("This is a warning message");
	}
}
