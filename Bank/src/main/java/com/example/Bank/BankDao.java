package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	@Autowired
	BankRepository banRepo;
	public String saveDetails(Bank b) {
		banRepo.save(b);
		return "Sucessfully saved";
		}
	public String getifsc(String branch){
		return banRepo.getifsc(branch);	}


}
