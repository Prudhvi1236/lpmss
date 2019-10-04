<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>delete batch</title>
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
<body bgcolor="#afafaf">

<h3 align="center">Delete Batch</h3>
<script>
		function validateForm() {
			var batchid = document.deletebatch.batchid.value;
			var eId = document.deletebatch.eId.value;
					
			if (batchid == "" || batchid == null) {
				alert("batch id can't be blank");
				return false;
			} else if (eId == null || eId == "") {
				alert(" mentor id can't be blank");
				return false;
			}

		}
	</script>
<form name="deletebatch" action="DeleteBatch" method="post" onsubmit="return validateForm()">
<table align="center">
<tr>

<td>BatchId</td>
<td><input type="text" name="batchid"  placeholder="Enter batch id"/></td>
</tr>
<tr>
<tr>
<td>MentorId</td>
<td><input type="text" name="eId" value=<%=eid%> placeholder="Enter mentor id" readonly/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Delete">
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