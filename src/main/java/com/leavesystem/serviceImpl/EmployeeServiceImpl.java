package com.leavesystem.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.leavesystem.dao.EmployeeRepository;
import com.leavesystem.dto.EmployeeDto;
import com.leavesystem.model.Employee;
import com.leavesystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	 private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmp() {
		 Iterable<Employee> result = employeeRepository.findAll();
		  List<Employee> employeesList = new ArrayList<Employee>();
		  result.forEach(employeesList::add);
		  return employeesList;
	}

	@Override
	public void saveEmp(EmployeeDto empdto) {
		Employee emp = new Employee();
		emp.setEmp_id(empdto.getEmp_id());
		emp.setEmpCity(empdto.getEmpCity());
		emp.setEmpName(empdto.getEmpName());
		emp.setEmpSal(empdto.getEmpSal());
		employeeRepository.save(emp);
	}

	@Override
	public Employee getEmployeeById( Integer emp_id) {
		 
	  return employeeRepository.findById(emp_id);
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Integer emp_id, EmployeeDto empdto) {
		Employee emp = new Employee();
		emp.setEmp_id(emp_id);
		emp.setEmpCity(empdto.getEmpCity());
		emp.setEmpName(empdto.getEmpName());
		emp.setEmpSal(empdto.getEmpSal());
		final Employee updatedEmployee = employeeRepository.save(emp);
        return ResponseEntity.ok(updatedEmployee);
		
	}

	@Override
	public Map<String, Boolean> deleteEmployee(Integer emp_id) {
		 Employee employee = employeeRepository.findByIdwithDelete(emp_id);
		employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
	}

	

	
}
