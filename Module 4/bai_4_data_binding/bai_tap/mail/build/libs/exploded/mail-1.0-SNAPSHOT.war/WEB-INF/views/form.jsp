<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 24/02/2021
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail</title>
</head>
<body>
<h1>Setting</h1>
<form:form modelAttribute="mail" action="/update" method="post">
    <table>
        <tr>
            <th>Languages:</th>
            <th>
                <form:select path="language" items="${languages}" />
            </th>
        </tr>
        <tr>
            <th>Page size:</th>
            <th>Show <form:radiobuttons path="pageSize" items="${size}" /> email per pages</th>
        </tr>
        <tr>
            <th>Spam filters:</th>
            <th><form:checkbox path="spamsFilter" /> Enable spam filter</th>
        </tr>
        <tr >
            <th >Signature:</th>
            <th><form:textarea path="signature" ></form:textarea></th>
        </tr>
        <tr>
            <th></th>
            <th >
                <input type="submit" value="update">
            </th>
        </tr>
    </table>
</form:form>
</body>
</html>
