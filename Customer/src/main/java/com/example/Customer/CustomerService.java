package com.example.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerDao cusDao; 
	public String getC(List<Customer> cus) {
		return cusDao.getC(cus);
	}

}
