<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Post</title>
</head>
<body>

<form action="post-create" method="post">
    <label>Title</label>
    <input type="text" name="title" required>

    <label>Content</label>
    <textarea name="content" id="" cols="30" rows="10"></textarea>

    <input type="text" name="picture" value="a.jpg">

    <label>Category</label>
    <select name="category_id">
        <option value="">Select Category</option>
        <c:forEach var="category" items="${categories}">
            <option value="${category.id}">${category.name}</option>
        </c:forEach>
    </select>

    <button type="submit">Create</button>
</form>
</body>
</html>
