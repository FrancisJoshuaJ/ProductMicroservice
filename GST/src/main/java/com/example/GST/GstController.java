package com.example.GST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GstController {
	@Autowired
	GstService gstService;
	@GetMapping (value="/getperc/{hsn}")
	public int getPerc(@PathVariable int hsn) {
		return gstService.getPerc(hsn);
		
}

}
