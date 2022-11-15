<%@ page import="quest.com.controller.Route" %>
<%@ page import="quest.com.repository.StoryTable" %>
<%@ page import="quest.com.service.story.Story" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<div class="container">
    <div class="pt-3 pb-3">
        <h1 class="mb-5">Welcome to awesome quest! Please, choose a quest</h1>
        <% for (Story story : StoryTable.getInstance().getAll()) { %>
            <a href="<%=Route.NEW_GAME + "?storyId=" + story.getId()%>" class="btn btn-primary"><%=story.getName()%></a>
        <%}%>
    </div>
</div>

<jsp:include page="templates/stats.jsp"/>
</body>
</html>
