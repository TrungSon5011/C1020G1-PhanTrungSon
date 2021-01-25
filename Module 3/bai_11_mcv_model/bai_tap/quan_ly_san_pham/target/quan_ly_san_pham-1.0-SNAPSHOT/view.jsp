<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 25/01/2021
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>View product detail</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <tr>
        <td>ID:</td>
        <td>${product.id}</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>Price:</td>
        <td>${product.price}</td>
    </tr>
    <tr>
        <td>Description:</td>
        <td>${product.description}</td>
    </tr>
    <tr>
        <td>Brand:</td>
        <td>${product.brand}</td>
    </tr>
</table>
</body>
</html>
