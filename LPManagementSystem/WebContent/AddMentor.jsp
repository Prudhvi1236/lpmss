<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expries", "0");
%>
<%=session.getAttribute("eId")%>
<%
	if (session.getAttribute("eId") == null) {
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddMentor</title>

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
	<div class=heading>
		<h3 align="center">Add Mentor</h3>
	</div>
	<script>
	function isNumberKey(evt) {
        var charCode = (evt.which) ? evt.which : event.keyCode;
        if (charCode != 46 && charCode > 31 &&
            (charCode < 48 || charCode > 57)) {
            alert("Enter Number");
            return false;
        }
        return true;
}
		function validateForm() {
			var empid = document.add.eid.value;
			var email = document.add.email.value;
			var username = document.add.name.value;
			var phno = document.add.phno.value;
			var password = document.add.password.value;
			if (empid == "" || empid == null) {
				alert("Employee id can't be blank");
				return false;
			} else if (username == null || username == "") {
				alert("username can't be blank");
				return false;
			} else if (email == null || email == "") {
				alert("email can't be blank");
				return false;
			} else if (phno == null || phno == "") {
				alert("phone number can't be blank");
				return false;
			} else if (phno.length > 10) {
				alert("please enter valid phone number");
				return false;
			} else if (password == null || password == "") {
				alert("password can't be blank");
				return false;
			}

		}
	</script>
	<form name="add" action="AddMentor" method="post"
		onsubmit="return validateForm()">
		<table align="center">
			<tr>
				<td>Empid</td>
				<td><input type="text" name="eid" placeholder="Enter id"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Enter name"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" placeholder="Enter email"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="phno"
					placeholder="Enter phone number" onkeypress="return isNumberKey(event)"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					placeholder="Enter password"></td>
			</tr>
			<tr>
			<td></td>
				<td><input type="submit" value="Register">
				<input type="reset" value="Reset"></td>
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