<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Allocate venue</title>
</head>
<body>
<h3 align="center">Allocate Venue</h3>

<form name="allocatevenue" action="AllocateVenue" method="post" >
<table align="center">
<tr>

<td>BatchId</td>
<td><input type="text" name="batchid" /></td>
</tr>
<tr>
<tr>
<td>VenueId</td>
<td><input type="text" name="venueid" /></td>
</tr>
<tr>
<td><%=(request.getAttribute("errMessage") == null) ? ""
: request.getAttribute("errMessage")%></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="update"></input><input type="reset" value="Reset"/></td>
</tr>
<tr>
<td>
<div align="center">
<a href="GetNotAllocBatchRecords">BatchRecords</a>
</div>
</td>
</tr>
 
</table>
</form>


</body>
</html>