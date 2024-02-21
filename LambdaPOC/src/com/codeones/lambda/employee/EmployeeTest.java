package com.codeones.lambda.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(101, "YASH"), 
				new Employee(105, "SANDIP"), 
				new Employee(103, "KARAN"),
				new Employee(104, "DATTA"),
				new Employee(102, "KULDIP")
				);
		
		System.out.println(employees);

		//1. BASED ON EMP ID
		employees.sort((emp1, emp2) -> emp1.getEmpNum() > emp2.getEmpNum() ? 1 : (emp1.getEmpNum() < emp2.getEmpNum()) ? -1 : 0);
		System.out.println("AFTER ASC SORTING : " + employees);
		
		
		employees.sort((emp1, emp2) -> emp1.getEmpNum() > emp2.getEmpNum() ? -1 : (emp1.getEmpNum() < emp2.getEmpNum()) ? 1 : 0);
		System.out.println("AFTER DESC SORTING : " + employees);

		//2 BASED ON EMP NAME
		employees.sort((emp1, emp2) -> emp1.getEmpName().compareTo(emp2.getEmpName()));
		System.out.println("AFTER ASC SORTING BASED ON EMP NAME : " + employees);
		
		employees.sort((emp1, emp2) -> emp2.getEmpName().compareTo(emp1.getEmpName()));
		System.out.println("AFTER DESC SORTING BASED ON EMP NAME : " + employees);
		
		
	}
}
