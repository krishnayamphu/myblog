<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category Details</title>
</head>
<body>
<a href="categories">All category</a>
<form action="category-edit" method="post">
    <input type="hidden" name="id" value="${category.id}">
    <label>Category Name</label>
    <input type="text" name="name" value="${category.name}" required>

    <label>Description</label>
    <textarea name="desc" id="" cols="30" rows="10">${category.description}</textarea>

    <button type="submit">Update</button>
</form>
</body>
</html>
