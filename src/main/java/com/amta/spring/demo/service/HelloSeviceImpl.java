package com.amta.spring.demo.service;

import org.springframework.stereotype.Component;

import com.amta.spring.demo.dto.HelloDto;

@Component
public class HelloSeviceImpl implements HelloService{

	@Override
	public HelloDto hello(String message) {
		//Podriamos validar el string message
		
		
		HelloDto response = new HelloDto();
		response.setMessage(String.format("Hola %s!", message));
		
		return response;
	}

}
