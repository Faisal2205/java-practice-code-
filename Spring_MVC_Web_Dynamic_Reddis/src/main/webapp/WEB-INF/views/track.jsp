<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert your Details</title>
</head>
<body>
 <h2>Enter Your Aadhar Details</h2>
 
 <form action="/Spring_MVC_Web_Dynamic_Response/trackAadhar" method="post">
        Confirmation Number : <input type ="text" name="confirmationNumber"><br><br>
        First Name : <input type="text" name="firstName"><br><br>
		Last Name : <input type="text" name="lastName"><br><br>
		Mobile : <input type="text" name="mobile"><br><br>
		<input type="submit" value="Submit">

</form>
</body>
</html>