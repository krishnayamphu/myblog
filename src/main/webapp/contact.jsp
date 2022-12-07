<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="css/main.css">
    <title> Contact </title>
</head>
<body>
<%@include file="nav.jsp" %>
<main>
    <div class="content">
        <h4>Contact Us</h4>
        <form action="contact" method="post">
            <label>Name</label>
            <input type="text" name="name" required>
            <label>Email</label>
            <input type="email" name="email" required>
            <label>Subject</label>
            <input type="text" name="subject" required>
            <label>Message</label>
            <textarea name="message" id="" cols="30" rows="10"></textarea>
            <button type="submit">Send</button>
        </form>
    </div>
    <%@include file="sidebar.jsp" %>
</main>
</body>
</html>
