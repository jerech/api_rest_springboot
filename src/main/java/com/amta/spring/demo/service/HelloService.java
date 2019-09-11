package com.amta.spring.demo.service;

import com.amta.spring.demo.dto.HelloDto;

public interface HelloService {
	
	 /**
     * Crea un hello
     *
     * @param message
     * @return
     */
	HelloDto hello(String message);

}
