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


<form:form class="form-horizontal" method="post" modelAttribute="productCategory">
    <form:errors path="*"/><br><br>
    <div class="form-group">
        <label class="control-label col-sm-2">Nazwa kategorii produktów</label>
        <div class="col-sm-10">
            <form:input path="productCategoryName" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Kategoria produktu opis</label>
        <div class="col-sm-10">
            <form:input path="productCategoryDescripton" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Kategoria link do zdjęć</label>
        <div class="col-sm-10">
            <form:input path="productCategoryLink" class="form-control" />
        </div>
    </div>

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
