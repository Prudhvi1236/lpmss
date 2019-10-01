<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>AddMentor</title>
<style type="text/css">
.wrapper {
    text-align: center;
}
</style>
</head>

<body bgcolor="#afafaf">
<div class=heading>
<h3 align="center">Add Mentor</h3>
</div>

<form name="mentorRegistration" action="AddMentor" method="post">
<table align="center">
<tr>
<td>Empid</td>
<td><input type="text" name="eid" /></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" /></td>
</tr>
<tr>
<td>Phone Number</td>
<td><input type="text" name="phno" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register"></input>
<input type="reset" value="Reset"></input></td>
</tr>
<tr>
<td><%=(request.getAttribute("errMessage") == null) ? ""
: request.getAttribute("errMessage")%></td>
</tr>
</table>
</form>
<br>
<div class="wrapper">
<a href="AdminHome.jsp"><button type="button" >Home</button></a>
</div>
</body>
</html>