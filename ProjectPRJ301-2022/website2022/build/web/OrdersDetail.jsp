<%-- 
    Document   : OrdersDetail
    Created on : Mar 24, 2022, 9:57:23 AM
    Author     : Son
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <h1>OrdersDetail</h1>
        <a>Add New OrdersDetail</a>
        <table border="1">
            <thead>
                <tr>
                    <th>OrderID</th>
                    <th>ProductID</th>
                    <th>Name</th>
                    <th>Image</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listO}" var="o">
                    <c:forEach items="${listP}" var="i">
                        <c:if test="${i.id == o.productID}">
                            <tr>
                                <td>${o.orderID}</td>
                                <td>${o.productID}</td>
                                <td>${i.name}</td>
                                <td><img src="image/${i.image}" width="70" ></td>
                                <td>${i.price}</td>
                                <td>${o.quantity}</td>
                                <td ><a href="DeleteOrdersDetail?id=${o.orderID}&quantity=0&orderID=${listOrderDetail[0].orderID}" onclick="funtion('${i.id}')">
                                        <button type="button">Delete</button>
                                    </a>    
                                </td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
