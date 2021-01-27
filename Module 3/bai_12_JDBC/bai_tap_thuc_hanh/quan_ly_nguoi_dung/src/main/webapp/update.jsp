<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 27/01/2021
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="">
    <fieldset>
        <legend>User information</legend>
        <input type="hidden" name="actionUser" value="update" />
        <input type="hidden" name="id" value="${user.id}" />
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${user.name}">43243</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="price" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" id="description" value="${user.country}">
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update user"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
