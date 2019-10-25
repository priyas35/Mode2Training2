package com.hcl.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCheck {

	public static boolean authenticate(int empId, String passCode) {
		Connection cp = DaoConnection.getConnection();
		String sql = " SELECT * FROM employlogin WHERE empId = ? AND secretCode = ?";
		boolean flag=false;
		try {
			PreparedStatement ps = cp.prepareStatement(sql);
			ps.setInt(1, empId);
			ps.setString(2, passCode);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				flag=true;
			} else {
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
