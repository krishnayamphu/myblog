<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>All Posts</title>
</head>
<body>
<%@include file="../header.jsp"%>
<main>
    <div class="sidebar">
        <%@include file="../sidebar.jsp"%>
    </div>
    <div class="content">
        <h4>Posts</h4>
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
                    <td>${post.getCategoryName(post.id)}</td>
                    <td>${post.createdAt}</td>
                    <td><a href="">Edit</a>
                        <a href="">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>


</body>
</html>
