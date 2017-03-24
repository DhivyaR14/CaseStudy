<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application</title>
</head>
<center>
<body bgcolor="cyan">
<h1>Welcome to Student Portal</h1>
<form action="StudentServlet" method="post">  
<table>  
<tr><td>Student First Name:</td><td><input type="text" name="fname"/></td></tr>  
<tr><td>Student Last Name</td><td><input type="text" name="lname"/></td></tr>  
<tr><td>Student Address</td><td><input type="text" name="address"/></td></tr> 
<tr><td>Gender</td><td>  
<input type="radio" name="sex" value="Male"/>Male   
<input type="radio" name="sex" value="Female"/>Female </td></tr><br/><br/>
 <tr rowspan="5"><td>Course &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <select name="course" style="width:155px">
  <option value="B.E">B.E</option>
   <option value="B.Tech">B.Tech</option> 
  </select></td></tr><br/>
<tr><td> Department<br><tr><td><input type="checkbox" name="department" id="CSE"value="CSE"/>CSE <br/>
             <tr><td><input type="checkbox" name="department" id="IT"value="IT"/>IT<br/><br/> 
</td></tr>  
<tr><td colspan="5">&nbsp <br><center><input type="submit" value="Submit" name="action"/></td></tr></center> 
</table>  
</form>  
</center>
</body>
</html>