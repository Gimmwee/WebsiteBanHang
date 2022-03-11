<%-- 
    Document   : homee
    Created on : Mar 10, 2022, 10:13:23 PM
    Author     : Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SonMotorBike</title>
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <style>
        .header {
            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));
        }
        p {
            color: #fff;
        }
        a{
            color: #fff;
        }
        .body{
            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));
        }
        .title::after {

            background: #1d1817;
        }
        .col-2 img {
            max-width: 100%;
            padding: 0px 0;
        }

    </style>

    <body>
        <div class="header">
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
                    <a href="cart.jsp"><img src="image/imagecart.jpg" width="30px" height="30px"></a>
                    <img src="image/menu.png" class="menu-icon" 
                         onclick="menutoggle()">
                </div>
                <div class="row">
                    <div class="col-2">
                        <h1>Welcome to<br> SonMotorBike!</h1>
                        <p>SonMotorBike chuyên mua bán các dòng xe motor thể thao phong phú của các hãng nổi tiếng: Honda, Yamaha, Suzuki,, DUCATI, Kawasaki... </p>

                    </div>
                    <div class="col-2">
                        <img src="image/anhbiaa.jpg">
                    </div>
                </div>
            </div>
        </div>

        <!-- ------------- featured categorries ---------------- -->
        <div class="categories">
            <div class="small-container">
                <div class="row">
                    <div class="col-3">
                        <img src="image/image1.jpg">
                    </div>
                    <div class="col-3">
                        <img src="image/image2.jpg">
                    </div>
                    <div class="col-3">
                        <img src="image/image3.jpg">
                    </div>

                </div>
            </div>

        </div>
        <!-- ------------- featured products ---------------- -->
        <div class="small-container">
            <h2 class="title">Sản Phẩm Mới Nhất</h2>
            <div class="row">
                <div class="col-2">                 
                    <a href="detail?did=${p.id}"><img src="image/${p.image}"></a
                    <h2>${p.name}</h2>
                    <h3>${p.title}</h3>
                    <h3>${p.price}$</h3>
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
                if (MenuItems.style.maxHeight == "0px")
                {
                    MenuItems.style.maxHeight = "200px";
                } else
                {
                    MenuItems.style.maxHeight = "0px";
                }
            }

        </script>
    </body>
</html>