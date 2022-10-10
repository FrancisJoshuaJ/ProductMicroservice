package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	@PostMapping("/save")
	public String saveDetails(@RequestBody BikeEntity b) {
		return bs.saveDetails(b);
	}
	

}
