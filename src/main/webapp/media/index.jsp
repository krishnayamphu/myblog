<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Media Files</title>
</head>
<body>
<form action="media" method="post" enctype="multipart/form-data">
    <label>Upload:</label>
    <input type="file" name="upload">
    <button type="submit">Upload</button>
</form>

<hr>
<h3>All Media Files</h3>
<div class="media-container">
<c:forEach var="item" items="${files}">
    <div class="card">
        <img height="100" width="100" src="uploads/${item}" alt="${item}">
        <div class="img-action">
            <a href="">View</a>
            <form action="media-del" method="post">
                <input type="hidden" name="media" value="${item}">
                <button>Delete</button>
            </form>
        </div>
    </div>
</c:forEach>
</div>

</body>
</html>
