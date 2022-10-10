package com.example.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	public List<Product> getAllProducts(){
		return proDao.getAllProducts();
	}
}
