<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Categories</title>
</head>
<body>

<table>
    <tr>
        <th>#ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Created Date</th>
        <th>Action</th>
    </tr>
    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.id}</td>
            <td>${category.name}</td>
            <td>${category.description}</td>
            <td>${category.createdAt}</td>
            <td><a href="">Edit</a>
                <a href="">Delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
