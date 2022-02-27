<%-- 
    Document   : register
    Created on : Feb 20, 2022, 5:30:06 PM
    Author     : doson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create Customer</h1>
        <form action="register">
            User name<input type="text" name="userc" placeholder="Enter User name">
            ${requestScope.errorUser}<br/>
            Pass word<input type="password" name="passc" placeholder="Enter Password">
            ${requestScope.errorPass}<br/>
            Name<input type="text" name="namec" placeholder="Enter Full Name"><br/>
            Date of birth <input type="date" name="dobc" placeholder="Enter Date Of Birth"><br/>
            Address<input type="text" name="addressc" placeholder="Enter Address"><br/>
            Phone<input type="text" name="phonec" placeholder="Enter Phone">
            ${requestScope.errorPhone}<br/>
            <input type="submit" value="CREATE">
        </form>
    </body>
</html>
