<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lpms.model.LP" %>
    <%@ page import="com.lpms.service.LPServiceImp" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Profile</title>
</head>
<body>
<%LP l=new LP();
LPServiceImp lpi=new LPServiceImp();
String eId=request.getParameter("eId");
LP l2=lpi.findById(eId);

request.getAttribute("employee"); %>
<form name="emp" action="UpdateProfile" method="post">
        <table align="center" width=40% width="100%" cellspacing="2" cellpadding="2" border="5">
        
            <tr>
                <td colspan="2" align="center"><b>Update Profile</b></td>
 
            </tr>
			<tr>
            	<td>
            	<input type="hidden" name="eId" value="<%= l2.geteId() %>">
          	  </td>
            </tr>
			<tr>
                <td align="left" valign="top" width="41%">Employee name<span style="color:red"></span></td>
 
                <td width="57%"><input type="text" value="<%=l2.getName() %>" name="name" size="24"></td>
            </tr>	
            
			<tr>
                <td align="left" valign="top" width="41%">Email Id<span style="color:red"></span></td>
                <td width="57%">
                    <input type="text" value="<%= l2.getEmail() %>" name="email" size="24" ></td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Phone number<span style="color:red"></span></td>
                <td width="57%">
                    <input type="text" value="<%= l2.getPhno() %>" name="phno" size="24"readonly></td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Password<span style="color:red"></span></td>
                <td width="57%">
                    <input type="text" value="<%= l2.getPassword() %>" name="password" size="24"></td>
            </tr>
             <tr>
                <td colspan="2">
                    <p align="center">
                        <input type="submit" value = "update">
                        <input type="reset" value="  Reset All   " name="B5">
                 </td>
            </tr>
 
	
</table>
</form>
</body>
</html>