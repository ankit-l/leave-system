package com.leavesystem.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leavesystem.dto.EmployeeDto;
import com.leavesystem.model.Employee;
import com.leavesystem.service.EmployeeService;

/**
 * @author Ankit
 *
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	 public List<Employee> getEmployees()
	 {
	  
	  return employeeService.getAllEmp();
	 }
	
	@PostMapping(value = "/employees",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public void saveEmployees(@RequestBody EmployeeDto empdto)throws IOException,
     HttpMediaTypeNotSupportedException
	 {
	  System.out.println(empdto.toString());
	  employeeService.saveEmp(empdto);
	 }
	
	@GetMapping("/employees/{emp_id}")
	 public Employee getEmployeeById(
			 @PathVariable("emp_id") Integer emp_id)
	 {
	  
	  return employeeService.getEmployeeById(emp_id);
	 }
	@PutMapping("/employees/{emp_id}")
	 public ResponseEntity<Employee> updateEmployee(
			 @PathVariable("emp_id") Integer emp_id,
			 @RequestBody EmployeeDto empdto)
	 {
	  
	  return employeeService.updateEmployee(emp_id,empdto);
	 }
	
	@DeleteMapping("/employees/{emp_id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "emp_id") Integer emp_id){
		
		return employeeService.deleteEmployee(emp_id);
		
	}
	
	
}
