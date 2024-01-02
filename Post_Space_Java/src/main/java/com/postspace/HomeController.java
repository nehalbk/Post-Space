package com.postspace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(value="")
	public String home() {
		return "Welcome to Post Space!";
	}
}
