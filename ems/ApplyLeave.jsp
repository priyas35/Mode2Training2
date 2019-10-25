<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ApplyLeave.jsp" method="get">
<center>
<h1>Apply Leave</h1><br/><br/><br/>
</center>
<table border = "0" >
<tr>
	<td>Start Date : </td>
	<td border:1px><input type="Date" name="sd"/></td>
</tr>
<tr>
	<td>End Date : </td>
	<td><input type="Date" name="ed"/></td>
</tr>
<tr>
	<td>Number of Days : </td>
	<td><input type ="text" name="noofDays"/></td>
</tr>
<tr>
	<td>Leave Type : </td>
	<td><select>
  	<option value="EL">Earned Leave</option>
	</select></td>
</tr>
<tr>
    <td>Leave Reason : </td>
    <td><input type="text" name="reason"/></td>
</tr>
<tr>
     <td><input type="submit" value="Apply"/></td>
     <td><input type="submit" value="Cancel"></td>
</tr>
</table>
</form>
</body>
</html>