package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.CountryRepository;
import com.cognizant.orm_learn.model.Country;

import jakarta.transaction.Transactional;

@Service
public class CountryService {
	@Autowired
	CountryRepository repo;
	
	@Transactional
	public List<Country> getAllCountries(){
		return repo.findAll();
	}
	
	@Transactional
	public void DeleteCountry(String country) {
		 repo.deleteByCountry(country);
	}
	
	@Transactional
	public Country add(Country c) {
		return repo.save(c);
	}
	
	@Transactional
	public Country updateCountryCode(String newName,String code) {
		
		Country newC = repo.findById(code).orElse(null);
		if (newC != null) {
		    newC.setName(newName);
		    return repo.save(newC);
		} else {
		    System.out.println("Country not found with name: " + code);
		}
		return null;

		
	}
	@Transactional
	public List<Country> findByPartialName(String name){
		return repo.findByPartialName(name);
	}
	
	@Transactional
	public Country findByCode(String code) {
		return repo.findById(code).orElse(null);
	}
}
