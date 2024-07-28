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
        .quiz-content {
            background-color: #ffffff;
            border: 1px solid #ccc;
            border-radius: 20px;
            padding: 30px;
            width: 60%;
            text-align: center;
        }
        .quiz-title {
            background-color: #99cc99;
            border-radius: 10px;
            padding: 10px;
            margin-bottom: 20px;
            color: #ffffff;
        }
        .question {
            background-color: #f0f0f0;
            border-radius: 10px;
            padding: 10px;
            margin-bottom: 20px;
        }
        .options {
            list-style: none;
            padding: 0;
        }
        .options li {
            margin-bottom: 10px;
        }
        .footer {
            text-align: center;
            margin-top: 50px;
            padding: 10px;
            background-color: #f0f0f0;
            border-radius: 5px;
        }
        .nav-buttons {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<nav class="nav justify-content-center">
    <a class="nav-link" href="#">Home</a>
    <a class="nav-link active" href="#">Quizzes</a>
</nav>

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

<div class="footer">
    Made by Eva Iablocova
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
