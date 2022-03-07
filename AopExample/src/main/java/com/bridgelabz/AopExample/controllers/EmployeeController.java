package com.bridgelabz.AopExample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.AopExample.models.Employee;
import com.bridgelabz.AopExample.services.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/add")
	public Employee addEmployee(@RequestParam(value = "empId") String empId , @RequestParam(value = "firstName") String firstName , @RequestParam(value = "lastName") String lastName) {
		return employeeService.addEmployee(empId , firstName , lastName);
	}
	
	@GetMapping(value = "/delete/{empId}")
	public String deleteEmployee(@PathVariable String empId) {
		employeeService.deleteEmployee(empId);
		return "Employee removed...!";
	}
	
}
