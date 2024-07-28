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
    <div class="quiz-card">
        <div class="quiz-title">Quiz 1</div>
        <button class="btn">Play</button>
    </div>
    <div class="quiz-card">
        <div class="quiz-title">Quiz 2</div>
        <div class="btn">Your score: 11/20 (in session)</div>
    </div>
</div>

<%@include file="footer.jsp"%>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
