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

<div class="content">
    <form id="quizForm">
        <div class="question-text">${requestScope.TextOfQuestion}</div>

        <div class="radio-option">
            <input type="radio" id="option1" name="option" value="option1">
            <label for="option1">${requestScope.Option1}</label>
        </div>
        <div class="radio-option">
            <input type="radio" id="option2" name="option" value="option2">
            <label for="option2">${requestScope.Option2}</label>
        </div>
        <div class="radio-option">
            <input type="radio" id="option3" name="option" value="option3">
            <label for="option3">${requestScope.Option3}</label>
        </div>
    </form>

    <div class="btn-group">
        <form action="/question" method="get">
            <input type="hidden" name="action" value="prev">
            <button type="submit" class="btn btn-primary mb-3" style="margin-right: 10px;">Prev</button>
        </form>
        <form action="/question" method="get">
            <input type="hidden" name="action" value="next">
            <button type="submit" class="btn btn-primary mb-3" style="margin-left: 10px;">Next</button>
        </form>
    </div>

    <form action="/results" method="get">
        <button type="submit" class="btn btn-primary btn-block mb-3">Go to results</button>
    </form>
</div>



<%@include file="footer.jsp"%>

<!-- jQuery, Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<script>
    $(document).ready(function() {
        $('input[type="radio"]').click(function() {
            var selectedOption = $(this).val();
            $.ajax({
                type: "POST",
                url: "/question",
                data: { option: selectedOption },
                success: function(response) {
                    console.log("Ответ успешно отправлен");
                },
                error: function(xhr, status, error) {
                    console.error("Произошла ошибка при отправке данных: " + error);
                }
            });
        });
    });
</script>

</body>

</html>
