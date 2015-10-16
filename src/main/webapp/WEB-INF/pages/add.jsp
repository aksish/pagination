<%--
  Created by IntelliJ IDEA.
  User: tektak
  Date: 8/3/15
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Add person</h1>
<form:form method="post" action="persistPerson" modelAttribute="person">
  <form:hidden path="id"></form:hidden>
  <form:label path="name">Name: </form:label>
  <form:input path="name" ></form:input>
  <br>
  <form:label path="email">Email: </form:label>
  <form:input path="email"></form:input>
  <br>
  <form:label path="age">Age: </form:label>
  <form:input path="age"></form:input>
  <br>
  <form:label path="gender">Gender: </form:label>
  <form:input path="gender"></form:input>
  <br>
  <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
