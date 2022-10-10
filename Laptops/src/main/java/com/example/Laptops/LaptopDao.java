package com.example.Laptops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;






@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository lapRepo;
	public String one(Laptop lap) {
		lapRepo.save(lap);
		return "Sucessfully saved";
		}
	public String two(Laptop lap) {
		lapRepo.save(lap).getId();
		return "Sucessfully updated";
		}
	public String deleteData(int id) {
	    lapRepo.deleteById(id);
	    return "data has been deleted";
	}
	public List<Laptop> getAllDetail(){
		return lapRepo.findAll();
	}
	public List<String> getByBrand(){
		return lapRepo.getByBrand();
	}
	

}
