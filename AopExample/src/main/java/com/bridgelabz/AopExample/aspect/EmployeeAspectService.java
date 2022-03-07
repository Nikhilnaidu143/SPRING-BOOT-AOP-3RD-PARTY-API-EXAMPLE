package com.bridgelabz.AopExample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspectService {

//	@Before(value = "execution(* com.bridgelabz.AopExample.services.EmployeeService.*(..)) and args(empId , firstName , lastName)")
//	public void beforeAdvice(JoinPoint joinPoint, String empId, String firstName, String lastName) {
//		System.out.println("Before method :- " + joinPoint.getSignature());
//		System.out.println("Craeting employee with First name :- " + firstName + ", Last name :- " + lastName  + ", Id :- " + empId);
//	}
	
	@After(value = "execution(* com.bridgelabz.AopExample.services.EmployeeService.*(..)) and args(empId , firstName , lastName)")
	public void beforeAdvice(JoinPoint joinPoint, String empId, String firstName, String lastName) {
		System.out.println("After method :- " + joinPoint.getSignature());
		System.out.println("Craeting employee with First name :- " + firstName + ", Last name :- " + lastName  + ", Id :- " + empId);
	}
}
