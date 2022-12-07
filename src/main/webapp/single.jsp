<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="css/main.css">
    <title>
        ${post.title}
    </title>
</head>
<body>
<%@include file="nav.jsp"%>
<main>
    <div class="content">
        <article class="post-single">
            <div class="post">
                <div class="post-header">
                    <h3>${post.title}</h3>
                    <p>${post.createdAt}</p>
                </div>
                <div class="post-content">
                    <c:if test="${post.picture !=''}">
                        <img class="img-thumbnail" src="uploads/${post.picture}" alt="${post.picture}">
                    </c:if>
                    <p>
                        ${post.text}
                    </p>
                </div>
            </div>
        </article>
    </div>
    <%@include file="sidebar.jsp"%>
</main>
</body>
</html>
