<%-- 
    Document   : Left
    Created on : Mar 7, 2022, 9:11:48 PM
    Author     : Son
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Thể Loại</div>
        <ul class="list-group category_block">
            <c:forEach items="${listC}" var="o">
                <li class="list-group-item text-white " ><a href="category?cid=${o.cid}">${o.name}</a></li>
                </c:forEach>

        </ul>
    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase">Sản Phẩm Mới Nhất</div>
        <div class="card-body">
            <img class="img-fluid" src="image/${p.image}" alt="${p.image}" />
            <h5 class="card-title">${p.name}</h5>
            <p class="card-text">${p.title}</p>
            <p class="bloc_left_price">${p.price}$</p>
        </div>
    </div>
</div>