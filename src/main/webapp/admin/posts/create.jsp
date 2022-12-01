<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Create Post</title>
</head>
<body>

<form action="post-create" method="post">
    <label>Title</label>
    <input type="text" name="title" required>

    <label>Content</label>
    <textarea name="content" id="" cols="30" rows="10"></textarea>

    <input type="text" name="picture" value="a.jpg">
    <button type="button">Set Image</button>

    <label>Category</label>
    <select name="category_id">
        <option value="">Select Category</option>
        <c:forEach var="category" items="${categories}">
            <option value="${category.id}">${category.name}</option>
        </c:forEach>
    </select>

    <button type="submit">Create</button>
</form>

<div id="media" class="media-overlay">
    <div class="media-container">
        <button type="button" onclick="closeDialog()"> X </button>
        <c:forEach var="item" items="${files}">
            <div class="card">
                <img height="100" width="100" src="uploads/${item}" alt="${item}">
            </div>
        </c:forEach>
    </div>
</div>

<script>
    function closeDialog(){
        document.getElementById("media").style.display="none";
    }
</script>
</body>
</html>
