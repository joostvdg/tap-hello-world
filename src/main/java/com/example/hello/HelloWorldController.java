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
		String date = "2021-10-13";
		// if env ALT_DATE is set, use that for date
		if (System.getenv("ALT_DATE") != null) {
			date = System.getenv("ALT_DATE");
		}
		return "Hello " + message + ". It is great to be here, on "+ date + ". This is a test of the emergency broadcast system - Test3.";
	}
}
