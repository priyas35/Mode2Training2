<%@page import="com.hcl.employee.EMSDao"%>
<%@page import="com.hcl.employee.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MyDetails.jsp" method="get">
<%
	int empId=Integer.parseInt((String)session.getAttribute("user"));
%>
<% EmployeeDetails obj=new EmployeeDetails();%>
<% obj=new EMSDao().SearchEmp(empId); %>
<% int mgrId = obj.getEmpMgrId(); 
	EmployeeDetails obj1 = new EmployeeDetails();
	obj1=new EMSDao().SearchEmp(mgrId);
	int empId1= obj1.getEmpId();
%>
<h1>Manager Details Section</h1><br/><br/><br/><br/>
<table border="0" align="left">
	
  <tr>
  <td cellspacing="20" cellpadding="20"  align="left">Employee Id : <%=empId1%><br/></td>
  </tr>
  <tr>
   
  <td cellspacing="20" cellpadding="20" align="left">Full Name : <%=obj1.getEmpName() %><br/></td>
  </tr>
  <tr>
   
  <td cellspacing="20" cellpadding="20" align="left">Email Address : <%=obj1.getEmpEmail() %><br/></td>
  </tr>
  <tr>
   
  <td cellspacing="20" cellpadding="20" align="left">Mobile Number : <%=obj1.getEmpMobNo() %><br/></td>
   </tr>

</table>
</form>
</body>
</html>