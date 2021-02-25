<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 24/02/2021
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<table>
    <tr>
        <th>
            Languages:</th>
        <th>
            ${mail.language}
        </th>
    </tr>
    <tr>
        <th>Page size:</th>
        <th><p>${mail.pageSize} email per pages</p></th>

    </tr>
        <th>Spam filters:</th>
        <th><c:choose>
            <c:when test="${mail.spamsFilter}">Enable spam filter</c:when>
            <c:otherwise>No Enable spam filter</c:otherwise>
        </c:choose></th>
    </tr>
    <tr >
        <th>Signature:</th>
        <th>${mail.signature}</th>
    </tr>
</table>
</body>
</html>
