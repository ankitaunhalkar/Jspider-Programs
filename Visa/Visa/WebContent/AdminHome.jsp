<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<style>
.floatleft
{
float:left;
}
.floatright
{
float:right;
}
header, footer {
    padding: 1em;
    color: white;
    background-color: grey;
    clear: left;
    text-align: center;
}
</style>
</head>
<body>
<header>
<img src="airplane-take-off.png" height="150" width="150">
<h1>VISA INFORMATION PROCESSING SYSTEM</h1>
</header>
<br>
<div class="floatleft">
<a href="CreateAdmin.jsp" target="iframe">Create Admin</a><br>
<a href="CreateAgent.jsp" target="iframe">Create Agent</a><br>
<a href="CreateBranch.jsp" target="iframe">Create Branch</a><br>
<a href="SearchAdmin.jsp" target="iframe">Search Admin</a><br>
<a href="SearchAgent.jsp" target="iframe">Search Agent</a><br>
<a href="SearchBranch.jsp" target="iframe">Search Branch</a><br>
<a href="AppointDetails.jsp" target="iframe">Appointment Details</a><br>
<a href="Approval.jsp" target="iframe">Approval</a><br>
<a href="" target="iframe">View Cancel Appointment</a><br>
<a href="Logout">Logout</a><br><br>
</div>
<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires", "0");
%>
<div class="floatright"><iframe name="iframe" frameborder="0" height="500px" width="900px"></iframe></div>
  <br><br><br><br><br>
<!--  <footer>Copyright &copy; Februray 2018</footer> -->

</body>
</html>