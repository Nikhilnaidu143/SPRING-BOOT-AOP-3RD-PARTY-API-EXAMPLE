package com.bridgelabz.AopExample.services;

import org.springframework.stereotype.Service;

import com.bridgelabz.AopExample.models.Employee;

@Service
public class EmployeeService {

	public Employee addEmployee(String empId, String firstName, String lastName) {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}

}
