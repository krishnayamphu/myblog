<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Posts</title>
</head>
<body>

<table>
    <tr>
        <th>#ID</th>
        <th>Title</th>
        <th>Category</th>
        <th>Created Date</th>
        <th>Action</th>
    </tr>
    <c:forEach var="post" items="${posts}">
        <tr>
            <td>${post.id}</td>
            <td>${post.title}</td>
            <td>${post.categoryId}</td>
            <td>${post.createdAt}</td>
            <td><a href="">Edit</a>
                <a href="">Delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
