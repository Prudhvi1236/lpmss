<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>course and venue details</title>
<style type="text/css">
.wrapper {
	text-align: center;
}
</style>
</head>
<body bgcolor="#afafaf">
<form name="venue" action="ViewVenue" method="Get" >
<h2 align="center">Venue Details</h2>
<table align="center">
<tr>
<td>Batch Id</td>
<td><input type="text" name="batchId" required="required" placeholder="Enter Id"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="view venue">
<input type="reset" value="Reset"></td>
</tr>
</table>
</form>
<br>
<div class="wrapper">
		<a href="LPHome.jsp"><button type="button">Home</button></a>
	</div>
</body>
</html>