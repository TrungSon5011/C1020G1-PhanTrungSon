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
<%
//    int check = (int) request.getAttribute("check");
    int check = 0;
    request.setAttribute("check",request.getAttribute("check"));
%>
<h2>Result:</h2>
<c:set var="check" scope="session" value="${check}" ></c:set>
<c:choose>
    <c:when test="${check == 1}">
        division by zero exception
    </c:when>
    <c:otherwise>
        <span><%=request.getAttribute("firstNum")%>    </span>
        <span><%=request.getAttribute("operator")%>    </span>
        <span><%=request.getAttribute("secondNum")%>    </span>
        <span>=    </span>
        <span><%=request.getAttribute("operator2Number")%>    </span>
    </c:otherwise>
</c:choose>
<span><%=request.getAttribute("check")%></span>
<span><%=request.getAttribute("firstNum")%>    </span>
<span><%=request.getAttribute("operator")%>    </span>
<span><%=request.getAttribute("secondNum")%>    </span>
<span>=    </span>
<span><%=request.getAttribute("operator2Number")%>    </span>
</body>
</html>
