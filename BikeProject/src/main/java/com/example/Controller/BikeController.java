package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.BikeModel;
import com.example.Service.*;

@RestController
public class BikeController {
	@Autowired
	BikeService bikeService;
	
	@PostMapping("/saveBike")
	public BikeModel saveDetails1(@RequestBody BikeModel model ) {
		return bikeService.saveDetails2(model);
	}
	
	

}
