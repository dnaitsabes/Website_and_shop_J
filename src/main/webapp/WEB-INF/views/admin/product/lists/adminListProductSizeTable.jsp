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

<div class="container">

    <h2>Lista rozmiarów produktów</h2>
    <p></p>
    <td><a href="productSizeTable/add">Dodaj rozmiar produktu</a></td>
    <br>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>Kategoria rozmiaru produktu</th>
            <th>Kod rozmiaru </th>
            <th>opis kodu rozmiaru</th>
            <th>uaktualnij</th>
            <th>usuń</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productSizeTableList}" var="productSizeTableList1">
            <tr>
                <td>${productSizeTableList1.id}</td>
                <td>${productSizeTableList1.productSizeCategory}</td>
                <td>${productSizeTableList1.getProductSizeCode}</td>
                <td>${productSizeTableList1.productSizeDescription}</td>


                <td><a href="productSizeTable/update/${productSizeTableList1.id}">Uaktualnij rozmiary produktów</a></td>
                <td><a href="productSizeTable/delete/${productSizeTableList1.id}">usuń rozmiar produktów</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
