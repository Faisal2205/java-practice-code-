<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Aadhar Confirmation</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            padding: 30px;
        }
        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 40px;
        }
        .confirmation-table {
            width: 60%;
            margin: auto;
            border-collapse: collapse;
            background-color: #fff;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
        }
        .confirmation-table th, .confirmation-table td {
            padding: 14px 20px;
            border-bottom: 1px solid #ddd;
        }
        .confirmation-table th {
            background-color: #007BFF;
            color: white;
            text-align: left;
            font-size: 16px;
        }
        .confirmation-table td {
            color: #555;
            font-size: 15px;
        }
        .confirmation-table tr:last-child td {
            border-bottom: none;
        }
        .back-link {
            text-align: center;
            margin-top: 30px;
        }
        .back-link a {
            text-decoration: none;
            color: #007BFF;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <h2>Aadhar Registration Confirmation</h2>

    <table class="confirmation-table">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>First Name</td>
            <td>${user.firstName}</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>${user.lastName}</td>
        </tr>
        <tr>
            <td>Mobile</td>
            <td>${user.mobile}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${user.address}</td>
        </tr>
        <tr>
            <td>Confirmation Number</td>
            <td>${user.confirmationNumber}</td>
        </tr>
    </table>

    <div class="back-link">
        <a href="index.jsp">← Back to Home</a>
    </div>

</body>
</html>
