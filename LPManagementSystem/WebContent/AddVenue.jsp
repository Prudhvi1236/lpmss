<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Venue</title>
<style type="text/css">
.wrapper {
	text-align: center;
}

h3 {
	color: black;
}
.status{
text-align:center;
color:red;
font-size:25px;

}
</style>

</head>
<body bgcolor="#afafaf">
<script>
		function validateForm() {
			var venueid = document.venueRegistration.venueid.value;
			var vaddress = document.venueRegistration.venueaddress.value;
			var vcapacity = document.venueRegistration.capacity.value;
			
			if (venueid == "" || venueid == null) {
				alert("venue id can't be blank");
				return false;
			} else if (vaddress == null || vaddress == "") {
				alert("venue address can't be blank");
				return false;
			} else if (vcapacity == null || vcapacity == "") {
				alert("venue capacity can't be blank");
				return false;
			} 

		}
	</script>

<div>
<h3 align="center">Add Venue</h3>
</div>

<form name="venueRegistration" action="AddVenue" method="post" onsubmit="return validateForm()">
<table align="center">
<tr>
<td>VenueId</td>
<td><input type="text" name="venueid"  placeholder="Enter venue id"/></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="venueaddress"  placeholder="Enter address"/></td>
</tr>
<tr>
<td>Capacity</td>
<td><input type="text" name="capacity"  placeholder="Enter capacity"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register">
<input type="reset" value="Reset"> </td>
</tr>
</table>
<br>
		<div class="status">
			<%
				if (request.getAttribute("Message") != null)
					out.print(request.getAttribute("Message"));
			%>
		</div>
</form>
<br>
	<div class="wrapper">
		<a href="AdminHome.jsp"><button type="button">Home</button></a>
	</div>



</body>
</html>