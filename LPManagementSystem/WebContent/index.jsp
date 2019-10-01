<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LP Batch Management System</title>

<style>
footer
{
background-color: #B3B6B7;
position: fixed;
   bottom: 0;
   width: 100%;
   color: black;
   text-align: center;
  
}
section{  
background-color:#ECF0F1;
border:0px solid skyblue;  
padding:140px;    
}  


/* Add a black background color to the top navigation */
.topnav {
  background-color: #2874A6;
  overflow: hidden;
  
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  
  color: white;
}


  



</style>
</head>
<body>

 <h1 align="center">LP Batch Management System</h1>
  
<div class="topnav">
  
  <a href="Login.jsp">Admin</a>
  <a href="MentorLog.jsp">Mentor</a>
  <a href="LPLog.jsp">LP</a>
</div>

<section>  
<h2> About..... </h2>  
<p style="font-size:110%;"> The LP batch management system that helps the LP to know about their batch, venue details, modules, course. LP can view his/her profile and can update if any changes required. After onboarding all LP's are divided in to batches and undergoes into specific training within in a period of time at particular venue. Venue address,module details,batch details etc; can be known once the LP was sign in.</p>
<p  style="font-size:110%;">  Each batch has a mentor who creates the particular batch and modules to the specific course. The advantage of LP management system is it gives information upto date to the LP about their training sessions after the onboarding which helps LP to know the details crisp and clearly.  </p>
</section> 
<footer>

  <p align="center">Copyright &copy;2019 <br><strong> www.lpms.com</strong></p>
</footer>
</body>
</html>
