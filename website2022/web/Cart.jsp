<%-- 
    Document   : Cart
    Created on : Mar 9, 2022, 9:12:40 PM
    Author     : Son
--%>

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
                            <div>Xóa</div>
                        </th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="o">
                    <tr>
                        <td > <a href="#">${o.name}</a></td>
                        <td> <img src="${o.image}" alt="" width="70" > </td>
                        <td ><strong>${o.price}</strong></td>
                        <td >
                            <a href="sub?id=${o.id}"><button class="btnSub">-</button></a> <strong>${o.amount}</strong>
                            <a href="cart?id=${o.id}"><button class="btnAdd">+</button></a>
                        </td>
                        <td ><a href="remove?id=${o.id}" ></a>
                            <button type="button">Delete</button>

                        </td>
                    </tr> 
                </c:forEach>
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
                        <li ><strong>Phí vận chuyển: </strong><strong>Free ship</strong></li>
                        <li ><strong>Tổng thanh toán</strong>
                            <h5>${sum} ₫</h5>
                        </li>
                    </ul>
                    <a href="order" >Mua hàng</a>
                </div>
            </div>
        </div>



    </body>

</html>
