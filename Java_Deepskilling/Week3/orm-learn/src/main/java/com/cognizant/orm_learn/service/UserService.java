package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.User;
import com.cognizant.orm_learn.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	@Transactional
	public List<User> findByNameContaining(String name){
		return repo.findByNameContaining(name);
	}
	@Transactional
	public User findByEmailStartingWith(String prefix) {
		return repo.findByEmailStartingWith(prefix);
	}
	@Transactional
	public List<User> findBySalaryGreaterThan(double salary){
		return repo.findBySalaryGreaterThan(salary);
	}
	@Transactional
	public List<User> findTop3ByOrderBySalaryDesc(){
		return repo.findTop3ByOrderBySalaryDesc();
	}
	@Transactional
	public User add(User u) {
		return repo.save(u);
	}
	
}
