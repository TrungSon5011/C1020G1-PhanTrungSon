<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 22/02/2021
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Condiments</title>
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
  </body>
</html>
