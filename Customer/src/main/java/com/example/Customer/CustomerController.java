package com.example.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;	
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.ArrayList;
@RestController
public class CustomerController {
	@Autowired
	RestTemplate resttemp;
	@Autowired
	CustomerService cserv;

	@PostMapping(value="/getAll")
	public String getAll(@RequestBody List<Customer> cus) {
	cus.forEach(x-> {
		String branch =x.getBranch();
		String url1="http://localhost:8080/getifscByBranch/";
		ResponseEntity<Integer> response1=resttemp.exchange(url1+branch,HttpMethod.GET,null,Integer.class);
				Integer ifsc=response1.getBody();
				x.setIfsc(ifsc);	
	
	});
	return cserv.getC(cus);

	}


}
