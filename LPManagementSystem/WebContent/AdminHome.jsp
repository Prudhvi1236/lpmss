<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lpms.model.*,com.lpms.service.*,java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%request.getAttribute("list"); %>
<%
response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expries", "0");
%>
<%=session.getAttribute("eId") %>
<%if(session.getAttribute("eId")==null){
	 request.getRequestDispatcher("index.jsp").forward(request, response);

}%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminHome</title>

<style>
/* Add a black background color to the top navigation */
.topnav {
  background-color: #2874A6;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  
  color: white;
}


</style>

</head>
<body>
<h1 align="center">LP Management System</h1>
<div class="topnav">
  <a class="active" href="index.jsp">Home</a>
  <a href="AddMentor.jsp">Add Mentor</a>
  <a href="AddVenue.jsp">Add Venue</a>
  <a href="AllocateVenue.jsp">Allocate Venue</a>
  <a href="GetBatchRecords">Batch Records</a>
  <a href="Logout">Logout</a>
</div>
<br>
<% AdminService adminservice= new AdminServiceImp();
			List<Venue> list=adminservice.viewVenue();
			request.setAttribute("list", list);%>
<table width="100%" border="1">

  <tr bgcolor="#B3B6B7">
    <th scope="col">Venue Id </th>
    <th scope="row">Venue Address </th>
    <th scope="row">Venue Capacity</th>
  </tr>
  <c:forEach items="${list}" var="u">
  <tr>
   <td  >${u.venueId }</td>
   <td >${u.venueAddress }</td>
   <td >${u.capacity }</td>
  </tr>
  </c:forEach>
  
</table> 
</body>
</html>