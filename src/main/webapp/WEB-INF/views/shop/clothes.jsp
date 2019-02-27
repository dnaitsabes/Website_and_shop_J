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



<section class="text-center my-5">

    <!-- Section heading -->
    <h2 class="h1-responsive font-weight-bold text-center my-5">Nasze ubrania</h2>
    <!-- Section description -->
    <p class="grey-text text-center w-responsive mx-auto mb-5">Lorem ipsum dolor sit amet, consectetur
        adipisicing elit. Fugit, error amet numquam iure provident voluptate esse quasi, veritatis totam voluptas
        nostrum quisquam eum porro a pariatur veniam.</p>
    <div class="row" style="margin: 0 auto">

<c:forEach items="${productForClothes}" var="productsList1">

    <!-- Grid column -->
    <div class=col-sm-6">
        <!-- Card -->
        <div class="card align-items-center">
            <!-- Card image -->
            <div class="view overlay">
                <a href="/shop/productDetail/${productsList1.id}" class="grey-text">
                <img src="/pictures/${productsList1.productLink}" class="card-img-top" style="width: 55%; ; height: 35%; margin: 0 auto"
                     alt="">


            <!-- Card image -->
            <!-- Card content -->
            <div class="card-body text-center"> </div>
                <!-- Category & Title -->

                    <h5>${productsList1.productName}</h5>
                </a>
                <h5>
                    <strong>
                        <p class="dark-grey-text">${productsList1.productShortDescription}</p>
                    </strong>
                </h5>
                <h4 class="font-weight-bold blue-text">
                    <strong>${productsList1.price} PLN</strong>
                </h4>
            </div>
            <!-- Card content -->
        </div>
        <!-- Card -->
    </div>
</c:forEach>
</div>

</section>
</footer>



</body>
</html>
