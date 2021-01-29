<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 27/01/2021
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap.min.css" type="text/css">
</head>
<body>
<h1>User</h1>
<p>
    <a href="/user?actionUser=create">Create new user</a>
</p>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Country</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items='${userList}' var="userList">
        <tr>
            <th scope="row"><a href="/user?actionUser=view&id=${userList.id}">${userList.id}</a></th>
            <td>${userList.name}</td>
            <td>${userList.email}</td>
            <td>${userList.country}</td>
            <td><a href="/user?actionUser=update&id=${userList.id}">update</a></td>
            <td><a href="/user?actionUser=delete&id=${userList.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<form method="get">
    <div class="form-group">
        <label for="exampleInputEmail1">Search user by country</label>
        <input type="hidden" name="actionUser" value="find">
        <input  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="byCountry">
    </div>
<%--    <input type="submit" value="Submit">--%>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
