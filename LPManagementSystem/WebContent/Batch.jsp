<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Batch</title>
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
<%String eid = (String) session.getAttribute("eId"); %>
<body>

<body bgcolor="#afafaf">
<div class=heading>
<h3 align="center">Create Batch</h3>
</div>
<script>
		function validateForm() {
			var batchid = document.BatchRegistration.batchid.value;
			var batchcourse = document.BatchRegistration.batchcourse.value;
			var eid = document.BatchRegistration.eid.value;
			var batchcapacity = document.BatchRegistration.batchcapacity.value;
			
			if (batchid == "" || batchid == null) {
				alert("batch id can't be blank");
				return false;
			} else if (batchcourse == null || batchcourse == "") {
				alert("batch course can't be blank");
				return false;
			} else if (eid == null || eid == "") {
				alert("mentor id can't be blank");
				return false;
			} else if (batchcapacity == null || batchcapacity == "") {
				alert("batch capacity can't be blank");
				return false;
			} 

		}
	</script>
<form name="BatchRegistration" action="AddBatch" method="post" onsubmit="return validateForm()">
<table align="center">
<tr>
<td>BatchId</td>
<td><input type="text" name="batchid"  placeholder="Enter batch id"/></td>
</tr>
<tr>
<td>BatchCourse</td>
<td><input type="text" name="batchcourse"  placeholder="Enter batch couse"/></td>
</tr>
<tr>
<td>MentorId</td>
<td><input type="text" name="eid" value=<%=eid%> placeholder="Enter mentor id" readonly/></td>
</tr>
<tr>
<td>BatchCapacity</td>
<td><input type="text" name="batchcapacity"  placeholder="Enter batch capacity"/></td>
<tr>
<tr>
<td></td>
<td><input type="submit" value="Register"></input><input type="reset" value="Reset"/></td>
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
<div class="wrapper">
		<a href="MentorHome.jsp"><button type="button">Home</button></a>
	</div>
</body>
</html>