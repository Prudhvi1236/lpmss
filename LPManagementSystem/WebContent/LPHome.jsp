<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expries", "0");
%>
<%=session.getAttribute("eId") %>
<%if(session.getAttribute("eId")==null){
	 request.getRequestDispatcher("index.jsp").forward(request, response);

 }%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LP</title>
<style>
details
{
display: block;
margin-left: 5%;
}
 summary { 
                font-size:20px; 
                color:#17202A; 
                font-weight:bold; 
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


.welcome{
  padding-top:15%; 
  text-align: center;

}
</style>
</head>
<body>
<h1 align="center">LP Batch Management System</h1>
 
 <hr>
<div class="topnav">
 
  <a href="<%=request.getContextPath() %>/ViewProfile">view profile</a>
  <a href="ViewVenue.jsp">view venue</a>
  <a href="ViewModule.jsp">view module</a>
  <a href="Logout">Logout</a>
</div>
<br>
<h2><u>What is the process?</u></h2>
<details>
<summary>After onboarding</summary>
<p>Once you onboarded in virtusa you are added in a batch and a training is given under certain period of time on particular course.</p>
</details>
<details>
<summary>Exit Exam</summary>
<p>After completion of training you are going to attend an exam which is common process for every onboarded person and you must get 70% if not you will have to attend another one exam and there may be advanced training for another few days</p>
</details>
<details>
<summary>Training Tasks</summary>
<p>During training process you have to do some assignments along with a project task having SRS document and you need to complete the task at the end of the training period.</p>
</details>
<details>
<summary>Attendence System</summary>
<p>From the day of joining attendence will count. If you are undergoing the training from outside of virtusa you need to manage your attendence in following steps.</p> 
<p>Step1 : Open velocity portal.</p>
<p>Step2 : Go to manage absence records.</p>
<p>Step3 : Add start date and end date for outside trainings. If required add comments.</p>
<p>Step4 : Enter save and submit.</p>
</p>
</details>
<details>
<summary>Advanced Training</summary>
<p>Advanced training will be given to the particular batches or particular candidates. The advanced training process is similar to the basic training program which contains tasks, exams etc.,</p>
</details>


</body>
</html>