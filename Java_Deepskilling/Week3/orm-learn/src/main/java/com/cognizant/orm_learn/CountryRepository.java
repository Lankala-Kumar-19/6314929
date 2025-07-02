package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.orm_learn.model.Country;

import jakarta.transaction.Transactional;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Modifying
    @Transactional
    @Query("delete from Country c where lower(c.name) = lower(:count)")
    void deleteByCountry(@Param("count") String country);

    @Query("select c from Country c where lower(c.name) like lower(concat('%', :name, '%'))")
    List<Country> findByPartialName(@Param("name") String country);

    @Query("select c from Country c where lower(c.name) = lower(:count)")
    Country findByName(@Param("count") String country);
}
