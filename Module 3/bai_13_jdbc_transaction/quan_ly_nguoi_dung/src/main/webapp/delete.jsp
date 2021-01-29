<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 27/01/2021
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
<p>
    <a href="/user">Back to user list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id" id="id" value="${user.id}"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" id="country" value="${user.country}">
                </td>
            </tr>

            <tr>
                <td><input type="submit" value="Delete user"></td>
                <td><a href="/user">Back to user list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
