package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.BikeDao;
import com.example.Model.BikeModel;

@Service
public class BikeService {
	BikeDao bikeDao ;
	@Autowired
	
	public BikeModel saveDetails2(BikeModel model) {
		return bikeDao.saveDetails3(model);
	}

}
