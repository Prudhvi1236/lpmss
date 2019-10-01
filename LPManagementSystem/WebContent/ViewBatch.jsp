<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lpms.model.Batch" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%request.getAttribute("employee"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view batch</title>
</head>
<body>
<table width="100%" border="1">
<%request.getAttribute("employee"); %>
  <tr>
    <th scope="col">Employee Id </th>
    <th scope="row">Batch Id </th>
    <th scope="row">Batch course </th>
    <th scope="row">Batch Capacity</th>
    <th scope="row">Venue Address</th>
    
    
  </tr>
  <tr>
   <td  ><c:out value="${employee.eId }"/></td>
   <td ><c:out value="${employee.batchId }"/></td>
   <td ><c:out value="${employee.batchCourse }"/></td>
   <td ><c:out value="${employee.batchCapacity }"/></td>
   <td ><c:out value="${employee.venue.venueAddress }"/></td>
  </tr>
  
</table> 
</body>
</html>