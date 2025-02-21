<%--
  Created by IntelliJ IDEA.
  User: nazim
  Date: 21/02/2025
  Time: 06:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Contact</title>
</head>
<body>

<h1> ${title}</h1>
<h1> ${desc}</h1>
<form method="post" action="processform">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
