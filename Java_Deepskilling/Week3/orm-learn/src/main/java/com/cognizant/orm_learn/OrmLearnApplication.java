package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {
	private static CountryService countryService;
	private static final Logger logger= LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		logger.info("Inside main");
		
		testGetAllCountries();
		testAddNewCountry();
		testDeleteCountry();
		testUpdateCountry();
		testFindCountries();
	}	
	private static void testGetAllCountries() {
		logger.info("Start");
		List<Country> countries= countryService.getAllCountries();
		logger.debug("countries={}",countries);
		logger.info("End");
	}
	private static void testAddNewCountry() {
		logger.debug("Start adding...");
		Country newC=new Country();
		newC.setCode("XX");
		newC.setName("Xxx");
		Country c= countryService.add(newC);
		logger.debug("new country: {}",c);
		logger.debug("adding done");
	}
	private static void testDeleteCountry() {
		logger.debug("Started deleting...");
		countryService.DeleteCountry("Xxx");
		logger.debug("delete completed");
	}
	private static void testUpdateCountry() {
		logger.debug("Started updating..");
		Country c=new Country();
		c.setCode("zz");
		c.setName("yyy");
		countryService.add(c);
		c=countryService.updateCountryCode("yyyy", "zz");
		logger.debug("update done");
		logger.debug("country after update {}",c);
	}
	public static void testFindCountries() {
		logger.debug("Starting searching");
		List<Country> c=countryService.findByPartialName("di");
		logger.debug("Countries found: {}",c);
		logger.debug("searching done");
	}
	public static void testFindByCode() {
		logger.debug("starting searching");
		logger.debug("country found {}",countryService.findByCode("in"));
		logger.debug("searching done");
	}
	
}
