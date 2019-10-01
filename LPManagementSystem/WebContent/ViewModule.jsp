<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view module</title>
</head>
<body>
<form name="batch" action="ViewModule" method="post" >
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
<tr><td><br></td></tr>
<tr> 
<td></td>
<td><span style="color:red">
<%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%>
</span></td>
</tr>


</table>
</form>



</body>
</html>