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


<div class="quiz-container">
    <div class="quiz-content">
        <div class="quiz-title">Quiz 2</div>
        <div class="question">Text of the question 1111111</div>
        <ul class="options">
            <li>
                <input type="radio" name="option" id="option1">
                <label for="option1">option 1</label>
            </li>
            <li>
                <input type="radio" name="option" id="option2">
                <label for="option2">option 2</label>
            </li>
            <li>
                <input type="radio" name="option" id="option3">
                <label for="option3">option 3</label>
            </li>
        </ul>
        <div class="nav-buttons">
            <button class="btn btn-light">&larr; prev</button>
            <button class="btn btn-light">next &rarr;</button>
        </div>
    </div>
</div>

<%@include file="footer.jsp"%>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>