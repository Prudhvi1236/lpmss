<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add LP</title>
</head>
<body>

<div class=heading>
<h3 align="center">Add LP</h3>
</div>

<form name="LPRegistration" action="AddLP" method="post" onsubmit="return validate()">
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
<td>BatchId</td>
<td><input type="text" name="batchid" /></td>
</tr>
<tr>
<td><%=(request.getAttribute("errMessage") == null) ? ""
: request.getAttribute("errMessage")%></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register"></input><input
type="reset" value="Reset"></input></td>
</tr>
</table>
</form>


</body>
</html>