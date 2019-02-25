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

    <h2>Newsletter List</h2>
    <p></p>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>kod zamówienia</th>
            <th>data zamówienia</th>
            <th>Kategoria produktów id</th>
            <th>Nazwa kategorii produktów</th>
            <th>uaktualnij/th>
            <th>skasuj</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ordersList}" var="ordersList1">
            <tr>
                <td>${ordersList1.id}</td>
                <td>${ordersList1.orderCode}</td>
                <td>${ordersList1.orderDate}</td>
                <c:forEach items="${ordersList1.productCategory}" var="productCategory">
                    <td>${productCategory.id} ${productCategory.productCategoryName}</td>
                </c:forEach>
                <td><a href="order/update/${ordersList1.id}">Uaktualnij Zamówienie</a></td>
                <td><a href="order/delete/${ordersList1.id}">usuń zamówienie</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


<footer class="container-fluid text-center" id="footer">

</footer>

</body>
</html>
