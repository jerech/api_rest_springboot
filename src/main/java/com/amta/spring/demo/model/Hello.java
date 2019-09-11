package com.amta.spring.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hello")
public class Hello {
	
	private String message;
	
	private String name;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
