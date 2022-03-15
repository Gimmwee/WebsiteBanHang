<%-- 
    Document   : Signup
    Created on : Mar 16, 2022, 12:43:31 AM
    Author     : Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form id="RegForm" action="signup" method="post" >
            <input name="user" type="text" placeholder="Username">                            
            <input name="phone" type="text" placeholder="Phone Number">
            <input name="pass" type="password" placeholder="Password">
            <input name="repass" type="password"placeholder="Repeat Password">
            <button type="submit" class="btn">Register</button>
        </form>
    </body>
</html>
