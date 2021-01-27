<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 27/01/2021
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View information</title>
</head>
<body>
<h1>View user detail</h1>
<p>
    <a href="/user">Back to user list</a>
</p>
<table>
    <tr>
        <td>ID:</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Country:</td>
        <td>${user.country}</td>
    </tr>

</table>
</body>
</html>
