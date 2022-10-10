package com.example.Beautify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDetailsDao {
	@Autowired
	ProductDetailsRepository beautyRepo;
	public String saveDetails3(ProductDetailsEntity p) {
		 beautyRepo.save(p);
		 return "sucessfully posted";
	}
	public String updateDetails3(ProductDetailsEntity p) {
		beautyRepo.save(p);	
		return "sucessfully updated";
	}

}
