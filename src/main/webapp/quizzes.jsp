<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="styles.css">

<!DOCTYPE html>
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

<div class="quiz-container">
    <c:forEach var="quiz" items="${sessionScope.arrayOfQuizzes}">
        <div class="quiz-card">
            <form action="/question" method="get">
                <img src="${quiz.getQuizImage()}" class="quiz-image" alt="${quiz.getNameOfQuiz()}">
                <div class="quiz-title"><c:out value="${quiz.getNameOfQuiz()}"></c:out></div>
                <input type="hidden" name="quizName" value="${quiz.getNameOfQuiz()}"/>
                <input type="hidden" name="action" value="getFirstQuestion"/>
                <button type="submit" class="btn">Play</button>
            </form>
        </div>
    </c:forEach>
</div>


<%@include file="footer.jsp"%>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
