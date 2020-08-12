package com.myweb.api.repository;

import com.myweb.api.model.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{
    
   
}