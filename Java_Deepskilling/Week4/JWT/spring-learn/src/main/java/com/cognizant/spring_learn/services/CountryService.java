package com.cognizant.spring_learn.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Entities.Country;

@Service
public class CountryService {
	public Country getCountry(String code) {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> c = (List<Country>) context.getBean("countries");
		((ClassPathXmlApplicationContext)context).close();
		for(Country x : c) {
			if(x.getCode().equalsIgnoreCase(code)) {
				return x;
			}
		}
		return null;
	}
}
