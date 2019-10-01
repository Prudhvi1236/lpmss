<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
section{  
background-color:#ECF0F1;
border:1px solid skyblue;  
padding:50px;  
 margin-top: 5px;
  margin-bottom: 5px;
  margin-right: 400px;
  margin-left: 400px; 
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

</style>

</head>
<body>

<h1 align="center">LP Batch Management System</h1>


<div class="topnav">
  
  <a href="Login.jsp">Admin</a>
  <a href="MentorLog.jsp">Mentor</a>
  <a href="LPLog.jsp">LP</a>
</div>
<br>
<br>
<section>
<form name="login" action="LoginServlet" method="post" >
<table align="center" >
<tr>
<th colspan=2><center><font size=5><b>Admin Login</b></font></center></th>
</tr>
<tr>
<td></td>
</tr>
<tr>
<td>Admin Id</td>
<td><input type="text" size="25" name="eId" required="required" placeholder="Enter Id"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" size="25" name="password" required="required" placeholder="Enter Password"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login"></input>
<input type="reset" value="Reset"></input></td>
</tr>
<tr><td><br></td></tr>
<tr> 
<td></td>
<td><span style="color:red">
<%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%>
</span></td>
</tr>


</table>
</form>
</section>

</body>
</html>