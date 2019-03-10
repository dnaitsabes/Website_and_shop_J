<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Shop online JS</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script rel="stylesheet" src="css/style.css"></script>
</head>
<body>
<%@include file="/header.jsp" %>

<div class="container">

    <h2>Newsletter List</h2>
    <p></p>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>email adress</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${newsletter}" var="newsletter1">
        <tr>
            <td>${newsletter1.id}</td>
            <td>${newsletter1.email}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="/footer.jsp" %>


</body>
</html>
