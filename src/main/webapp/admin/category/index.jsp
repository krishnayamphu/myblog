<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Categories</title>
</head>
<body>
<a href="category-create">Create Category</a>
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
            <td><a href="category-edit?id=${category.id}">Edit</a>
                <form action="category-del" method="post">
                    <input type="hidden" name="id" value="${category.id}">
                    <button type="submit">Delete</button>
                </form>
        </tr>
    </c:forEach>
</table>

</body>
</html>
