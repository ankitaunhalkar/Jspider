<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Agent</title>
</head>
<body>
<h1>Create Agent</h1>
<form action="Agent" method="post">
<table>
<tr><td>Branch:</td>
<td><select name="branch">
<option>Kalyan</option>
<option>Mumbai</option>
<option>Thane</option></select></td></tr>
<tr><td>First Name:</td><td><input type="text" name="fname"></td></tr>
<tr><td>Last Name:</td><td><input type="text" name="lname"></td></tr>
<tr><td>Contact:</td><td><input type="text" name="contact"></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
<tr><td>User-Name:</td><td><input type="text" name="user"></td></tr>
<tr><td>Password:</td><td><input type="text" name="pass"></td></tr>
<tr><td>User-Type:</td><td><input type="text" name="type" value="Agent"></td></tr>
<tr><td>Maximum Booking:</td><td><input type="text" name="maxbook"></td></tr>
<tr><td>Agent-Created-Date:</td><td><input type="date" name="date"></td></tr>
<tr><td><input type="submit" name="create" value="Create"></td></tr>
</table>
</form>
</body>
</html>