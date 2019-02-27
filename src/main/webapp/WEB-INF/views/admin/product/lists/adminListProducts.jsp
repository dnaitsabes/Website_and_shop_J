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
<%@include file="/WEB-INF/views/footerHeader/header.jsp"%>

<div class="container">

    <h2>Product List</h2>
    <p></p>
    <a href="product/add">dodaj produkt</a><br>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>nazwa produktu</th>
            <th>krótki opis produktu</th>
            <th>długi opis produktu</th>
            <th>link do zdjecia produktu</th>
            <th>Cena</th>

            <th>uaktualnij</th>
            <th>usuń</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productsList}" var="productsList1">
            <tr>
                <td>${productsList1.id}</td>
                <td>${productsList1.productName}</td>
                <td>${productsList1.productShortDescription}</td>
                <td>${productsList1.productLongDescription}</td>
                <td>${productsList1.productLink}</td>
                <td>${productsList1.price}</td>


                <td><a href="products/update/${productsList1.id}">Uaktualnij produkt</a></td>
                <td><a href="product/delete/${productsList1.id}">usuń produkt</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
