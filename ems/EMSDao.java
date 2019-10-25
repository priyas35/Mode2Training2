package com.hcl.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EMSDao {

	PreparedStatement pst;
	 Connection con;
	
	
	public EmployeeDetails SearchEmp(int empno){
		con=DaoConnection.getConnection();
		EmployeeDetails obj=new EmployeeDetails();
		String cmd="select * from employee where empId=?";
		try {
			pst=con.prepareStatement(cmd);
			
			pst.setInt(1,empno);
			ResultSet rs = pst.executeQuery();
			rs.next();
			obj.setEmpId(rs.getInt("empid"));
			obj.setEmpName(rs.getString("empName"));
			obj.setEmpEmail(rs.getString("empemail"));
			obj.setEmpMobNo(rs.getString("EMPMOBNO"));
			obj.setEmpDeptName(rs.getString("EMPDPTNAME"));
			obj.setEmpMgrId(rs.getInt("EMPMGRID"));
			obj.setD(rs.getDate("EMPDATEJOINED"));
			obj.setEmpLeaveBal(rs.getInt("EMPleavebalance"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public <>
	
}
