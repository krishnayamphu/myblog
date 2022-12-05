<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>Create Category</title>
</head>
<body>
<%@include file="../header.jsp"%>
<main>
    <div class="sidebar">
        <%@include file="../sidebar.jsp"%>
    </div>
    <div class="content">
        <h4>New Category</h4>
        <form action="category-create" method="post">
            <label>Category Name</label>
            <input type="text" name="name" required>

            <label>Description</label>
            <textarea name="desc" id="" cols="30" rows="10"></textarea>

            <button type="submit">Create</button>
        </form>
    </div>
</main>
</body>
</html>
