<%@ page import="bai_tap.customer.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="bai_tap.customer.ListCustomer" %><%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 22/01/2021
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="bootstrap.min.css">
<html>
<head>
    <title>List customer</title>
</head>
<body>
<% List<Customer> customerList = ListCustomer.getCustomerList();
    request.setAttribute("customerList", customerList);
%>

<h1 class="text-center">Customer List</h1>
<table class="table table-hover table-dark">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Date of birth</th>
        <th scope="col">Address</th>
        <th scope="col">Image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.dateOfBirth}"></c:out> </td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td><img src="${customer.image}"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
