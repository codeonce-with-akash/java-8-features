package com.codeones.lambda.employee;

public class Employee {

	private Integer empNum;
	private String empName;

	public Employee(Integer empNum, String empName) {
		super();
		this.empNum = empNum;
		this.empName = empName;
	}

	public Integer getEmpNum() {
		return empNum;
	}

	public void setEmpNum(Integer empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", empName=" + empName + "]";
	}

}
