<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div.container {
background-color: #0397a5;
padding-top: 30px;
}
header {
padding: 2em;
color: white;
background-color: #08BBB7;
text-align: center;
}
footer {
padding: 2em;
color: white;
background-color: #08BBB7;
text-align: center;
margin-top: 100px;
} </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script src="/TestNew/bootstrap/jquery.min.js"></script> 

<link rel="stylesheet" href="/TestNew/bootstrap/bootstrap.min.css" >

<link rel="stylesheet" href="/TestNew/bootstrap/bootstrap-theme.min.css" >
<script src="/TestNew/bootstrap/bootstrap.min.js" ></script>
<script src="http://localhost:8084/TestNew/newaccount/Newaccount.js"></script>
</head>
<body>
<form name="myForm"
action="http://localhost:8084/TestNew/InsertServlet"
onsubmit="return myfunction();">

<input type="hidden" name="action" id="action" value="sign_in">
<div class="container">
<header>
<h1>Create an Account</h1>
</header>
<div id="new" align="center" style="margin-top: 75px">
<br>
<div class="container"
style="background-color: lightgrey; width: 500px;
height: 390px; margin-bottom: 100px">
<div class="row">
<div class="col-sm-6">
<p>First Name</p>
<input type="text" name="firstname"
id="firstname" required><span
id="firstname2" style="color:
red;font-size:10px"></span>
</div>
<div class="col-sm-6">
<p>Last Name</p>
<input type="text" name="lastname"
id="lastname" required><span
id="lastname2" style="color:
red;font-size:10px"></span>
</div>
</div>
</br>

<div class="row">
<div class="col-sm-6">
<p>Age</p>
<input type="text" name="Age"
id="age" required><span
id="age" style="color:
red;font-size:10px"></span>
</div>
<div class="col-sm-6">
<p>Branch</p>
<input type="text" name="branch"
id="branch" required><span
id="branch" style="color:
red;font-size:10px"></span>
</div>
</div>
</br>

<div class="row">
<div class="col-sm-6">
<p>Year</p>
<input type="text" name="year"
id="Year" required><span
id="Year" style="color:
red;font-size:10px"></span>
</div>
<div class="col-sm-6">
<p>Semester</p>
<input type="text" name="Semester"
id="Semester" required><span
id="Semester" style="color:
red;font-size:10px"></span>
</div>
</div>
</br>





<div class="row">
<div class="col-sm-12">
<p>Semester score in %</p>
<input type="text" id="score"
name="score" style="width: 372px"
required>

</div>
</div>
<br>

<br>


<div class="row">
<div class="col-sm-12" align="middle">
<button type="submit"
value="submit">Submit</button>
</div>
</div>
<br>
</div>
<footer>Copyright &copy; student.com</footer>
</div>
</div>
</form>
</body>
</html>
