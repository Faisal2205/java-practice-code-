<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Track Aadhar Details</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #eef2f5;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-box {
            background-color: #ffffff;
            padding: 35px 40px;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333333;
        }

        .form-group {
            margin-bottom: 20px;
            text-align: left;
        }

        label {
            display: block;
            font-weight: 600;
            margin-bottom: 6px;
            color: #444;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
            transition: border 0.3s ease;
        }

        input[type="text"]:focus {
            border-color: #007BFF;
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #28a745;
            border: none;
            border-radius: 6px;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <div class="form-box">
        <h2>Enter Your Aadhar Details</h2>

        <form action="/Spring_MVC_Web_Dynamic_Reddis/trackAadhar" method="post">
            <div class="form-group">
                <label for="confirmationNumber">Confirmation Number:</label>
                <input type="text" name="confirmationNumber" id="confirmationNumber" required>
            </div>

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

            <input type="submit" value="Submit">
        </form>
    </div>

</body>
</html>
