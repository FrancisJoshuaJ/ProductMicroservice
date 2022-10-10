package com.example.Beautify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetailsController {
	@Autowired
	ProductDetailsService beautyService;
	@PostMapping("/save")
	public String saveDetails1(@RequestBody ProductDetailsEntity p) {
		return beautyService.saveDetails2(p);
	}
	@PutMapping("/update")
	public String updateDetails1(@RequestBody ProductDetailsEntity p) {
		return beautyService.updateDetails2(p);
	}

}
