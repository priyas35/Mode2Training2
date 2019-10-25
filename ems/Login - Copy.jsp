<%@page import="com.hcl.employee.LoginCheck"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int empId=Integer.parseInt(request.getParameter("empId"));
		String passCode=request.getParameter("secretCode");
		String user="";
		user+=empId;
		boolean result=LoginCheck.authenticate(empId, passCode);
		if(result==true) {
			session.setAttribute("user", user);
	%>
	<jsp:forward page="Dashboard.jsp" />
	<%
		} else {
	%>
	<p>Invalid Credentials...</p>
	<jsp:include page="login.html" />
	<%
		}
		
	%>
</body>
</html>