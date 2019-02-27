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

    <h2>lista typół produktów</h2>
    <p></p>

    <table class="table table-bordered">
        <a href="productType/add">dodaj liste produkt</a><br>

        <thead>
        <tr>
            <th>id</th>
            <th>Nazwa typów produktów</th>
            <th>Opis typów produktów</th>
            <th>uaktualnij</th>
            <th>usuń</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productTypeList}" var="productTypeList1">
            <tr>
                <td>${productTypeList1.id}</td>
                <td>${productTypeList1.productTypeName}</td>
                <td>${productTypeList1.productTypeDescription}</td>

                <td><a href="productType/update/${productTypeList1.id}">Uaktualnij typ produktów</a></td>
                <td><a href="productType/delete/${productTypeList1.id}">usuń typ produktów</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
