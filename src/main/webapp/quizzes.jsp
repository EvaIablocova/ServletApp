<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz Page</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f7f7f7;
        }
        .nav-link {
            background-color: #f0f0f0;
            border-radius: 5px;
            margin-right: 10px;
        }
        .nav-link.active {
            background-color: #ffff99;
        }
        .quiz-container {
            display: flex;
            justify-content: center;
            margin-top: 50px;
        }
        .quiz-card {
            background-color: #3399ff;
            border-radius: 20px;
            padding: 20px;
            margin: 20px;
            width: 200px;
            text-align: center;
            color: #ffffff;
        }
        .quiz-card .quiz-title {
            background-color: #99cc99;
            border-radius: 10px;
            padding: 10px;
            margin-bottom: 20px;
        }
        .quiz-card .btn {
            background-color: #ffff66;
            color: #000;
            border: none;
            padding: 10px 20px;
            border-radius: 10px;
        }
        .footer {
            text-align: center;
            margin-top: 50px;
            padding: 10px;
            background-color: #f0f0f0;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<nav class="nav justify-content-center">
    <a class="nav-link" href="#">Home</a>
    <a class="nav-link active" href="#">Quizzes</a>
</nav>

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

<div class="footer">
    Made by Eva Iablocova
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
