<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>Category Details</title>
</head>
<body>
<%@include file="../header.jsp"%>
<main>
    <div class="sidebar">
        <%@include file="../sidebar.jsp"%>
    </div>
    <div class="content">
        <h4>Category Details</h4>
        <form action="category-edit" method="post">
            <input type="hidden" name="id" value="${category.id}">
            <label>Category Name</label>
            <input type="text" name="name" value="${category.name}" required>

            <label>Description</label>
            <textarea name="desc" id="" cols="30" rows="10">${category.description}</textarea>

            <button type="submit">Update</button>
        </form>
    </div>
</main>
</body>
</html>
