<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aadhar Registration</title>
</head>
<body>

<form action="/Spring_MVC_Web_Dynamic_Response/register" method="post">
        First Name : <input type="text" name="firstName"><br><br>
		Last Name : <input type="text" name="lastName"><br><br>
		Mobile : <input type="text" name="mobile"><br><br>
		Address : <input type="text" name="address"><br><br>
		<input type="submit" value="Register">

</form>

<br>
<a href="trackAadharRegistration"> Track Aadhar Registration</a>

</body>
</html>