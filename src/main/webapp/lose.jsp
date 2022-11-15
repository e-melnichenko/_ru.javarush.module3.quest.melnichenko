<%@ page import="quest.com.controller.Route" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<div class="container">
    <div class="pt-3 pb-3">
        <h1>Defeat!</h1>
        <h2><%=session.getAttribute("loseText")%></h2>

        <a href="<%=Route.HOME%>" class="btn btn-primary">Try again</a>
    </div>
</div>

<jsp:include page="templates/stats.jsp"/>
</body>
</html>
