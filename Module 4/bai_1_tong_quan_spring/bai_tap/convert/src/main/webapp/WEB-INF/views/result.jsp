<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 22/02/2021
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Money</title>
</head>
<body>
<form action="/convert">
    <table>
        <tr>
            <th colspan="2">Enter USD to change to VietNamDong</th>
        </tr>
        <tr>
            <th>USD<input type="number" name="number" value="${number}"></th>
            <th><input type="submit"></th>
        </tr>
        <tr>
            <th colspan="2">VietNam Dong: ${result}</th>
        </tr>
    </table>
</form>

</body>
</html>
