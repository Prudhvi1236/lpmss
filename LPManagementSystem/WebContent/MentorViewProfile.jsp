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
</head>
<body>
<!-- <form action="UpdateProfile.jsp" method="get"> -->
<table width="100%" height="536" border="0">
<%request.getAttribute("employee"); %>
  <tr>
    <th width="25%" scope="col">Employee Id </th>
    <td align="center" ><c:out value="${employee.eId }"/></td>
    
  </tr>
  <tr>
    <th scope="row">Name </th>
    <td align="center"><c:out value="${employee.name }"/></td>
   
  </tr>
  <tr>
    <th scope="row">Email </th>
    <td align="center"><c:out value="${employee.email }"/></td>
   </tr>
  <tr>
    <th scope="row">Phone Number</th>
    <td align="center"><c:out value="${employee.phno }"/></td>
  </tr>
  <tr>
    <th scope="row">Password</th>
    <td align="center"><c:out value="${employee.password }"/></td>
  </tr>
</table> 
 

<!-- </form> -->

</body>
</html>