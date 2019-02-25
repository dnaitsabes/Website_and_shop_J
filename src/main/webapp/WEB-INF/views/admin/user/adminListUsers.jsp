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
div class="container">

<h2>Lista uzytkownikół strony</h2>
<p></p>

<table class="table table-bordered">
    <thead>
    <tr>
        <th>id</th>
        <th>IMie</th>
        <th>Nazwisko</th>
        <th>e mail</th>
        <th>Dat stworzenia uzytkownika</th>
        <th>admin</th>

        <th>uaktualnij</th>
        <th>usuń</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${usersList}" var="usersList1">
        <tr>
            <td>${usersList1.id}</td>
            <td>${usersList1.firstName}</td>
            <td>${usersList1.LastName}</td>
            <td>${usersList1.email}</td>
            <td>${usersList1.userCreatedDate}</td>
            <td>${usersList1.admin}</td>


            <td><a href="user/update/${usersList1.id}">Uaktualnij rozmiary produktów</a></td>
            <td><a href="user/delete/${usersList1.id}">usuń rozmiar produktów</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>


<footer class="container-fluid text-center" id="footer">

</footer>



</body>
</html>
