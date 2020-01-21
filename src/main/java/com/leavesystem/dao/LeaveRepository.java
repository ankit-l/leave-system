package com.leavesystem.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.leavesystem.dto.LeaveTypeDto;
import com.leavesystem.model.EmpLeaveRequest;

@Repository
public interface LeaveRepository extends CrudRepository<EmpLeaveRequest, String>{
	
	//@AllowFiltering
	@Query("select * from leave_type  WHERE status =:status  ALLOW FILTERING")
	public List<LeaveTypeDto> getAllLeaveType(@Param("status")String status);

	@Query("select * from emp_leave_request  WHERE req_leave_id =:req_leave_id ")
	public EmpLeaveRequest getfindById(@Param("req_leave_id") UUID req_leave_id );
}

