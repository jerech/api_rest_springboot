package com.amta.spring.demo.controller;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amta.spring.demo.dto.HelloDto;
import com.amta.spring.demo.service.HelloService;

@RestController
@Validated
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hello")
	public HelloDto hello(@RequestParam() @NotEmpty(message="Dato vacio") String value) {
		
		return helloService.hello(value);
	}
	
	

}
