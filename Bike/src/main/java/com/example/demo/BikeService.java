package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;
	public String saveDetails(BikeEntity b) {
		return bd.saveDetails(b);
	}

}

