package com.example.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${app.message:World}")
	private String message;

	@RequestMapping("/")
	public String index() {
		return "Hello " + message + ". It is great to be here, on January 18th, 2024!";
	}
}
