package com.example.Employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String add(Employer emp) {
		empRepo.save(emp);
		return "Sucessfully saved";
		}
	public String setDatas(Employer emp) {
		empRepo.save(emp).getId();
		return "Sucessfully updated";
		}
	public String deleteDatas(int id) {
	    empRepo.deleteById(id);
	    return "data has been deleted";
	}
	public List<Employer> getAllInfo2(){
		return empRepo.findAll();
	}
	public Employer findId(int id){
		return empRepo.findById(id).get();
	}
	public String save(List<Employer> e) {
		empRepo.saveAll(e);
		return "Bulk object has been added";
	}
	public String deleteAlll() {
		empRepo.deleteAll();
		return "all object has been deleted";
	}
	public List<Employer> getBySalaryRange(int salary1, int salary2){
		return empRepo.getBySalaryRange(salary1,salary2);
	}
	public List<Integer> getAllSalary(){
		return empRepo.getAllSalary();
	}
	public Employer getSal(int id){
		return empRepo.findById(id).get(); //getting only salary from id
	}
}
