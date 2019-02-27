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
<body>
<%@include file="/header.jsp"%>

<form:form class="form-horizontal" method="post" modelAttribute="productSizeTable">
    <form:errors path="*"/><br><br>
    <div class="form-group">
        <label class="control-label col-sm-2">Nazwa Kategorii rozmiaru</label>
        <div class="col-sm-10">
            <form:input path="productSizeCategory" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Kod rozmiaru</label>
        <div class="col-sm-10">
            <form:select path="getProductSizeCode">
                <c:forEach items="${productSizeCode}" var="productSizeCode1">
            <form:option class="form-control" value="${productSizeCode1}"/>
                </c:forEach>
            </form:select>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Opis rozmiaru</label>
        <div class="col-sm-10">
            <form:textarea path="productSizeDescription" class="form-control" />
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
