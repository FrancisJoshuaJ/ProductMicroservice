package com.example.Laptops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LaptopController {
	@Autowired
	LaptopService lapService;
	@PostMapping(value="/open")
	public String one(@RequestBody  Laptop lap) {
		return lapService.one(lap);
	}
	@PutMapping(value="/put")
	public String two(@RequestBody Laptop lap) {
		return lapService.two(lap);
	}
	@DeleteMapping(value ="/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return lapService.deleteData(id);
	}
	@GetMapping(value="/getAll")
	public List<Laptop>getAllDetail(){
		return lapService.getAllDetail();
	}
	@GetMapping(value="/getByBrand")
	public List<String> getByBrand(){
		return lapService.getByBrand();
	}

}
