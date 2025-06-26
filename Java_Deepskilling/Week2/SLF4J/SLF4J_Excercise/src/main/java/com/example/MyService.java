package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MyService {
	private static final Logger logger=LoggerFactory.getLogger(MyService.class);
	
	
	public static void runTask() {
		logger.trace("TRACE: Starting trace...");
		logger.debug("DEBUG: Debugging info");
		logger.info("Task Started");
		logger.warn("Something is off");
		logger.error("Something failed");
	}
	public static void main(String args[]) {
		runTask();
	}
}
