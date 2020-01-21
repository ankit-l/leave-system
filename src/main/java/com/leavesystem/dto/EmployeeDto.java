package com.leavesystem.dto;

public class EmployeeDto {
	
	public Integer emp_id;
	public String empName;
	public String empCity;
	public Double empSal;
	
	
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "EmployeeDto [emp_id=" + emp_id + ", empName=" + empName + ", empCity=" + empCity + ", empSal=" + empSal
				+ "]";
	}
	
}
