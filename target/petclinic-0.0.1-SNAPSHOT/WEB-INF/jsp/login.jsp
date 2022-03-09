<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <h1>PetClinic Login Page</h1>
    <form action="/login" method="post">
        Username:<input type="text" name="username"/>
        Password:<input type="password" name="password"/>
        Remember me:<input type="checkbox" name="remember-me"/><br/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="login"/>
        <span style="color:red">
            <c:if test="${not empty param.loginFailed}" >
                <c:out value="Login Failed, Incorrect Username or Password"></c:out>
            </c:if>
        </span>
    </form>
</body>
</html>