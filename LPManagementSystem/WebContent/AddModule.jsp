<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Module</title>
</head>
<body>

<div class=heading>
<h3 align="center">Add Module</h3>
</div>

<form name="moduleRegistration" action="AddModule" method="post" onsubmit="return validate()">
<table align="center">
<tr>
<td>ModuleId</td>
<td><input type="text" name="moid" /></td>
</tr>
<tr>
<td>ModuleName</td>
<td><input type="text" name="modulename" /></td>
</tr>
<tr>
<td>Date</td>
<td><input type="text" name="date" /></td>
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