<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<form:form class="form-horizontal" method="post" modelAttribute="product">
    <form:errors path="*"/><br><br>
    <div class="form-group">
        <label class="control-label col-sm-2">Nazwa productu</label>
        <div class="col-sm-10">
            <form:input path="productName" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Produkt krótki opis</label>
        <div class="col-sm-10">
            <form:input path="productShortDescription" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Produkt długi opis</label>
        <div class="col-sm-10">
            <form:textarea path="productLongDescription" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Cena</label>
        <div class="col-sm-10">
            <form:input  path="price" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Link do zdjęcia produktu</label>
        <div class="col-sm-10">
            <form:input path="productLink" class="form-control" />
        </div>
    </div>
   <%-- <div class="form-group">
        <label class="control-label col-sm-2">Szczegóły produktu</label>
        <div class="col-sm-10">
            <form:select path="productsDetails">
                <form:options value="0" label="Wybierz szczegóły produktu"/>
                <form:options items="${productDetailsAttributes}" itemLabel="productColor" itemValue="id"/>
            </form:select>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Rozmiary produktu</label>
        <div class="col-sm-10">
            <form:select path="productSizeTables">
                <form:options value="0" label="Wybierz rozmiar produktu"/>
                <form:options items="${productSizeTablesAttributes}" itemLabel="productSizeCategory" itemValue="id"/>
            </form:select>
        </div>
    </div>--%>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form:form>

<footer class="container-fluid text-center" id="footer">

</footer>

</body>
</html>
