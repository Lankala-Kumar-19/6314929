package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Entities.Country;
import com.cognizant.spring_learn.services.CountryService;

@RestController
public class CountryController {
	@Autowired
	private CountryService ser;
	
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> c =(List<Country>) context.getBean("countries");
		((ClassPathXmlApplicationContext)context).close();
		return c;
	}
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		//@SuppressWarnings("unchecked")
		Country c = (Country) context.getBean("india", Country.class);
		((ClassPathXmlApplicationContext)context).close();
		return c;
		
	}
	
	@GetMapping("country/{code}")
	public Country getCountry(@PathVariable String code) {
		return ser.getCountry(code);
	}
}
