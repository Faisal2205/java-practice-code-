<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Aadhar Registration</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
            display: flex;
            height: 100vh;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-color: #ffffff;
            padding: 35px 40px;
            border-radius: 12px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }

        h2 {
            margin-bottom: 25px;
            color: #333333;
        }

        .form-group {
            margin-bottom: 18px;
            text-align: left;
        }

        label {
            display: block;
            font-weight: 600;
            margin-bottom: 5px;
            color: #444;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 6px;
            transition: border 0.3s;
        }

        input[type="text"]:focus {
            border-color: #007BFF;
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #007BFF;
            border: none;
            border-radius: 6px;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .track-link {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: #007BFF;
            font-weight: 500;
            transition: color 0.3s;
        }

        .track-link:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Aadhar Registration Form</h2>

        <form action="/Spring_MVC_Web_Dynamic_Response/register" method="post">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" name="firstName" id="firstName" required>
            </div>

            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" name="lastName" id="lastName" required>
            </div>

            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" name="mobile" id="mobile" required>
            </div>

            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" name="address" id="address" required>
            </div>

            <input type="submit" value="Register">
        </form>

        <a class="track-link" href="trackAadharRegistration">🔍 Track Your Aadhar Registration</a>
    </div>

</body>
</html>
