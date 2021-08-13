package com.vwit.HelloWorld.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/")
	public String getMessage() {
		System.out.println("hello");
		return "hello";
	}

}
