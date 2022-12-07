<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>User Login</title>
</head>
<body class="bg-body">
<form class="login-form" action="login" method="post">
    <c:if test="${err!=''}">
        <p class="text-error">${err}</p>
    </c:if>
    <label>Username</label>
    <input type="text" name="username" required>
    <label>Password</label>
    <input type="password" name="password" required>
    <button type="submit">Login</button>
</form>
</body>
</html>
