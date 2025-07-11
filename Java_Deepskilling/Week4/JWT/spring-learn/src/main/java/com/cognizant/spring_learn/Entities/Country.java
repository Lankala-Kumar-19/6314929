package com.cognizant.spring_learn.Entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	private String name;
	
	private static final Logger logger = LoggerFactory.getLogger(Country.class);
	
	public Country() {
		logger.debug("Insinde country constructor");
		
	}
//	public Country(String code, String name) {
//		this.code = code;
//		this.name = name;
//	}
	
	public void setCode(String code) {
		logger.debug("setting code: {}",code);
		this.code = code;
	}
	public void setName(String name) {
		logger.debug("setting name: {}",name);
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "name="+name+" code="+code;
	}
}
