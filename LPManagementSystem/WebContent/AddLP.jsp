<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add LP</title>
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
	else if(email==null||email=="")
	{
	alert("email can't be blank");
	return false;
	}
	else if(username==null||username=="")
	{
	alert("username can't be blank");
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
<body>

<div class=heading>
<h3 align="center">Add LP</h3>
</div>

<form name="form" action="AddLP" method="post" onsubmit="return validate()">
<table align="center">
<tr>
<td>Empid</td>
<td><input type="text" name="eid" required="required" placeholder="Enter id"/></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" required="required" placeholder="Enter name"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" required="required" placeholder="Enter email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"/></td>
</tr>
<tr>
<td>Phone Number</td>
<td><input type="text" name="phno" required="required" placeholder="Enter phone number" onkeypress="return isNumberKey(event)"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" required="required" placeholder="Enter password"/></td>
</tr>
<tr>
<td>BatchId</td>
<td><input type="text" name="batchid" required="required" placeholder="Enter batch id"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register"></input><input
type="reset" value="Reset"></input></td>
</tr>
</table>
<%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>
</form>


</body>
</html>