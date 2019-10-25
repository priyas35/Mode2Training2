package com.hcl.employee;

import java.sql.Date;

public class LeaveHistory {
	
	private int leaId;
	private Date sd;
	private Date ed;
	private int noofDays;
	private String reason;
	private Date applyDate;
	private String mgrComments;
	private int empId;
	public int getLeaId() {
		return leaId;
	}
	public void setLeaId(int leaId) {
		this.leaId = leaId;
	}
	public Date getSd() {
		return sd;
	}
	public void setSd(Date sd) {
		this.sd = sd;
	}
	public Date getEd() {
		return ed;
	}
	public void setEd(Date ed) {
		this.ed = ed;
	}
	public int getNoofDays() {
		return noofDays;
	}
	public void setNoofDays(int noofDays) {
		this.noofDays = noofDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public String getMgrComments() {
		return mgrComments;
	}
	public void setMgrComments(String mgrComments) {
		this.mgrComments = mgrComments;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public LeaveHistory(int leaId, Date sd, Date ed, int noofDays, String reason, Date applyDate, String mgrComments,
			int empId) {
		super();
		this.leaId = leaId;
		this.sd = sd;
		this.ed = ed;
		this.noofDays = noofDays;
		this.reason = reason;
		this.applyDate = applyDate;
		this.mgrComments = mgrComments;
		this.empId = empId;
	}
	
	
}
