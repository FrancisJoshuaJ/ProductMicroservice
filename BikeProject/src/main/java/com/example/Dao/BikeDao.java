package com.example.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.BikeModel;
import com.example.Repository.BikeRepository;

@Repository
public class BikeDao {
	BikeRepository bikeRepository;
	@Autowired
	
	public BikeModel saveDetails3(BikeModel model) {
	 return bikeRepository.save(model);
	 
	}

}
