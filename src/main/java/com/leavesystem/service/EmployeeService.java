package com.leavesystem.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.leavesystem.dto.EmployeeDto;
import com.leavesystem.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmp();

	public void saveEmp(EmployeeDto empdto);

	public Employee getEmployeeById(Integer emp_id);

	public ResponseEntity<Employee> updateEmployee(Integer emp_id, EmployeeDto empdto);

	public Map<String, Boolean> deleteEmployee(Integer emp_id);

}
