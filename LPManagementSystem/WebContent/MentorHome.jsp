<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lpms.model.Batch" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<title>Mentor</title>

<style>
/* Add a black background color to the top navigation */
.topnav {
  background-color: #333;
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


.welcome{
  padding-top:15%;
   
  text-align: center;

}
</style>

</head>
<body>
<h1 align="center">LP Management System</h1>
 
 <hr>
<div class="topnav">
  <a class="active" href="index.jsp">Home</a>
  <a href="AddLP.jsp">Add LP</a>
  <a href="Batch.jsp">Create Batch</a>
  <a href="<%=request.getContextPath() %>/ViewBatch">View Batch</a>
  <a href="<%=request.getContextPath() %>/ViewMentorProfile">View Profile</a>
  <a href="AddModule.jsp">create module</a>
  <a href="DeleteBatch.jsp">Delete batch</a>
  <a href="Logout">Logout</a>
</div>

<div class= "welcome">
<h2>welcome Mentor!!</h2>
</div>








</body>
</html>