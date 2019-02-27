<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl">
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

    <h2>Szczegóły produktów</h2>
    <p></p>
    <td><a href="productDetail/add">dodaj szczeguły produktów</a></td><br>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>kolory produktów</th>
            <th>typ materiałów produktów</th>
            <th>Uaktualnij</th>
            <th>usuń</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productsDetailsList}" var="productsDetailsList1">
            <tr>
                <td>${productsDetailsList1.id}</td>
                <td>${productsDetailsList1.productColor}</td>
                <td>${productsDetailsList1.productTypeOfMaterial}</td>

                <td><a href="productDetails/update/${productsDetailsList1.id}">Uaktualnij szczegóły produktów</a></td>
                <td><a href="productDetails/delete/${productsDetailsList1.id}">usuń szczegóły produktów</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
