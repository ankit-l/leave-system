package com.leavesystem.dao;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.leavesystem.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

	@Query("select * from emp  WHERE emp_id =:emp_id ")
	public Employee findById(@Param("emp_id") Integer emp_id );
	
	@Query("DELETE  FROM emp  WHERE emp_id =:emp_id ")
	public Employee findByIdwithDelete(@Param("emp_id") Integer emp_id);

	

}
