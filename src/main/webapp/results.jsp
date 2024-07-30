<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="styles.css">

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Quiz Platform</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


<%@include file="header.jsp"%>

<div class="container mt-5">
    <p class="h2">Your Results</p>
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th scope="col">Question</th>
            <th scope="col">Your answer</th>
            <th scope="col">Right answer</th>
        </tr>
        </thead>


        <tbody>

        <c:forEach var="question" items="${(sessionScope.arrayOfQuizzes[sessionScope.currentQuizIndexInArrayOfQuizzes]).getArrayOfQuestions()}">

            <tr>
                <td><c:out value = "${question.getQuestion()}"></c:out></td>
                <td><c:out value = "${sessionScope.arrayOfAnswers.get(0)}"></c:out></td>
                <td>Item4</td>
            </tr>

        </c:forEach>



        </tbody>


    </table>
</div>

<%@include file="footer.jsp"%>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>