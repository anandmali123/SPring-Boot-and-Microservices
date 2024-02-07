<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Example JSP Page</title>
    <style>
        body {
            text-align: center;
            background-color: #f0f0f0; /* Set background color */
        }

        .center {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Make the container take up the full viewport height */
        }

        .highlight {
            background-color: yellow; /* Highlight color */
            color: red; /* Text color */
            padding: 10px; /* Padding around the text */
        }
    </style>
</head>
<body>
    <div class="center">
        <img src="https://img.jagranjosh.com/images/2024/February/622024/Happy-rose-Day.webp" alt="Image" width="200" height="200">
        <h1 class="highlight">${msg}</h1>
    </div>
</body>
</html>
