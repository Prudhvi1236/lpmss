<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Batch</title>
</head>
<body>

<body>
<div class=heading>
<h3 align="center">Create Batch</h3>
</div>

<form name="BatchRegistration" action="AddBatch" method="post" onsubmit="return validate()">
<table align="center">
<tr>
<td>BatchId</td>
<td><input type="text" name="batchid" /></td>
</tr>
<tr>
<td>BatchCourse</td>
<td><input type="text" name="batchcourse" /></td>
</tr>
<tr>
<td>MentorId</td>
<td><input type="text" name="eid" /></td>
</tr>
<tr>
<td>BatchCapacity</td>
<td><input type="text" name="batchcapacity" /></td>
<tr>

<tr>
<td><%=(request.getAttribute("errMessage") == null) ? ""
: request.getAttribute("errMessage")%></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register"></input><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>


</body>
</html>