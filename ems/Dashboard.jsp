<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DashboardServlet" method="get">
<center>
<h1>Employee Dashboard: Sections</h1>
<table border="2" cellspacing="20" cellpadding="20">
<tr>
	<th><jsp:include page="MyDetails.jsp" /></th>
	<th><jsp:include page="MyManagerDetails.jsp" /></th>
</tr>
<tr>
	<th colspan="2"><jsp:include page="ApplicationSection.jsp" /></th>
</tr>
<tr>
	<th colspan="2"><jsp:include page="ReportingEmployee.jsp" /></th>
</tr>
</table>
</center>
</form>
</body>
</html>