<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<a>
<%@include file="/header.jsp"%>





    <div class="container">
        <h2>Lista zamówionych produktów</h2>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>nazwa produktu</th>
                <th>krótki opis produktu</th>
                <th>cena za 1 produkt</th>
                <th>ilość</th>
                <th>Cena za wszystkie produkty</th>

                <th>usuń</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cart.cartItems}" var="simpleCart">
                <tr>
                    <td>${simpleCart.product.productName}</td>
                    <td>${simpleCart.product.productShortDescription}</td>
                    <td>${simpleCart.product.price}</td>
                    <td>${simpleCart.quantity}</td>
                    <td>${simpleCart.productSumPrice}  </td>

                    <td><a href="/shop/delete/${simpleCart.product.id}">usuń produkt</a></td>
                </tr>
            </c:forEach>
           Suma zamówień <tr>${simpleCart.productSumPrice}</tr>
            </tbody>
        </table>
        <a href="/order/confirmOrder">
            <button type="button" class="btn btn-primary btn-lg">Zamawiam</button>
        </a>
    </div>


    <%@include file="/footer.jsp"%>>



</body>
</html>
