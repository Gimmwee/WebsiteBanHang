<%-- 
    Document   : login
    Created on : Feb 20, 2022, 4:54:20 PM
    Author     : doson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login!!!</h1>
        <h3 style="color: red">${requestScope.error} </h3>
        <form action="login" method="get">
            Enter username<input type="text" name="user" placeholder="Enter Username"><br/>
            Enter password<input type="password" name="pass" placeholder="Enter Password"><br/>
            <input type="submit" value="LOGIN">
            
        </form>
        <p>If you do not already have an account? Please register <a href="register.jsp">Register</a></p>
    </body>
</html>
