package com.leavesystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.leavesystem.dto.EmpLeaveRequestDto;
import com.leavesystem.model.EmpLeaveRequest;
import com.leavesystem.model.LeaveType;

@Service
public interface LeaveService {

	public List<EmpLeaveRequest> getAllEmpLeaves();

	public void applyLeave(EmpLeaveRequestDto leaverequestdto) ;

	public List<LeaveType> getAllLeaveType();

	public EmpLeaveRequest getLeaveById(UUID req_leave_id);



}
