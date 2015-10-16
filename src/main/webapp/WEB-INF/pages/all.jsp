<%--
  Created by IntelliJ IDEA.
  User: tektak
  Date: 8/3/15
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>All Persons</title>
    <h1>All Persons</h1><br>
<c:forEach items="${persons}" var="person">
    ID: ${person.id}<br>
    Name: ${person.name}<br>
    Age: ${person.age}<br>
    Email: ${person.email}<br>
    Gender: ${person.gender}<br>
    -------------------------------------------------------------------------------
    <br>
</c:forEach>

</head>
<body>

</body>
</html>
