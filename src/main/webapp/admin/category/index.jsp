<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>All Categories</title>
</head>
<body>
<%@include file="../header.jsp"%>
<main>
    <div class="sidebar">
        <%@include file="../sidebar.jsp"%>
    </div>
    <div class="content">
        <h4>All Categories</h4>
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
                    <td>
                        <div class="tbl-action">
                            <a href="category-edit?id=${category.id}">Edit</a>
                            <form action="category-del" method="post">
                                <input type="hidden" name="id" value="${category.id}">
                                <button type="submit">Delete</button>
                            </form>
                        </div>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>

</body>
</html>
