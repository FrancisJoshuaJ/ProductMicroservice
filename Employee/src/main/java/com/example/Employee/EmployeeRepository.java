package com.example.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employer, Integer> {


@Query(value="select * from employee_details where salary>? and salary<?",nativeQuery = true)
public List<Employer> getBySalaryRange(int salary1,int salary2 );

@Query(value="select salary from employee_details",nativeQuery=true)
public List<Integer> getAllSalary();

}

