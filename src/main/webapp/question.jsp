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
        <textarea type="text"readonly>${requestScope.TextOfQuestion}</textarea>

        <div class="radio-option">
            <input type="radio" id="option1" name="option" value="1">
            <label for="option1">${requestScope.Option1}</label>
        </div>
        <div class="radio-option">
            <input type="radio" id="option2" name="option" value="2">
            <label for="option2">${requestScope.Option2}</label>
        </div>
        <div class="radio-option">
            <input type="radio" id="option3" name="option" value="3">
            <label for="option3">${requestScope.Option3}</label>
        </div>
    </form>

    <div class="btn-group">
        <!-- Форма для перехода к предыдущему вопросу -->
        <form action="/question" method="get">
            <input type="hidden" name="action" value="prev">
            <button type="submit" class="btn btn-primary mb-3" style="margin-right: 10px;">Prev</button>
        </form>

        <!-- Форма для перехода к следующему вопросу -->
        <form action="/question" method="get">
            <input type="hidden" name="action" value="next">
            <button type="submit" class="btn btn-primary mb-3" style="margin-left: 10px;">Next</button>
        </form>
    </div>

    <!-- Форма для перехода к результатам -->
    <form action="/results" method="get">
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