<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Register" name="Registration Form" method="POST">
<div>
<label>Enter id</label>
<input type="text" name="id" id="id">
</div>
<div>
<label>Enter name</label>
<input type="text" name="name" id="name">
</div>
<div>
<label>Enter password</label>
<input type="password" name="password" id="password">
</div>
<div>
<label>Enter mailid</label>
<input type="text" name="mailid" id="mailid">
</div>
<div>
<label>Enter gender</label>
<input type="radio" name="gender" id="male" value="male">Male
<input type="radio" name="gender" id="male" value="female">Female
</div>
<div>
<input type="submit" value="Submit">
</div>
</form>
</body>
</html>