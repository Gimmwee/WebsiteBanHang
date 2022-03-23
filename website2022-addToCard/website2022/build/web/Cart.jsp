<%-- 
    Document   : Cart
    Created on : Mar 9, 2022, 9:12:40 PM
    Author     : Son
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cart</title>
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>

    <body>
        <style>
            .tablecart{

                display: inline-block;
                margin-left: 498px;
            }
            .bill {

                margin-left: 500px;

            }
            .billl {
                padding: 50px ;
            } 
            .billl a {
                text-decoration: none;
                color: #e52f2f;
            }
        </style>
    <body>

        <!-- Shopping cart table -->
        <div class="tablecart">
            <table class="table">
                <thead>
                    <tr>
                        <th >
                            <div >Sản Phẩm</div>
                        </th>
                        <th>
                            <div>Image</div>
                        </th>
                        <th >
                            <div>Đơn Giá</div>
                        </th>
                        <th>
                            <div>Số Lượng</div>
                        </th>
                        <th>
                            <div>Thành Tiền</div>
                        </th>
                        <th>
                            <div>Action</div>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listOrderDetail}" var="o">

                        <tr>
                            <c:forEach items="${listProduct}" var="i">
                                <c:if test="${i.id == o.productID}">
                                    <td>${i.name}</td>
                                    <td><img src="image/${i.image}" width="70" > </td>
                                    <td><strong>${i.price}</strong></td>
                                    <td>${o.quantity}</td>
                                    <td>${i.price * o.quantity}</td>
                                    <c:set var="PriceTotal" value="${PriceTotal + i.price * o.quantity}"/>
                                    <td>
                                        <a href="updateAddToCart?id=${i.id}&quantity=${o.quantity-1}&orderID=${listOrderDetail[0].orderID}"><button class="btnSub">-</button></a> <strong>${o.quantity}</strong>
                                        <a href="updateAddToCart?id=${i.id}&quantity=${o.quantity+1}&orderID=${listOrderDetail[0].orderID}"><button class="btnAdd">+</button></a>
                                    </td>
                                    <td ><a href="updateAddToCart?id=${i.id}&quantity=0&orderID=${listOrderDetail[0].orderID}">
                                            <button type="button">Delete</button>
                                        </a>    
                                    </td>
                                </c:if>
                            </c:forEach>     
                        </tr> 
                        <c:set var="TotalItems" value="${TotalItems + o.quantity}"/>
                    </c:forEach>
                    <tr>
                        <th scope="row"></th>
                        <td></td>
                        <td></td>
                        <td class="fw-bold">Tổng tiền <span style="color: red;">(<c:out value="${TotalItems}"/> items)</span>: </td>
                        <td>$ <c:out value="${PriceTotal}"/></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <!-- End -->


        <div class="bill" >                           
            <div class="billl" >
                <div >Thành tiền</div>
                <div >
                    <ul >
                        <li><strong>Tổng tiền hàng</strong><strong>${total}</strong></li>                   
                        <li ><strong>Tổng thanh toán</strong>
                            <h5>${sum} ₫</h5>
                        </li>
                    </ul>
                    <a href="confirm?orderID=${listOrderDetail[0].orderID}&&billTotal=<c:out value="${PriceTotal}"/>" >Mua hàng</a>
                </div>
            </div>
        </div>
        <h1 style="text-align: center">Sản phẩm đã thanh toán</h1>
        <div class="tablecart">
            <c:forEach items="${listConfirmOrder}" var="k">
                <table class="table">
                    <thead>
                        <tr>
                            <th >
                                <div >Sản Phẩm</div>
                            </th>
                            <th>
                                <div>Image</div>
                            </th>
                            <th >
                                <div>Đơn Giá</div>
                            </th>
                            <th>
                                <div>Số Lượng</div>
                            </th>
                            <th>
                                <div>Thành Tiền</div>
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${k.listCustomerOrderProduct}" var="o">

                            <tr>
                                <c:forEach items="${listProduct}" var="i">
                                    <c:if test="${i.id == o.productID}">
                                        <td>${i.name}</td>
                                        <td><img src="image/${i.image}" width="70" > </td>
                                        <td><strong>${i.price}</strong></td>
                                        <td>${o.quantity}</td>
                                        <td>${i.price * o.quantity}</td>
                                        <c:set var="PriceTotal" value="${PriceTotal + i.price * o.quantity}"/>
                                    </c:if>
                                </c:forEach>     
                            </tr> 
                            <c:set var="TotalItems" value="${TotalItems + o.quantity}"/>
                        </c:forEach>
                        <tr>
                            <th scope="row"></th>
                            <td></td>
                            <td></td>
                            <td class="fw-bold">Tổng tiền <span style="color: red;">(<c:out value="${TotalItems}"/> items)</span>: </td>
                            <td>$ <c:out value="${PriceTotal}"/></td>
                        </tr>
                    </tbody>
                </table>
            </c:forEach>
        </div>
    </body>

</html>
