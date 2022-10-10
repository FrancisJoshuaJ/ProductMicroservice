package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Products;
import com.example.Repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/p1/")
public class ProductController {
	@Autowired
	public  ProductRepository productRepository;
	
	@PostMapping("products")
	public Products createProducts(@RequestBody Products products) {
	return productRepository.save(products);
	}
}

