<%@ page import="quest.com.controller.Route" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<div class="container">
    <div class="pt-3 pb-3">
        <h1>User not found</h1>
        <a href="<%=Route.AUTH%>" class="btn btn-primary">Registration</a>
    </div>
</div>
</body>
</html>
