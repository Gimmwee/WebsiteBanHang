<%-- 
    Document   : AllProduct
    Created on : Mar 9, 2022, 9:14:43 PM
    Author     : Son
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>All Products</title>
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <style>
        .search {
            border: 1px solid #140f0f;
            font-size: 14px;
        }
        form a {
            font-size: 15px;
            color: #2b2020;            
        }
        .category{
            list-style-type: none;
        }
        .page-btn span {

            border: 1px solid #140f0f;
            color: #140f0f;
        }       

    </style>
    <body>
        <div class="container">
            <div class="navbar">
                <div class="logo">
                    <a href="home"><img src="image/logo.jpg" width="125px"></a>
                </div>
                <nav>
                    <ul id="MenuItems">
                        <li><a href="home">Home</a></li>
                        <li><a href="list">Products</a></li>                            
                        <li><a href="">ManagerProduct</a></li>
                        <li><a href="Login.jsp">Login</a></li>
                    </ul>
                </nav>
                <a href="cart.html"><img src="image/imagecart.jpg" width="30px" height="30px"></a>
                <img src="image/menu.jpg" class="menu-icon" onclick="menutoggle()">
            </div>
        </div>
    </div>

    <div class="small-container">
        <div class="row row-2">
            <h2>Tất cả sản phẩm</h2>
            <form action="" class="search-bar">
                <input type="search" name="search" class="search" pattern=".*\S.*" required placeholder="Search...">
                <button class="search-btn" type="submit">
                    <span><a href="#">Search</a></span>
                </button>
            </form>          
            <div>Danh Mục :</div>
            <c:forEach items="${listC}" var="o">                  
                <li class="category"><a href="category?cid=${o.cid}">${o.name}</a></li>                      
                </c:forEach>                                                               
        </div>
        <div class="row">
            <c:forEach items="${listP}" var="o">
                <div class="col-4">
                    <a href="detail?did=${o.id}"><img src="image/${o.image}"></a>
                    <h4>${o.name}</h4>
                    <p>${o.title}</p>
                    <p>${o.price} $</p>
                </div>
            </c:forEach>
        </div>     
        <div class="row" >
            <div class="col-2"> <a href="#"><img src="image/${detail.image}"></a></div>

            <div class="col-3">
                <h3>${detail.name}</h3>                             
                <h4>${detail.price}$</span>              
                <p>${detail.detail} </p>
            </div>
        </div>
    </div>
    <!-- ------------footer----------- -->

    <jsp:include page="footer.jsp"></jsp:include>
    <!-- ------------------- js for toggle menu-------------- -->
    <script>
        var MenuItems = document.getElementById("MenuItems");

        MenuItems.style.maxHeight = "0px";

        function menutoggle() {
            if (MenuItems.style.maxHeight == "0px") {
                MenuItems.style.maxHeight = "200px";
            } else {
                MenuItems.style.maxHeight = "0px";
            }
        }
    </script>
</body>

</html>