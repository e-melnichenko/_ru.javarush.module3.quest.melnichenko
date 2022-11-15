<%@ page import="quest.com.controller.Route" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<div class="container">
    <div class="pt-3 pb-3">
        <h1>Win!</h1>
        <h2><%=session.getAttribute("winText")%></h2>

        <a href="<%=Route.HOME%>" class="btn btn-primary">New game</a>
    </div>
</div>

<jsp:include page="templates/stats.jsp"/>
</body>
</html>
