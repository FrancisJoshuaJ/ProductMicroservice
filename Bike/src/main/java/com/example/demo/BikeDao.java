package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	public String saveDetails(BikeEntity b) {
		br.save(b);
		return "save successfully";
	}
	

}
