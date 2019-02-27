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

    <h2>Lista kategorii produktów</h2>
    <p></p>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>Nazwa kategorii produktów</th>
            <th>Opis kategorii produktów</th>
            <th>typ kategorii produktów</th>
            <th>uaktualnij</th>
            <th>usuń</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productCategoriesList}" var="productCategoriesList1">
            <tr>
                <td>${productCategoriesList1.id}</td>
                <td>${productCategoriesList1.productCategoryName}</td>
                <td>${productCategoriesList1.productCategoryDescripton}</td>
                <c:forEach items="${productCategoriesList1.productTypes}" var="productTypes">
                    <td>${productTypes.id} ${productCategory.productTypeName}</td>
                </c:forEach>
                <td><a href="productCategories/update/${productCategoriesList1.id}">Uaktualnij Kategorie produktów</a></td>
                <td><a href="productCategories/delete/${productCategoriesList1.id}">usuń kategorie produktów</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
