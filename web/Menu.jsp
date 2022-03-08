

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="home"> SonMotoBike </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">                      

                <li class="nav-item">
                    <a class="nav-link" href="manager">Manager Product</a>
                </li>

                <c:if test="${sessionScope.cuss != null}" >
                    <li class="nav-item">
                        <a class="nav-link">Hi ${sessionScope.cuss.name} </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                    </li>
                </c:if>


                <c:if test="${sessionScope.cuss == null}" >
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login">Login</a>
                    </li>

                </c:if>

            </ul>

            <form action="search" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="txt" value="${txtS}" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="show">
                    <i class="fa fa-shopping-cart"></i> Giỏ Hàng
                    <span class="badge badge-light">3</span>
                </a>                       
            </form>
        </div>
    </div>
</nav>
<section class="jumbotron text-center">
    <div class="row" width="200px" height="200px" style="background-image: url('image/anhbia1.jpg')">
        <div class="col-md-4">
            <img src="image/logo.jpg" width="200px" height="200px">
        </div>
</section>
