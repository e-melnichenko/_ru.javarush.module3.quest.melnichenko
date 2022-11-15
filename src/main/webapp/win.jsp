<%@ page import="quest.com.Route" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<div class="container">
    <div class="pt-3 pb-3">
        <h1><%=session.getAttribute("winText")%></h1>

        <a href="<%=Route.NEW_GAME%>" class="btn btn-primary">New game</a>
    </div>
</div>
</body>
</html>
