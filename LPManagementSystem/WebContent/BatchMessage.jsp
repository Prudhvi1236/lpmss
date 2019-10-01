<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String msg=(String)request.getAttribute("msg");
 if(msg.equals("SUCCESS"))
 {
%>
<h1>THE BATCH ADDED SUCCESSFULLY</h1>
<%
 }
 if(msg.equals("You have already a batch...."))
 {
%>
<h1>YOU ALREADY HAVE A BATCH</h1>
<%

 }
 if(msg.equals("Already batch created..."))
 {
%>
<h1>THE BATCH IS CREATED ERALIER</h1>
<%
 }
%>


</body>
</html>