<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Category</title>
</head>
<body>

<form action="category-create" method="post">
    <label>Category Name</label>
    <input type="text" name="name" required>

    <label>Description</label>
    <textarea name="desc" id="" cols="30" rows="10"></textarea>

    <button type="submit">Create</button>
</form>
</body>
</html>
