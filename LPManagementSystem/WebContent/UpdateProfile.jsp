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
<style type="text/css">
.wrapper {
	text-align: center;
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
	;
	var email = document.emp.email.value;
	var username = document.emp.name.value;
	var password = document.emp.password.value;
	var phno = document.emp.phno.value;
	
	
	 if(username==null||username=="")
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
	else if(password==null||password=="")
	{
	alert("password can't be blank");
	return false;
	}
	
}

</script>
</head>
<body bgcolor="#afafaf">
<%LP lp=new LP();
LPServiceImp lpi=new LPServiceImp();
String eId=request.getParameter("eId");
 lp=lpi.findById(eId);

request.getAttribute("employee"); %>
<form name="emp" action="UpdateProfile" method="post"onsubmit="return validate()">
        <table  bgcolor="white"align="center" width=40% cellspacing="2" cellpadding="2" border="5" >
        
            <tr>
                <td colspan="2" align="center"><b>Update Profile</b></td>
 
            </tr>
			<tr>
            	<td>
            	<input type="hidden" name="eId" value="<%= lp.geteId() %>">
          	  </td>
          	  <td></td>
            </tr>
			<tr>
                <td align="left" valign="top" width="41%">Employee name<span style="color:red"></span></td>
 
                <td width="57%"><input type="text" value="<%=lp.getName() %>" name="name" size="24"></td>
            </tr>	
            
			<tr>
                <td align="left" valign="top" width="41%">Email Id<span style="color:red"></span></td>
                <td width="57%">
                    <input type="text" value="<%= lp.getEmail() %>" name="email" size="24" ></td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Phone number<span style="color:red"></span></td>
                <td width="57%">
                    <input type="text" value="<%= lp.getPhno() %>" name="phno" size="24"></td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Password<span style="color:red"></span></td>
                <td width="57%">
                    <input type="text" value="<%= lp.getPassword() %>" name="password" size="24"></td>
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
<br>
<div class="wrapper">
		<a href="LPHome.jsp"><button type="button">Home</button></a>
	</div>

</body>
</html>