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

    <h2>Product List</h2>
    <p></p>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>nazwa produktu</th>
            <th>opis produktu</th>
            <th>długi opis produktu</th>
            <th>długi opis produktu</th>
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
                <td>${productsList1.productCategoryDescription}</td>


                <td><a href="product/update/${productsList1.id}">Uaktualnij Kategorie produktów</a></td>
                <td><a href="product/delete/${productsList1.id}">usuń kategorie produktów</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
