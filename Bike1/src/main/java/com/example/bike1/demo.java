package com.example.bike1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
	@GetMapping(value="/hi")
	public String sayHi() {
		return "hello developer";
	}

}
