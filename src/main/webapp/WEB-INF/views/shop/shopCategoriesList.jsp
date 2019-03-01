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
<%@include file="/header.jsp"%>


<div class="container-fluid bg-3 text-center">
    <h3 class="margin">Kategorie Produktów</h3><br>
    <div class="row">
        <div class="col-sm-6">
            <p>AKCESORIA</p>
            <p>Różnego rodzaju akcesorai takie jak:Plecaki, Torby, nerki itp... </p>
            <a href="/shop/acesories">
            <img src="/pictures/Plecak1_n.jpg" class="img-responsive margin" style="width: 55%; ; height: 35%; margin: 0 auto"  >
            </a>
        </div>
        <div class="col-sm-6">
            <p>UBRANIA</p>
            <p>Różnego rodzaju ubrania dla dzieci i dorosłych</p>
            <a href="/shop/clothes">
            <img src="/pictures/Bluza_dziecieca_1_n.jpg" class="img-responsive margin" style="width: 55%; ; height: 35%;margin: 0 auto"  >
            </a>
        </div>

    </div>
</div>
<%@include file="/footer.jsp"%>>



</body>
</html>
