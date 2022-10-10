package com.example.Laptops;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface LaptopRepository extends JpaRepository<Laptop, Integer>{
	@Query(value="select brand from laptop_details",nativeQuery=true)
	public List<String> getByBrand();


}
