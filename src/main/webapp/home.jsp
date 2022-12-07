<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="css/main.css">
    <title>
        Welcome to Personal Blog
    </title>
</head>
<body>
<%@include file="nav.jsp"%>
<main>
    <div class="container">
        <div class="content">
            <c:forEach var="post" items="${posts}">
                <div class="post">
                    <div class="post-header">
                        <h3><a href="single?id=${post.id}">${post.title}</a></h3>
                        <p class="post-date">${post.createdAt} | ${post.getCategoryName(post.categoryId)}</p>
                    </div>
                    <div class="post-content">
                        <c:if test="${post.picture !=''}">
                            <img class="post-thumb" src="uploads/${post.picture}" alt="${post.picture}">
                        </c:if>
                    </div>
                </div>
            </c:forEach>
        </div>
        <%@include file="sidebar.jsp"%>
    </div>
</main>
</body>
</html>
