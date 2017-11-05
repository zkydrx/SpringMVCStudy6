<%--
  Created by IntelliJ IDEA.
  User: Abbot
  Date: 2017-11-02
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Employee Form</title>
    <style type="text/css">@import url("<c:url value="/css/SpringMVCStudy6.css"/>");</style>
</head>
<body>
<div id="global">
    <form:form commandName="employee" action="employee_save" method="post">
        <fieldset>
            <legend>Add an employee</legend>
            <p>
                <label for="firstName">First Name:</label>
                <form:input path="firstName" tabindex="1"/>
            </p>

            <p>
                <label for="lastName">Last Name:</label>
                <form:input path="lastName" tabindex="2"/>
            </p>

            <p>
                <form:errors path="birthDate" cssClass="error"/>
            </p>

            <p>
                <label for="birthDate">Date of Birth:</label>
                <form:input path="birthDate" tabindex="3"/>
            </p>

            <p id="buttons">
                <input type="reset" id="reset" tabindex="4">
                <input type="submit" id="submit" tabindex="5" value="Add a Employee">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
