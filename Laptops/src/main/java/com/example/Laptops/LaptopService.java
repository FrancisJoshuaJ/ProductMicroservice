package com.example.Laptops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class LaptopService {
	@Autowired
	LaptopDao lapDao;
	public String one(Laptop lap) {
		return lapDao.one(lap);
	}
	public String two(Laptop lap) {
		return lapDao.two(lap);
	}
	public String deleteData(int id) {
		return lapDao.deleteData(id);
	}
	public List<Laptop> getAllDetail(){
		return lapDao.getAllDetail();
	}
	public List<String> getByBrand(){
		return lapDao.getByBrand();
	}


}
