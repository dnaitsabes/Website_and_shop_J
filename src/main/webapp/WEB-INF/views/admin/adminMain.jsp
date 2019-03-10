<!DOCTYPE html>
<html lang="pl">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Shop online JS</title>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script rel="stylesheet" src="css/style.css"></script>
</head>
<body>
<%@include file="/header.jsp"%>

<div class="container text-center">
    <h3>Dostępne akcje dla aministratora</h3><br>
    <div class="row">
        <div class="col-sm-6">
            <ul class="list-group">
                <li class="list-group-item">Produkty</li><br>
                <a href="productsList" class="list-group-item">Lista produktów</a>
                <a href="product/add" class="list-group-item">Dodaj produkt</a><br>

                <a href="productsDetailsList" class="list-group-item">Lista Szczegółów produktów</a>
                <a href="productDetail/add" class="list-group-item">DOdaj Szczegóły produktów</a><br>

                <a href="productCategoriesList"class="list-group-item">Lista Kategori produktów</a>
                <a href="productCategory/add" class="list-group-item">Dodaj kategorie produktów</a><br>

                <a href="productTypeList" class="list-group-item">Lista typów produktów</a>
                <a href="productType/add" class="list-group-item">Dodaj typy produktów</a><br>

                <a href="productSizeTableList" class="list-group-item">Lista rozmiarów produktów</a>
                <a href="productSizeTable/add" class="list-group-item">Dodaj rozmiary produktów</a><br>


            </ul>
        </div>
        <div class="col-sm-6">
            <ul class="list-group">
                <a href="ordersList" class="list-group-item">Lista zamówień</a><br>
                <a href="newslettersList" class="list-group-item">Lista newslettera</a><br>
                <a href="usersList" class="list-group-item">Lista użytkowników</a><br>
                <a href="siteDataList" class="list-group-item">Lista danych strony</a><br>
            </ul>
        </div>
    </div>
</div><br>



<%@include file="/footer.jsp"%>>

</body>
</html>
