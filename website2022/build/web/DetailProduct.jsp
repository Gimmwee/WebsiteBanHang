<%-- 
    Document   : DetailProduct
    Created on : Mar 9, 2022, 9:04:10 PM
    Author     : Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Detail</title>
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>

    <body>
        <div class="container">
            <div class="navbar">
                <div class="logo">
                   <a href="Home.jsp"><img src="image/logo.png" width="125px"></a>
                </div>
                <nav>
                    <ul id="MenuItems">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="products.html">Products</a></li>
                        <li><a href="">About</a></li>
                        <li><a href="">Contact</a></li>
                        <li><a href="account.html">Account</a></li>
                    </ul>
                </nav>
                <a href="cart.html"><img src="images/cart.png" width="30px" height="30px"></a>
                <img src="images/menu.png" class="menu-icon" onclick="menutoggle()">
            </div>
        </div>
    </div>

    <!-- ---------- single Products detail ----------- -->

    <div class="small-container single-product">
        <div class="row">
            <div class="col-2">
                <img src="images/gallery-1.jpg" width="100%" id="productImg">

                <div class="small-img-row">
                    <div class="small-img-rol">
                        <img src="image/gallery-1.jpg" width="100%" class="small-img">
                    </div>
                    <div class="small-img-rol">
                        <img src="image/gallery-2.jpg" width="100%" class="small-img">
                    </div>
                    <div class="small-img-rol">
                        <img src="image/gallery-3.jpg" width="100%" class="small-img">
                    </div>
                    <div class="small-img-rol">
                        <img src="image/gallery-4.jpg" width="100%" class="small-img">
                    </div>
                </div>

            </div>
            <div class="col-2">
                <p>Home / T-Shirt</p>
                <h1>Red Printd T-Shirt by Huy</h1>
                <h4>$50.00</h4>
                <select>
                    <option>Select Size</option>
                    <option>XXL</option>
                    <option>XL</option>
                    <option>Large</option>
                    <option>Medium</option>
                    <option>Small</option>
                    </section>
                    <input type="number" value="1">
                    <a href="" class="btn">Add To Card</a>
                    <h3>Product Detail
                        <i class="fa fa-indent"></i>
                    </h3>
                    <br>
                    <p>Surrounded affronting favourable no mr. Lain knew like half she yet joy. Be than dull as seen
                        very shot. Attachment ye so am travelling estimating projecting is. Off fat address attacks his
                        besides. Suitable settling mr attended no doubtful feelings. Any over for say bore such sold
                        five but hung</p>
            </div>
        </div>
    </div>


    <!-- ------------footer----------- -->

    <div class="footer">
        <div class="container">
            <div class="row">
                <div class="footer-col-1">
                    <h3>Download Our App</h3>
                    <p>Download App for Android and ios mobile phone</p>
                    <div class="app-logo">
                        <img src="image/play-store.png">
                        <img src="image/app-store.png">
                    </div>
                </div>
                <div class="footer-col-2">
                    <img src="image/logo-white.png">
                    <p>Our Purpose Is To Sustainably Make the Pleasure and
                        Benefits of Sports Accessible to the Many</p>
                </div>
                <div class="footer-col-3">
                    <h3>Useful Links</h3>
                    <ul>
                        <li>Coupons</li>
                        <li>Blog Post</li>
                        <li>Return Policy</li>
                        <li>Join Affiliate</li>
                    </ul>
                </div>
                <div class="footer-col-4">
                    <h3>Follow us</h3>
                    <ul>
                        <li>Facebook</li>
                        <li>Twitter</li>
                        <li>Instagram</li>
                        <li>Youtube </li>
                    </ul>
                </div>
            </div>
            <hr>
            <p class="Copyright">Copyright 2020 - By QuocHuy</p>
        </div>
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

        <!-- ------------------- JS for  product gallery------------------------         -->
        <!--        <script>
                    var ProductImg = document.getElementById("productImg");
                    var SmallImg = document.getElementsByClassName("small-img");
        
                    SmallImg[0].onclick = function()
                    {
                        ProductImg.src = SmallImg[0].src;
                    }
                    SmallImg[1].onclick = function()
                    {
                        ProductImg.src = SmallImg[1].src;
                    }
                    SmallImg[2].onclick = function()
                    {
                        ProductImg.src = SmallImg[2].src;
                    }
                    SmallImg[3].onclick = function()
                    {
                        ProductImg.src = SmallImg[3].src;
                    }
        
                </script>-->
</body>

</html>
