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

<h2>Potwierdzenie Adresu do zamówienia</h2>




<form:form class="form-horizontal" method="post" action="/order/createOrder" modelAttribute="userDetails">
<div class="form-group">
    <div class="col-sm-10">
        <label class="control-label col-sm-2">Imie</label><h3>${user.firstName}</h3><br>
    </div>
    <div class="col-sm-10">
        <label class="control-label col-sm-2">Nazwisko</label><h3>${user.lastName}</h3><br>
    </div>
</div>
    <form:errors path="*"/><br><br>
    <form:hidden path="id" value="${userDetails.id}"/>
    <div class="form-group">
        <label class="control-label col-sm-2">Nazwa Firmy</label>
        <div class="col-sm-10">
            <form:input path="companyName" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Ulica</label>
        <div class="col-sm-10">
            <form:input path="street" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Numer Domu</label>
        <div class="col-sm-10">
            <form:input path="buildingNumber" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Numer Mieszkania</label>
        <div class="col-sm-10">
            <form:input path="houseNumber" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Miasto</label>
        <div class="col-sm-10">
            <form:input path="cityName" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Kod Pocztowy</label>
        <div class="col-sm-10">
            <form:input path="postalCode" class="form-control" />
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Numer Telefonu</label>
        <div class="col-sm-10">
            <form:input path="phoneNumber" class="form-control" />
        </div>
    </div>


    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Potwierdzam zamówienie</button>
        </div>
    </div>
</form:form>





<%@include file="/footer.jsp"%>>




</body>
</html>
