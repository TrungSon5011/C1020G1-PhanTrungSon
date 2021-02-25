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
    <input required type="number" name="number1" value="${number1}">
    <input required type="number" name="number2" value="${number2}">
    <button type="submit" name="operator" value="addition">Addition(+)</button>
    <button type="submit" name="operator" value="subtraction">Subtraction(-)</button>
    <button type="submit" name="operator" value="multiplication">Multiplication(*)</button>
    <button type="submit" name="operator" value="division">Division(/)</button>
  </form>
  </body>
<h1> Result ${operator}: ${result}</h1>
</html>
