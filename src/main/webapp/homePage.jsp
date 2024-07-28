<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Quiz Platform</title>
    <link rel="stylesheet" href="styles.css">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<%@include file="header.jsp"%>

<%--
<h1><c:out value = "${requestScope.greeting}"></c:out></h1>
<c:out value = "${requestScope.message}"></c:out>
<c:out value = "${sessionScope.name}"></c:out>
--%>

<div class="content">
    <p>This is a platform for repeating the materials that we learned at the course "JavaRush University".</p>
    <p>The mission of our company is to help people to become prepared for the interviews.<br>
        We collected a huge collection of questions, tasks and so many others interactive tasks.</p>
    <p>It's useful tool for graduates of courses about Java.</p>
    <p>Enjoy our product, <c:out value = "${sessionScope.usersName}"></c:out>!</p>
</div>

<%@include file="footer.jsp"%>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
