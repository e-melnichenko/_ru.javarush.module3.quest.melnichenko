<%@ page import="quest.com.Route" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<h2>new user</h2>
<form action="<%=Route.SIGN_UP%>" method="post">
    <p>
        <label>
            name
            <input type="text" name="name">
        </label>
    </p>
    <p>
        <label>
            password
            <input type="password" name="password">
        </label>
    </p>
    <button type="submit">register</button>
</form>

<h2>existing user</h2>
<form action="<%=Route.SIGN_IN%>" method="post">
    <p>
        <label>
            name
            <input type="text" name="name">
        </label>
    </p>
    <p>
        <label>
            password
            <input type="password" name="password">
        </label>
    </p>
    <button type="submit">sign in</button>
</form>
</body>
</html>
