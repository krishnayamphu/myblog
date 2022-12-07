<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>New User</title>
</head>
<body class="bg-body">
<form class="register-form" action="register" method="post">
    <label>Username</label>
    <input type="text" name="username" required>
    <label>Email</label>
    <input type="email" name="email" required>
    <label>Password</label>
    <input type="password" name="password" required>
    <button type="submit">Register</button>
    <br>
    <a href="login">Already have an Account</a>
</form>
</body>
</html>
