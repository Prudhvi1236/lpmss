<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Module</title>
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

<div >
<h3 align="center">Add Module</h3>
</div>
<script>
		function validateForm() {
			var moid = document.moduleRegistration.moid.value;
			var modulename = document.moduleRegistration.modulename.value;
			var date = document.moduleRegistration.date.value;
			var batchid = document.moduleRegistration.batchid.value;
			
			if (moid == "" || moid == null) {
				alert("module id can't be blank");
				return false;
			} else if (modulename == null || modulename == "") {
				alert(" module name can't be blank");
				return false;
			} else if (date == null || date == "") {
				alert("date can't be blank");
				return false;
			} else if (batchid == null || batchid == "") {
				alert("batch id can't be blank");
				return false;
			} 

		}
	</script>
<form name="moduleRegistration" action="AddModule" method="post" onsubmit="return validateForm()">
<table align="center">
<tr>
<td>ModuleId</td>
<td><input type="text" name="moid"  placeholder="Enter module id"/></td>
</tr>
<tr>
<td>ModuleName</td>
<td><input type="text" name="modulename"  placeholder="Enter module"/></td>
</tr>
<tr>
<td>Date</td>
<td><input type="date" name="date"  placeholder="dd/mm/yyyy"/></td>
</tr>
<tr>
<td>BatchId</td>
<td><input type="text" name="batchid"  placeholder="Enter batch id"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add">
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