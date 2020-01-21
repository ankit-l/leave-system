package com.leavesystem.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("emp_leave_request")
public class EmpLeaveRequest {
	
	@PrimaryKey 
	@Column(value = "req_leave_id")
	public UUID req_leave_id;
	
	@Column(value = "Sno")
	public Integer sNo;
	
	@Column(value = "req_emp_id")
	public Integer reqEmpId;
	
	@Column(value = "req_leave_type")
	public String reqLeaveType;
	
	@Column(value = "req_leave_start_dt")
	public Date reqLeaveStartDt;
	
	@Column(value = "req_leave_end_dt")
	public Date reqLeaveEndDt;
	
	@Column(value = "req_leave_days")
	public String reqLeaveDays;
	
	@Column(value = "req_leave_reason")
	public String reqLeaveReason;

	@Column(value = "req_leave_status")
	public String reqLeaveStatus;
	
	@Column(value = "req_leave_submitted")
	public Date reqLeaveSubmitted;
	
	@Column(value = "req_approver_comments")
	public String reqApproverComments;
	
	@Column(value = "req_approver_date")
	public Date reqApproverDate;
	
	@Column(value = "req_created_date")
	public Date reqCreatedDate;
	
	@Column(value = "req_created_by")
	public String reqCreatedBy;
	
	@Column(value = "req_updated_date")
	public Date reqUpdatedDate;
	
	@Column(value = "req_updated_by")
	public String reqUpdatedBy;
	
	@Column(value = "leave_id")
	public Integer leave_id;
	

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public Integer getReqEmpId() {
		return reqEmpId;
	}

	public void setReqEmpId(Integer reqEmpId) {
		this.reqEmpId = reqEmpId;
	}

	public String getReqLeaveType() {
		return reqLeaveType;
	}

	public void setReqLeaveType(String reqLeaveType) {
		this.reqLeaveType = reqLeaveType;
	}

	public Date getReqLeaveStartDt() {
		return reqLeaveStartDt;
	}

	public void setReqLeaveStartDt(Date reqLeaveStartDt) {
		this.reqLeaveStartDt = reqLeaveStartDt;
	}

	public Date getReqLeaveEndDt() {
		return reqLeaveEndDt;
	}

	public void setReqLeaveEndDt(Date reqLeaveEndDt) {
		this.reqLeaveEndDt = reqLeaveEndDt;
	}

	public String getReqLeaveDays() {
		return reqLeaveDays;
	}

	public void setReqLeaveDays(String reqLeaveDays) {
		this.reqLeaveDays = reqLeaveDays;
	}

	public String getReqLeaveReason() {
		return reqLeaveReason;
	}

	public void setReqLeaveReason(String reqLeaveReason) {
		this.reqLeaveReason = reqLeaveReason;
	}

	public String getReqLeaveStatus() {
		return reqLeaveStatus;
	}

	public void setReqLeaveStatus(String reqLeaveStatus) {
		this.reqLeaveStatus = reqLeaveStatus;
	}

	public Date getReqLeaveSubmitted() {
		return reqLeaveSubmitted;
	}

	public void setReqLeaveSubmitted(Date reqLeaveSubmitted) {
		this.reqLeaveSubmitted = reqLeaveSubmitted;
	}

	public String getReqApproverComments() {
		return reqApproverComments;
	}

	public void setReqApproverComments(String reqApproverComments) {
		this.reqApproverComments = reqApproverComments;
	}

	public Date getReqApproverDate() {
		return reqApproverDate;
	}

	public void setReqApproverDate(Date reqApproverDate) {
		this.reqApproverDate = reqApproverDate;
	}

	public Date getReqCreatedDate() {
		return reqCreatedDate;
	}

	public void setReqCreatedDate(Date reqCreatedDate) {
		this.reqCreatedDate = reqCreatedDate;
	}

	public String getReqCreatedBy() {
		return reqCreatedBy;
	}

	public void setReqCreatedBy(String reqCreatedBy) {
		this.reqCreatedBy = reqCreatedBy;
	}

	public Date getReqUpdatedDate() {
		return reqUpdatedDate;
	}

	public void setReqUpdatedDate(Date reqUpdatedDate) {
		this.reqUpdatedDate = reqUpdatedDate;
	}

	public String getReqUpdatedBy() {
		return reqUpdatedBy;
	}

	public void setReqUpdatedBy(String reqUpdatedBy) {
		this.reqUpdatedBy = reqUpdatedBy;
	}

	public UUID getReq_leave_id() {
		return req_leave_id;
	}

	public void setReq_leave_id(UUID req_leave_id) {
		this.req_leave_id = req_leave_id;
	}

	public Integer getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(Integer leave_id) {
		this.leave_id = leave_id;
	}

	

	
	
	
}
