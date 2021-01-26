<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 26/01/2021
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
    <link rel="stylesheet" href="/bootstrap.min.css" type="text/css">
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Brand</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items='${productFromServlet}' var="product">
        <tr>
            <th scope="row"><a href="/products?action=view&id=${product.id}">${product.id}</a></th>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.brand}</td>
            <td><a href="/products?action=edit&id=${product.id}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.id}">delete</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
