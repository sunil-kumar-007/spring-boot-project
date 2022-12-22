package com.example.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

	@GetMapping("/greet")
	public String greet() {
		
		return "Welcome to Spring boot application";
	}
}
