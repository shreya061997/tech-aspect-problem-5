<%@ page language="java"
contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"
import="ExamplePackage.UserBean"
%>
<%@page import="accountpackage.AccountBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=windows-1256">
<title> User Logged Successfully </title>
</head>
<body>
<% UserBean user = (UserBean)request.getAttribute("currentSessionUser"); %>
<center>
<h1> Welcome to the page!!!!!! Your login details are:</h1>
</center>
<%= user.getemailid() %><br>
<%= user.getPassword()%><br>
</body>
</html>
