package com.amta.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amta.spring.demo.dto.HelloDto;
import com.amta.spring.demo.model.Hello;
import com.amta.spring.demo.repository.HelloRepository;

@Component
public class HelloSeviceImpl implements HelloService{
	
	@Autowired
	private HelloRepository helloRepository;

	@Override
	public HelloDto hello(String name) {
		//Podriamos validar el string message
		
		String message = String.format("Hola %s!", name);
		
		Hello hello = new Hello();
		hello.setName(name);
		hello.setMessage(message);
		helloRepository.save(hello);
		
		HelloDto response = new HelloDto();
		response.setMessage(message);
		
		return response;
	}

}
