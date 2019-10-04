<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lpms.model.Batch" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%request.getAttribute("employee"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view venue</title>
<style type="text/css">
.wrapper {
	text-align: center;
}

</style>
</head>
<body bgcolor="#2874A6">
<h2 align="center">venue</h2>
<%Batch emp=(Batch)request.getAttribute("employee");
 if(emp!=null)
 {
%>
<table width="50%" border="2" align="center">

  <tr >
    <th bgcolor="#B3B6B7"scope="col">Employee Id </th>
    <td   bgcolor="white"><c:out value="${employee.eId }"/></td>
    </tr>
    <tr>
      <th bgcolor="#B3B6B7"scope="row">Batch Id </th>
      <td bgcolor="white"> <c:out value="${employee.batchId }"/></td>
     </tr>
      <tr>
      <th bgcolor="#B3B6B7"scope="row">Batch course </th>
      <td  bgcolor="white"><c:out value="${employee.batchCourse }"/></td>
 	 </tr>
 	  <tr>  
      <th bgcolor="#B3B6B7"scope="row">Batch Capacity</th>
      <td  bgcolor="white"><c:out value="${employee.batchCapacity }"/></td>
     </tr>
      <tr>
    <th bgcolor="#B3B6B7"scope="row">Venue Address</th>
    <td bgcolor="white"><c:out value="${employee.venue.venueAddress }"/></td>
     </tr>
    
 <%
 }
 else
 {
 %>
 <h1 align="center">venue not allocated</h1>
 <%
 }
 %>
   
</table> 
<br>
	<div class="wrapper">
		<a href="MentorHome.jsp"><button type="button">Home</button></a>
	</div>
</body>
</html>