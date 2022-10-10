package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BankController {
	@Autowired
	BankService bankserv;
	@PostMapping("/save")
	public String saveDetails(@RequestBody Bank  b) {
		return bankserv.saveDetails(b);
	}
	@GetMapping(value="getifscByBranch/{branch}")
	public String getifsc(@PathVariable String branch){
		return bankserv.getifsc(branch);
	}
	

}
