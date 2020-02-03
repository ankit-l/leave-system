package com.leavesystem.controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leavesystem.dto.EmpLeaveRequestDto;
import com.leavesystem.model.EmpLeaveRequest;
import com.leavesystem.model.LeaveType;
import com.leavesystem.service.LeaveService;

/**
 * @author Ankit
 * this is rest con troller for leave system
 */
@RestController
@RequestMapping("/leave")
public class LeaveController {

	@Autowired
	private LeaveService leaveService;

	@GetMapping("/leave-list")
	public List<EmpLeaveRequest> getAllEmpLeaves() {

		return leaveService.getAllEmpLeaves();
	}

	@PostMapping(value = "/apply-leave", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void applyLeave(@RequestBody EmpLeaveRequestDto leaverequestdto) throws IOException {
		System.out.println(leaverequestdto.toString());
		leaveService.applyLeave(leaverequestdto);
	}

	@PostMapping("/leavetype")
	public List<LeaveType> getAllLeaveType() {
		return leaveService.getAllLeaveType();
	}

	@GetMapping("/leave-by-Id/{req_leave_id}")
	public EmpLeaveRequest getLeaveById(@PathVariable("req_leave_id") UUID req_leave_id) {
		return leaveService.getLeaveById(req_leave_id);
	}
}
