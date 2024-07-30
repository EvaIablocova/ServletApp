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

<div class="card p-4">
    <form action="/question" method="get">
        <input type="hidden" value="${requestScope.questionId}" readonly>
        <textarea type="text"readonly>${requestScope.TextOfQuestion}</textarea>
    </form>

    <form action="/question" method="post">
        <button type="submit" name="action" value="yes" class="btn btn-primary mb-3">Yes</button>
        <button type="submit" name="action" value="no" class="btn btn-primary mb-3">No</button>
    </form>

    <div class="btn-group">
        <!-- Форма для перехода к предыдущему вопросу -->
        <form action="/question" method="get">
            <input type="hidden" name="action" value="prev">
            <input type="hidden" name="QuestionId" value="${questionId}">
            <button type="submit" class="btn btn-primary mb-3" style="margin-right: 10px;">Prev</button>
        </form>

        <!-- Форма для перехода к следующему вопросу -->
        <form action="/question" method="get">
            <input type="hidden" name="action" value="next">
            <input type="hidden" name="QuestionId" value="${questionId}">
            <button type="submit" class="btn btn-primary mb-3" style="margin-left: 10px;">Next</button>
        </form>
    </div>

    <!-- Форма для перехода к результатам -->
    <form action="/question" method="get">
        <input type="hidden" name="action" value="results">
        <button type="submit" class="btn btn-primary btn-block mb-3">Go to results</button>
    </form>
</div>



<%@include file="footer.jsp"%>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>