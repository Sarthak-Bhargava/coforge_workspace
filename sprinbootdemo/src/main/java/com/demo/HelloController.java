package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// this is call endpoint url   api test
    @GetMapping("/call")
	String sayHello() {

		String s = " hi how ar you";
		
		System.out.println("-->>>>>>>>>>"+s);

		return s;

	}

}
