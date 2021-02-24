<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 22/02/2021
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich condiments</title>
</head>
<body>
<h1>Sandwich condiments</h1>
<form action="/save">
    <input type="checkbox" name="condiments" value="Lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiments" value="Tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiments" value="Mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiments" value="Sprouts">
    <label>Sprouts</label>
    <br>
    <input type="submit" value="Save">
</form>
<h1>Condiments: </h1>
<c:forEach var="condiment" items="${condiments}" >
    <p>${condiment}</p>
</c:forEach>

</body>
</html>
