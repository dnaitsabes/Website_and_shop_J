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
    <h2 class="h1-responsive font-weight-bold text-center my-5">Nasze Akcesoria</h2>
    <!-- Section description -->
    <p class="grey-text text-center w-responsive mx-auto mb-5">Lorem ipsum dolor sit amet, consectetur
        adipisicing elit. Fugit, error amet numquam iure provident voluptate esse quasi, veritatis totam voluptas
        nostrum quisquam eum porro a pariatur veniam.</p>
    <div class="row" >

        <c:forEach items="${productForMaty}" var="productForMaty1">

            <!-- Grid column -->
            <div class=col-sm-4" >
                <!-- Card -->
                <div class="card align-items-center">
                    <!-- Card image -->
                    <div class="view overlay">
                        <a href="/shop/productDetail/${productForMaty1.id}" class="grey-text">
                            <img src="/pictures/${productForMaty1.productLink}" class="card-img-top" style="width: 55%; ; height: 35%; margin: 0 auto"
                                 alt="">


                            <!-- Card image -->
                            <!-- Card content -->
                            <div class="card-body text-center"> </div>
                            <!-- Category & Title -->

                            <h5>${productForMaty1.productName}</h5>
                        </a>
                        <h5>
                            <strong>
                                <p class="dark-grey-text">${productForMaty1.productShortDescription}</p>
                            </strong>
                        </h5>
                        <h4 class="font-weight-bold blue-text">
                            <strong>${productForMaty1.price} PLN</strong>
                        </h4>
                    </div>
                    <!-- Card content -->
                </div>
                <!-- Card -->
            </div>
        </c:forEach>
    </div>

    <div class="row" >

        <c:forEach items="${productForPiorniki}" var="productForPiorniki1">

            <!-- Grid column -->
            <div class=col-sm-4" >
                <!-- Card -->
                <div class="card align-items-center">
                    <!-- Card image -->
                    <div class="view overlay">
                        <a href="/shop/productDetail/${productForPiorniki1.id}" class="grey-text">
                            <img src="/pictures/${productForPiorniki1.productLink}" class="card-img-top" style="width: 55%; ; height: 35%; margin: 0 auto"
                                 alt="">


                            <!-- Card image -->
                            <!-- Card content -->
                            <div class="card-body text-center"> </div>
                            <!-- Category & Title -->

                            <h5>${productForPiorniki1.productName}</h5>
                        </a>
                        <h5>
                            <strong>
                                <p class="dark-grey-text">${productForPiorniki1.productShortDescription}</p>
                            </strong>
                        </h5>
                        <h4 class="font-weight-bold blue-text">
                            <strong>${productForPiorniki1.price} PLN</strong>
                        </h4>
                    </div>
                    <!-- Card content -->
                </div>
                <!-- Card -->
            </div>
        </c:forEach>
    </div>

    <div class="row" >

        <c:forEach items="${productForPlecaki}" var="productForPlecaki1">

            <!-- Grid column -->
            <div class=col-sm-4" >
                <!-- Card -->
                <div class="card align-items-center">
                    <!-- Card image -->
                    <div class="view overlay">
                        <a href="/shop/productDetail/${productForPlecaki1.id}" class="grey-text">
                            <img src="/pictures/${productForPlecaki1.productLink}" class="card-img-top" style="width: 55%; ; height: 35%; margin: 0 auto"
                                 alt="">


                            <!-- Card image -->
                            <!-- Card content -->
                            <div class="card-body text-center"> </div>
                            <!-- Category & Title -->

                            <h5>${productForPlecaki1.productName}</h5>
                        </a>
                        <h5>
                            <strong>
                                <p class="dark-grey-text">${productForPlecaki1.productShortDescription}</p>
                            </strong>
                        </h5>
                        <h4 class="font-weight-bold blue-text">
                            <strong>${productForPlecaki1.price} PLN</strong>
                        </h4>
                    </div>
                    <!-- Card content -->
                </div>
                <!-- Card -->
            </div>
        </c:forEach>
    </div>

    <div class="row" >

        <c:forEach items="${productForTorby}" var="productForTorby1">

            <!-- Grid column -->
            <div class=col-sm-4" >
                <!-- Card -->
                <div class="card align-items-center">
                    <!-- Card image -->
                    <div class="view overlay">
                        <a href="/shop/productDetail/${productForTorby1.id}" class="grey-text">
                            <img src="/pictures/${productForTorby1.productLink}" class="card-img-top" style="width: 55%; ; height: 35%; margin: 0 auto"
                                 alt="">


                            <!-- Card image -->
                            <!-- Card content -->
                            <div class="card-body text-center"> </div>
                            <!-- Category & Title -->

                            <h5>${productForTorby1.productName}</h5>
                        </a>
                        <h5>
                            <strong>
                                <p class="dark-grey-text">${productForTorby1.productShortDescription}</p>
                            </strong>
                        </h5>
                        <h4 class="font-weight-bold blue-text">
                            <strong>${productForTorby1.price} PLN</strong>
                        </h4>
                    </div>
                    <!-- Card content -->
                </div>
                <!-- Card -->
            </div>
        </c:forEach>
    </div>

    <div class="row" >

        <c:forEach items="${productForNerki}" var="productForNerki1">

            <!-- Grid column -->
            <div class=col-sm-4" >
                <!-- Card -->
                <div class="card align-items-center">
                    <!-- Card image -->
                    <div class="view overlay">
                        <a href="/shop/productDetail/${productForNerki1.id}" class="grey-text">
                            <img src="/pictures/${productForNerki1.productLink}" class="card-img-top" style="width: 55%; ; height: 35%; margin: 0 auto"
                                 alt="">


                            <!-- Card image -->
                            <!-- Card content -->
                            <div class="card-body text-center"> </div>
                            <!-- Category & Title -->

                            <h5>${productForNerki1.productName}</h5>
                        </a>
                        <h5>
                            <strong>
                                <p class="dark-grey-text">${productForNerki1.productShortDescription}</p>
                            </strong>
                        </h5>
                        <h4 class="font-weight-bold blue-text">
                            <strong>${productForNerki1.price} PLN</strong>
                        </h4>
                    </div>
                    <!-- Card content -->
                </div>
                <!-- Card -->
            </div>
        </c:forEach>
    </div>

</section>

<%@include file="/footer.jsp"%>>




</body>
</html>
