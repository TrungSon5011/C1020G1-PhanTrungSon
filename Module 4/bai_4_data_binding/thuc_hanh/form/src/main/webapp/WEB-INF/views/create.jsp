<%--
  Created by IntelliJ IDEA.
  User: phantrungson
  Date: 23/02/2021
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">Employee ID: </form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Employee's name: </form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber" >Contact's number: </form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>