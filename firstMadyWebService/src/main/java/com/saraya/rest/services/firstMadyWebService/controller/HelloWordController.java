package com.saraya.rest.services.firstMadyWebService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.rest.services.firstMadyWebService.bean.HelloWorld;

@RestController
public class HelloWordController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hi my name is Mady 6ko";
		
	}
	@GetMapping("/hello-world-bean")
	public HelloWorld helloWorldbean() {
		return new HelloWorld ("Hello Welcome Mady 6ko");
		
	}
	@GetMapping("/hello-world-bean-path-variable/{name}")
	public HelloWorld helloWorldbeanPathVariable(@PathVariable String name) {
		return new HelloWorld (String.format("Let's coding, %s",name));
	
	}


}
