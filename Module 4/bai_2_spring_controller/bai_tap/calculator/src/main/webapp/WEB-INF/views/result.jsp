<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 22/02/2021
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/calculator" >
    <input required type="number" name="num1" value="${num1}">
    <input required type="number" name="num2" value="${num2}">
    <button type="submit" name="calculator" value="addition">Addition(+)</button>
    <button type="submit" name="calculator" value="subtraction">Subtraction(-)</button>
    <button type="submit" name="calculator" value="multiplication">Multiplication(*)</button>
    <button type="submit" name="calculator" value="division">Division(/)</button>
  </form>
  </body>
<h1> Result ${operator}: ${result}</h1>
</html>
