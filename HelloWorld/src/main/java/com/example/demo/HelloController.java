package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@RequestMapping("/Hi")
	public String getMessage() {

		return "HelloWorld";

	}

	@RequestMapping("/add/{a}/{b}")
	public int findSum(@PathVariable int a, @PathVariable int b) {
		int c = a + b;
		return c;
	}

	@RequestMapping("/oddeven/{a}")
	public String findoddEven(@PathVariable int a) {
		if (a % 2 != 0) {
			return "odd";
		} else {
			return "even";
		}

	}

}
