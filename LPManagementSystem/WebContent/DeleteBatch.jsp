<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>delete batch</title>
</head>
<body>

<h3 align="center">Delete Batch</h3>

<form name="deletebatch" action="DeleteBatch" method="post" >
<table align="center">
<tr>

<td>BatchId</td>
<td><input type="text" name="batchid" /></td>
</tr>
<tr>
<tr>
<td>MentorId</td>
<td><input type="text" name="eId" /></td>
</tr>
<tr>
<td><%=(request.getAttribute("errMessage") == null) ? ""
: request.getAttribute("errMessage")%></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Delete"></input><input type="reset" value="Reset"/></td>
</tr>
 
</table>
</form>


</body>
</html>