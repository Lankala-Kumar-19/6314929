package com.cognizant.orm_learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm_learn.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

   
    List<User> findByNameContaining(String name);

    User findByEmailStartingWith(String prefix);

    List<User> findBySalaryGreaterThan(double salary);

    List<User> findTop3ByOrderBySalaryDesc();
}
