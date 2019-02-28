<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header" `>
            <a class="navbar-brand" href="/">
                <img src="/pictures/logo.jpg" style="height:100%;display:inline-block;">
                <span>Home made by Justyna</span>
            </a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Strona główna</a></li>
            <li><a href="/workshop">Warsztaty</a></li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Sklep<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="/shop/shopCategories">Główna</a></li>
                    <li><a href="/shop/clothes">Odzież</a></li>
                    <li><a href="/shop/acesories">Akcesoria</a></li>
                </ul>
            </li>

        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/shop/basket"><span class="active"></span> Koszyk</a></li>
            <li><a href="/regulations"><span class="active"></span> Regulamin</a></li>
            <li><a href="/contactDetails"><span class="glyphicon glyphicon-envelope"></span> Dane kontaktowe</a></li>
            <li><a href="/register"><span class="glyphicon glyphicon-user"></span> Rejestracja</a></li>
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> logowanie</a></li>
            <li><a href="/admin/adminMain"><span class="glyphicon glyphicon-log-in"></span> Admin</a></li>
        </ul>
    </div>
</nav>
