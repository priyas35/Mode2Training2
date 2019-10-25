package com.hcl.employee;

import java.sql.Date;

public class EmployeeDetails {
	
	private int empId;
	private String empName;
	private String empEmail;
	private String empMobNo;
	private String empDeptName;
	private Date d;
	private int empMgrId;
	private int empLeaveBal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	public String getEmpDeptName() {
		return empDeptName;
	}
	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public int getEmpMgrId() {
		return empMgrId;
	}
	public void setEmpMgrId(int empMgrId) {
		this.empMgrId = empMgrId;
	}
	public int getEmpLeaveBal() {
		return empLeaveBal;
	}
	public void setEmpLeaveBal(int empLeaveBal) {
		this.empLeaveBal = empLeaveBal;
	}
//	public EmployeeDetails(int empId, String empName, String empEmail, String empMobNo, String empDeptName, Date d,
//			int empMgrId, int empLeaveBal) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empEmail = empEmail;
//		this.empMobNo = empMobNo;
//		this.empDeptName = empDeptName;
//		this.d = d;
//		this.empMgrId = empMgrId;
//		this.empLeaveBal = empLeaveBal;
//	}
	
	
}
