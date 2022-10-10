package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.websocket.server.PathParam;

@RestController //request and response purpose will check by layer 0+
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@Value("hii")
	public String message;
	
	@Value("$(ff)")
	public String l;
	
	@GetMapping(value="/getParam")
	public String getParam(@PathParam (
			value="") String a ) {
		return a;
	}
	
	@PostMapping (value="/post")
	public String setData (@RequestBody Employer emp) {
		return empService.add(emp);
	}
	@PutMapping(value="/update")
	public String setDatas(@RequestBody Employer emp) {
		return empService.setDatas(emp);
	}
	@DeleteMapping(value ="/delete/{id}")
	public String deleteDatas(@PathVariable int id) {
		return empService.deleteDatas(id);
	}
	@GetMapping(value="/getAll")
	public List<Employer>getAllInfo(){
		return empService.getAllInfo1();
	}
	@GetMapping(value="/getAll/{id}")
	public  Employer findId(@PathVariable int id){
		return empService.findId(id);
	}
	@PostMapping(value="/saveAll")
	public String save(@RequestBody List<Employer> e) {
		return empService.save(e);
	}
	@DeleteMapping(value="/deleteAll")
	public String deleteAlll() {
		return empService.deleteAlll();
	}
	@GetMapping(value="getBySalary/{from}/{to}")
	public List<Employer> getBySalaryRange(@PathVariable("from")int salary1,@PathVariable("to")int salary2){
		return empService.getBySalaryRange(salary1,salary2);
	}
	@GetMapping(value="getAllSalary")
	public List<Integer> getAllSalary(){
		return empService.getAllSalary();
	}
	@GetMapping(value="getSalById/{id}") //getting only salary from id 
	public int getSal(@PathVariable int id){
		return empService.getSal(id);
	}
	

}
