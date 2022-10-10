package com.example.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service //to write business logics
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public String add(Employer emp) {
		return empDao.add(emp);
	}
	public String setDatas(Employer emp) {
		return empDao.setDatas(emp);
	}
	public String deleteDatas(int id) {
		return empDao.deleteDatas(id);
	}
	public List<Employer> getAllInfo1(){
		return empDao.getAllInfo2();
	}
	public Employer findId(int id){
		return empDao.findId(id);
	}
	public String save(List<Employer> e) {
		return empDao.save(e);
	}
	public String deleteAlll() {
		return empDao.deleteAlll();
	}
	public List<Employer> getBySalaryRange(int salary1, int salary2){
		return empDao.getBySalaryRange(salary1,salary2);
	}
	public List<Integer> getAllSalary(){
		return empDao.getAllSalary();
	}
	public int getSal(int id){
	 Employer e= empDao.getSal(id);
	 return e.getSalary(); //getting only salary from id
	}
	

}
