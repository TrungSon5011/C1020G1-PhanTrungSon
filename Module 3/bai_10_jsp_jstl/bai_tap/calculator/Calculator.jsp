<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 23/01/2021
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/simple_calculator">
    <table>
        <tr>
            <th>
                First operand:
            </th>
            <th>
                <input type="number" name="firstNumber">
            </th>
        </tr>
        <tr>
            <th>
                Operator:
            </th>
            <th>
                <select name="operator">
                    <option type="radio" name="operatorSum" value="+">+</option>
                    <option type="radio" name="operatorSub" value="-">-</option>
                    <option type="radio" name="operatorMul" value="x">x</option>
                    <option type="radio" name="operatorDiv" value="/">/</option>
                </select>
            </th>
        </tr>
        <tr>
            <th>
                Second operand:
            </th>
            <th>
                <input type="number" name="secondNumber">
            </th>
        </tr>
    </table>
    <input type="submit" value="Calculate" id="submit">
</form>
</body>
</html>
