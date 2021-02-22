<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 22/02/2021
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/search">
    <table>
        <tr>
            <th colspan="2">Enter English word</th>
        </tr>
        <tr>
            <th><input type="text" name="englishWord" value="${englishWord}"></th>
            <th><input type="submit" value="Search"></th>
        </tr>
        <tr>
            <th colspan="2">Result: ${vietWord}</th>
        </tr>
    </table>
</form>
</body>
</html>
