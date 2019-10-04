<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view module</title>
<style type="text/css">
.wrapper {
	text-align: center;
}
</style>
</head>
<body bgcolor="#afafaf">
<h2 align="center">Module Details</h2>
<form name="batch" action="ViewMentorModule" method="post" >
<table align="center">
<tr>
<td>Batch Id</td>
<td><input type="text" name="batchId" required="required" placeholder="Enter Id"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="view module"></input>
<input type="reset" value="Reset"></input></td>
</tr>

</table>
</form>
<br>
<div class="wrapper">
		<a href="MentorHome.jsp"><button type="button">Home</button></a>
	</div>


</body>
</html>