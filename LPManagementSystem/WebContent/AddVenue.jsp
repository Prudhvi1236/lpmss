<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Venue</title>
</head>
<body>


<div class=heading>
<h3 align="center">Add Venue</h3>
</div>

<form name="venueRegistration" action="AddVenue" method="post" onsubmit="return validate()">
<table align="center">
<tr>
<td>VenueId</td>
<td><input type="text" name="venueid" /></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="venueaddress" /></td>
</tr>
<tr>
<td>Capacity</td>
<td><input type="text" name="capacity" /></td>
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