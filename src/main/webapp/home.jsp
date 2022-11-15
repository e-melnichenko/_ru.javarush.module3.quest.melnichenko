<%@ page import="quest.com.Route" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<div class="container">
    <div class="pt-3 pb-3">
        <h1 class="mb-5">Welcome to awesome quest!</h1>
        <a href="<%=Route.NEW_GAME%>" class="btn btn-primary">Play</a>
    </div>
</div>
</body>
</html>
