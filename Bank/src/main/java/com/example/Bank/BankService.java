package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankService {
	@Autowired
	BankDao bDao;
	public String saveDetails(Bank b) {
		return bDao.saveDetails(b);
	}
	public String getifsc(String branch){
		 return bDao.getifsc(branch);
		 
		}


}
