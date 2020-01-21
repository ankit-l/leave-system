package com.leavesystem.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.utils.UUIDs;
import com.leavesystem.dao.LeaveRepository;
import com.leavesystem.dao.LeaveTypeRepository;
import com.leavesystem.dto.EmpLeaveRequestDto;
import com.leavesystem.model.EmpLeaveRequest;
import com.leavesystem.model.LeaveType;
import com.leavesystem.service.LeaveService;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveRepository leaverepository;
	
	@Autowired
	private LeaveTypeRepository leavetyperepository;
	
	@Override
	public List<EmpLeaveRequest> getAllEmpLeaves() {
		
		 Iterable<EmpLeaveRequest> result = leaverepository.findAll();
		  List<EmpLeaveRequest> empleaveList = new ArrayList<EmpLeaveRequest>();
		  result.forEach(empleaveList::add);
		  return empleaveList;
	}
	@Override
	public void applyLeave(EmpLeaveRequestDto leaverequestdto)  {
		
		EmpLeaveRequest empLeaveRequest = new EmpLeaveRequest();
		 UUID uuid = UUID.randomUUID();
	        //String randomUUIDString = uuid.toString();
		empLeaveRequest.setsNo(leaverequestdto.getsNo());
		empLeaveRequest.setReq_leave_id(UUIDs.timeBased());//leaverequestdto.getReq_leave_id()
		empLeaveRequest.setReqEmpId(leaverequestdto.getReqEmpId());
		//empLeaveRequest.setLeave_id(leaverequestdto.getLeave_id());
		//System.out.println(leaverequestdto.getReqLeaveType().toString());
		empLeaveRequest.setReqLeaveType(leaverequestdto.getReqLeaveType());
		empLeaveRequest.setReqLeaveType(leaverequestdto.getReqLeaveType());
		empLeaveRequest.setReqLeaveStartDt(leaverequestdto.getReqLeaveStartDt());
		empLeaveRequest.setReqLeaveEndDt(leaverequestdto.getReqLeaveEndDt());
		empLeaveRequest.setReqLeaveDays(leaverequestdto.getReqLeaveDays());
		empLeaveRequest.setReqLeaveReason(leaverequestdto.getReqLeaveReason());
		empLeaveRequest.setReqLeaveStatus("PENDING");
		empLeaveRequest.setReqLeaveSubmitted(new Date());
		//empLeaveRequest.setReqApproverComments(leaverequestdto.getReqApproverComments());
		//empLeaveRequest.setReqApprover_date(new Date());
		empLeaveRequest.setReqCreatedBy("1");
		empLeaveRequest.setReqUpdatedBy("1");
		empLeaveRequest.setReqCreatedDate(new Date());
		empLeaveRequest.setReqUpdatedDate(new Date());
		leaverepository.save(empLeaveRequest);

		
	}
	@Override
	public List<LeaveType> getAllLeaveType() {
		 Iterable<LeaveType> result = leavetyperepository.findAll();
		  List<LeaveType> leaveList = new ArrayList<LeaveType>();
		  result.forEach(leaveList::add);
		  return leaveList;
		  
	}
	@Override
	public EmpLeaveRequest getLeaveById(UUID req_leave_id) {
		// TODO Auto-generated method stub
		return leaverepository.getfindById(req_leave_id);
	}
	}


