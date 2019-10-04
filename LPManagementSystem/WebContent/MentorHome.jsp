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
details
{
display: block;
margin-left: 5%;
}
 summary { 
                font-size:20px; 
                color:#17202A; 
                font-weight:bold; 
            } 
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


.welcome{
  padding-top:15%;
   
  text-align: center;

}
</style>

</head>
<body>
<h1 align="center">LP Batch Management System</h1>
 
<div class="topnav">
  
  <a href="AddLP.jsp">Add LP</a>
  <a href="Batch.jsp">Create Batch</a>
  <a href="<%=request.getContextPath() %>/ViewBatch">View Venue</a>
  <a href="<%=request.getContextPath() %>/ViewMentorProfile">View Profile</a>
  <a href="AddModule.jsp">create module</a>
  <a href="ViewMentorModule.jsp">view module</a>
  <a href="DeleteBatch.jsp">Delete batch</a>
  <a href="Logout">Logout</a>
</div>
<br>



<br>
<h2><u>What does mentor do?</u></h2>
<details>
<summary>Register LP</summary>
<p>Once mentor get LP list register them in LP batch management portal and add them into a batch.</p>
</details>
<details>
<summary>Batch creation</summary>
<p>After completion of LP's enrolling mentor needs create a batch and mentor needs to add them into the batch. </p>
</details>
<details>
<summary>Module creation</summary>
<p>For a particular batch a particular module is assigned which contains day wise topics with dates and the module is created based upon the batch course.</p>
</details>
<details>
<summary>Batch deletion</summary>
<p>After completion of batch training mentor can delete the batch which was assigned for the training.</p>
</details>
<details>
<summary>View profile</summary>
<p>Mentor can view his profile by clicking on the view profile on the menu bar.</p>
</details>
<details>
<summary>View Venue</summary>
<p>Mentor can view his venue and batch details which is undergoing in training program by clicking on the view venue on the menu bar.</p>
</details>
<details>
<summary>View Module</summary>
<p>Mentor can view the module for a particular batch which is in training program by clicking on the view module on the menu bar.</p>
</details>




</body>
</html>