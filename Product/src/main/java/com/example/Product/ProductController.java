package com.example.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProductController {
	@Autowired
	ProductService proService;
	@GetMapping (value="/get")
	public List<Product>getAllProducts() {
		return proService.getAllProducts();
}
}
