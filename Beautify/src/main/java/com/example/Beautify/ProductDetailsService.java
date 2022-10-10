package com.example.Beautify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService {
	@Autowired
	ProductDetailsDao beautyDao;
	public String saveDetails2(ProductDetailsEntity p) {
		return beautyDao.saveDetails3(p);
	}
	public String updateDetails2(ProductDetailsEntity p) {
		return beautyDao.updateDetails3(p);
	}

}
