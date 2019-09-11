package com.amta.spring.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amta.spring.demo.model.Hello;

public interface HelloRepository extends MongoRepository<Hello, String>{
	
	List<Hello> findByName(String name);

}
