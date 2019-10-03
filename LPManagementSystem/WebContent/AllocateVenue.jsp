<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Allocate venue</title>
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
a.button {
    -webkit-appearance: button;
    -moz-appearance: button;
    appearance: button;
    padding: 2px 3px;
	 margin: 4px 2px;
    text-decoration: none;
    color: initial;
}

</style>
</head>
<body bgcolor="#afafaf">

<script>
		function validateForm() {
			var batchid = document.allocatevenue.batchid.value;
			var venueid = document.allocatevenue.venueid.value;
			if (batchid == "" || batchid == null) {
				alert("batch id can't be blank");
				return false;	
			}else if (venueid == "" || venueid == null) {
				alert("venue id can't be blank");
				return false;
			}

		}
	</script>
	
<h3 align="center">Allocate Venue</h3>

<form name="allocatevenue" action="AllocateVenue" method="post" onsubmit="return validateForm()">
<table align="center">
<tr>

<td>BatchId</td>
<td><input type="text" name="batchid"  placeholder="Enter batch id"/></td>
</tr>
<tr>
<tr>
<td>VenueId</td>
<td><input type="text" name="venueid"  placeholder="Enter venue id"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="allocate">
<input type="reset" value="Reset"></td>
</tr>
<tr>
<td></td>
<td><a href="GetNotAllocBatchRecords" class="button"> Batches</a>
<a href="AdminHome.jsp" class="button"> Home</a></td>
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


</body>
</html>