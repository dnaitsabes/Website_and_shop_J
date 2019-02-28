<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<div class="row">
    <div class="col-sm-2"></div>
    <div class="col-sm-8">
        <h3 class="font-weight-bold blue-text">  <strong>  ${productDetail.productName}</strong></h3>
        <h3 class="font-weight-bold blue-text">  <strong> ${productDetail.productShortDescription}</strong></h3>
    </div>
    <div class="col-sm-2"></div>
</div>

<div class="row">
    <div class="col-sm-2"></div>
    <div class="col-sm-4">
        <img src="/pictures/${productDetail.productLink}" class="card-img-top" style="width: 55%; ; height: 55%; margin: 0 auto"
             alt="">

    </div>
    <div class="col-sm-4">
        <h4>${productDetail.productLongDescription}</h4>
        <h4><strong>${productDetail.price} PLN</strong></h4>

        <form:form method="post" modelAttribute="product" action="/shop/productDetail/addToBasket">
            <form:hidden path="id" value="${productDetail.id}"/>
            <form:hidden path="productName" value="${productDetail.productName}}"/>
            <form:hidden path="productShortDescription" value="${productDetail.productShortDescription}}"/>
            <form:hidden path="productLongDescription" value="${productDetail.productLongDescription}}"/>
            <form:hidden path="productLink" value="${productDetail.productLink}}"/>
            <div class="form-group">
                <label class="control-label col-sm-2">Wybierz kolor produktu</label>
                <div class="col-sm-10">
                    <form:select path="productsDetails" >
                        <form:options value="0" label="Wybierz typ produkty"/>
                        <form:options items="${productDetailsAttributes}" itemLabel="productColor" itemValue="id"/>
                    </form:select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Wybierz Rozmiar produktu</label>
                <div class="col-sm-10">
                    <form:select path="productSizeTables" >
                        <form:options value="0" label="Wybierz typ produkty"/>
                        <form:options items="${productSizeTablesAttributes}" itemLabel="getProductSizeCode" itemValue="id"/>
                    </form:select>
                </div>
            </div>
            <h4><strong><input type="number" min="0" max="10" name="quantity"> </strong></h4>



            <input type="submit" value="Kup Teraz">

        </form:form>
    </div>
    <div class="col-sm-2"></div>
</div>

<tbody>
    <tr>





    </tr>
</tbody>



</footer>



</body>
</html>
