<%-- 
    Document   : Login
    Created on : Mar 9, 2022, 8:50:12 PM
    Author     : Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SonMoTorBike</title>    
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <style>
        .account-page {           
            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));
        }
        form .btn {
            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));
            color: #000;
        }
        #Indicator {
            background: #271513;
        }      
    </style>

    <body>
        <div class="container">
            <div class="navbar">
                <div class="logo">
                    <a href="#"><img src="image/logo.jpg" width="125px"></a>
                </div>                  
                <img src="image/menu.jpg" class="menu-icon" onclick="menutoggle()">
            </div>
        </div>
        <!-- ------------Account-page------------------- -->
        <div class="account-page">
            <div class="container">
                <div class="row">
                    <div class="col-2">
                        <img src="image/anhbiaa.jpg" width="100%">
                    </div>

                    <div class="col-2">
                        <div class="form-container">
                            <div class="form-btn">
                                <span onclick="login()">Login</span>
                                <span onclick="register()">Register</span>
                                <hr id="Indicator">
                            </div>
                            <form id="LoginForm" action="login" method="post">
                                <p class="text-danger">${mess}</p>
                                <input name="user"  value="${username}" type="text" placeholder="Username">
                                <input name="pass" value="${password}" type="password" placeholder="Password">
                                <div class="remem">
                                    <input name="check" value="${check}" type="checkbox" type="checkbox" > Remember me  
                                </div>
                                <button type="submit" class="btn">Login</button>    
                            </form>
                            <form id="RegForm" action="signup" method="post" >
                                <input name="user" type="text" placeholder="Username">                                                          
                                <input name="phone" type="text" placeholder="Phone Number">
                                <input name="pass" type="password" placeholder="Password">
                                <input name="repass" type="password"placeholder="Repeat Password">
                                <button type="submit" class="btn">Register</button>
                            </form>

                            </form>


                        </div>
                    </div>
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
        <!-- ------------------- js for Account form-------------- -->

        <script>
            var LoginForm = document.getElementById("LoginForm");
            var RegForm = document.getElementById("RegForm");
            var Indicator = document.getElementById("Indicator");

            function register() {
                RegForm.style.transform = "translateX(0px)";
                LoginForm.style.transform = "translateX(0px)";
                Indicator.style.transform = "translateX(100px)";

            }
            function login() {
                RegForm.style.transform = "translateX(300px)";
                LoginForm.style.transform = "translateX(300px)";
                Indicator.style.transform = "translateX(0px)";
            }


        </script>

    </body>

</html>