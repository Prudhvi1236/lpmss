<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add LP</title>
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
function validate()
{
	var Empid = document.form.eid.value;
	var email = document.form.email.value;
	var username = document.form.name.value;
	var phno = document.form.phno.value;
	var batchid = document.form.batchid.value;
	if(Empid==null||Empid=="")
		{
		alert("Employee id can't be blank");
		return false;
		}
	else if(username==null||username=="")
	{
	alert("username can't be blank");
	return false;
	}
	else if(email==null||email=="")
	{
	alert("email can't be blank");
	return false;
	}
	
	else if(phno.length<10)
	{
	alert("please enter valid phone number");
	return false;
	}
	else if(phno.length>10)
	{
	alert("please enter valid phone number");
	return false;
	}
	else if(batchid==null||batchid=="")
	{
	alert("Batch id can't be blank");
	return false;
	}
}

</script>
</head>
<body bgcolor="#afafaf">

<div class=heading>
<h3 align="center">Add LP</h3>
</div>

<form name="form" action="AddLP" method="post" onsubmit="return validate()">
<table align="center">
<tr>
<td>Empid</td>
<td><input type="text" name="eid"  placeholder="Enter id"/></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name"  placeholder="Enter name"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"  placeholder="Enter email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"/></td>
</tr>
<tr>
<td>Phone Number</td>
<td><input type="text" name="phno"  placeholder="Enter phone number" onkeypress="return isNumberKey(event)"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"  placeholder="Enter password"/></td>
</tr>
<tr>
<td>BatchId</td>
<td><input type="text" name="batchid"  placeholder="Enter batch id"/></td>
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
		<a href="MentorHome.jsp"><button type="button">Home</button></a>
	</div>

</body>
</html>