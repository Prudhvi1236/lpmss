<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lpms.model.LP" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%request.getAttribute("employee"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
<style type="text/css">
.wrapper {
	text-align: center;
}
a.button {
    -webkit-appearance: button;
    -moz-appearance: button;
    appearance: button;
    padding: 2px 3px;
	 margin: 4px 2px;
    text-decoration: none;
    color: initial;
}
</style>
</head>
<body bgcolor="#2874A6">
<h2 align="center" style="color:white;">Profile</h2>
<table width="45%" height="550" border="1" align="center">
<%request.getAttribute("employee"); %>
  <tr>
    <th bgcolor="white"width="25%" scope="col">Employee Id </th>
    <td bgcolor="white"align="center" ><c:out value="${employee.eId }"/></td>
    
  </tr>
  <tr>
    <th bgcolor="white"scope="row">Name </th>
    <td bgcolor="white"align="center"><c:out value="${employee.name }"/></td>
   
  </tr>
  <tr>
    <th bgcolor="white"scope="row">Email </th>
    <td bgcolor="white"align="center"><c:out value="${employee.email }"/></td>
   </tr>
  <tr>
    <th bgcolor="white"scope="row">Phone Number</th>
    <td bgcolor="white"align="center"><c:out value="${employee.phno }"/></td>
  </tr>
  <tr>
    <th bgcolor="white"scope="row">Password</th>
    <td bgcolor="white"align="center"><c:out value="${employee.password }"/></td>
  </tr>
  <tr>
    <th bgcolor="white"scope="row">Batch Id</th>
    <td bgcolor="white"align="center"><c:out value="${employee.batchId }"/></td>
  </tr>
</table> 
<br>
 <center>
<!-- <input type="submit" value="Update"> -->
<a href="UpdateProfile.jsp?eId=${employee.geteId()}" class="button">Update</a>
</center>
	<div class="wrapper">
		<a href="LPHome.jsp"><button type="button">Home</button></a>
	</div>

<!-- </form> -->

</body>
</html>