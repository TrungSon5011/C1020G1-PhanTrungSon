<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 23/01/2021
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>Result:</h2>
<c:choose>
    <c:when test="${check == 1}">
        division by zero exception
    </c:when>
    <c:otherwise>
        <c:out value="${firstNum    }"></c:out>
        <c:out value="${operator    }"></c:out>
        <c:out value="${secondNum    }"></c:out>
        <span>=    </span>
        <c:out value="${operator2Number}"></c:out>
    </c:otherwise>
</c:choose>
</body>
</html>
