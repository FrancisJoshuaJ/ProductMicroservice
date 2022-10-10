package com.example.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRepo;
	public List<Product> getAllProducts(){
		return proRepo.findAll();
	}

}
