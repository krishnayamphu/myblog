<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <title>Create Post</title>
</head>
<body>
<%@include file="../header.jsp"%>
<main>
    <div class="sidebar">
        <%@include file="../sidebar.jsp"%>
    </div>
    <div class="content">
        <h4>New Post</h4>
        <form action="post-create" method="post">
            <label>Title</label>
            <input type="text" name="title" required>

            <label>Content</label>
            <textarea name="content" id="" cols="30" rows="10"></textarea>

            <input type="hidden" id="picture" name="picture" value="">
            <img id="thumb" src="" width="100" alt="">
            <button type="button" onclick="showDialog()">Set Image</button>

            <label>Category</label>
            <select name="category_id">
                <option value="">Select Category</option>
                <c:forEach var="category" items="${categories}">
                    <option value="${category.id}">${category.name}</option>
                </c:forEach>
            </select>

            <button type="submit">Create</button>
        </form>

    </div>
</main>


<div id="media" class="media-overlay">
    <div class="media-container">
        <button type="button" onclick="closeDialog()"> X </button>
        <c:forEach var="item" items="${files}">
            <div class="card">
                <img onclick="selectImage('${item}')" height="100" width="100" src="uploads/${item}" alt="${item}">
            </div>
        </c:forEach>
    </div>
</div>

<script>
    function closeDialog(){
        document.getElementById("media").style.display="none";
    }
    function showDialog(){
        document.getElementById("media").style.display="flex";
    }
    function selectImage(name){
        document.getElementById("picture").value=name;
        document.getElementById("thumb").src="uploads/"+name;
        closeDialog();
    }

</script>
</body>
</html>
