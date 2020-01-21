package com.leavesystem.dto;

import java.util.Date;

public class EmpLeaveRequestDto {
	
	
	public String req_leave_id;
	
	public Integer sNo;
	
	public Integer reqEmpId;
	
	public String reqLeaveType;
	
	public Date reqLeaveStartDt;
	
	public Date reqLeaveEndDt;
	
	public String reqLeaveDays;
	
	public String reqLeaveReason;

	public String reqLeaveStatus;
	
	public Date reqLeaveSubmitted;
	
	public String reqApproverComments;
	
	public Date reqApproverDate;
	
	public Date reqCreatedDate;
	
	public String reqCreatedBy;
	
	public Date reqUpdatedDate;
	
	public String reqUpdatedBy;
	
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

	public String getReq_leave_id() {
		return req_leave_id;
	}

	public void setReq_leave_id(String req_leave_id) {
		this.req_leave_id = req_leave_id;
	}

	@Override
	public String toString() {
		return "EmpLeaveRequestDto [req_leave_id=" + req_leave_id + ", sNo=" + sNo + ", reqEmpId=" + reqEmpId
				+ ", reqLeaveType=" + reqLeaveType + ", reqLeaveStartDt=" + reqLeaveStartDt + ", reqLeaveEndDt="
				+ reqLeaveEndDt + ", reqLeaveDays=" + reqLeaveDays + ", reqLeaveReason=" + reqLeaveReason
				+ ", reqLeaveStatus=" + reqLeaveStatus + ", reqLeaveSubmitted=" + reqLeaveSubmitted
				+ ", reqApproverComments=" + reqApproverComments + ", reqApproverDate=" + reqApproverDate
				+ ", reqCreatedDate=" + reqCreatedDate + ", reqCreatedBy=" + reqCreatedBy + ", reqUpdatedDate="
				+ reqUpdatedDate + ", reqUpdatedBy=" + reqUpdatedBy + ", getsNo()=" + getsNo() + ", getReqEmpId()="
				+ getReqEmpId() + ", getReqLeaveType()=" + getReqLeaveType() + ", getReqLeaveStartDt()="
				+ getReqLeaveStartDt() + ", getReqLeaveEndDt()=" + getReqLeaveEndDt() + ", getReqLeaveDays()="
				+ getReqLeaveDays() + ", getReqLeaveReason()=" + getReqLeaveReason() + ", getReqLeaveStatus()="
				+ getReqLeaveStatus() + ", getReqLeaveSubmitted()=" + getReqLeaveSubmitted()
				+ ", getReqApproverComments()=" + getReqApproverComments() + ", getReqApproverDate()="
				+ getReqApproverDate() + ", getReqCreatedDate()=" + getReqCreatedDate() + ", getReqCreatedBy()="
				+ getReqCreatedBy() + ", getReqUpdatedDate()=" + getReqUpdatedDate() + ", getReqUpdatedBy()="
				+ getReqUpdatedBy() + ", getReq_leave_id()=" + getReq_leave_id() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(Integer leave_id) {
		this.leave_id = leave_id;
	}

	


}
