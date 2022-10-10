package com.example.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cusRepo;
	public String getC(List<Customer> cus) {
		 cusRepo.saveAll(cus);
		 return "saved";
	}
	//@ExceptionHandler //try,catch-to handle exception.
	

}
