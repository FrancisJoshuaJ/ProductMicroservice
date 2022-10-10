package com.example.UseProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseProductController {
	@Autowired
	RestTemplate resttemp;

	@GetMapping("/netPrice")
	public List<UseProduct> getNetPrice() {
		String url1 = "http://localhost:8080/get";
		String url2 = "http://localhost:8081/getperc/-";
		ResponseEntity<List<UseProduct>> response1 = resttemp.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<UseProduct>>() {
				});
		List<UseProduct> P = response1.getBody();
		P.forEach(x -> {
			int hsn = x.getHsn();
			ResponseEntity<Integer> response2 = resttemp.exchange(url2 + hsn, HttpMethod.GET, null, Integer.class);
			Integer percentage = response2.getBody();
			x.setPrice(x.getPrice() + (x.getPrice() * percentage) / 100);

		});
		return P;

	}
}
