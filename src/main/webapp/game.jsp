<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="quest.com.service.user.User" %>
<%@ page import="quest.com.service.game.Game" %>
<%@ page import="quest.com.service.question.Question" %>
<%@ page import="quest.com.service.answer.Answer" %>
<%@ page import="java.util.List" %>
<%@ page import="quest.com.Route" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% Game game = (Game) session.getAttribute("game"); %>
<% Question question = game.getCurrentQuestion(); %>
<% List<Answer> answerList = question.getAnswerList(); %>

<!DOCTYPE html>
<html>
<jsp:include page="templates/head.jsp"/>
<body>
<jsp:include page="templates/header.jsp"/>

<form action="<%=Route.GAME_ANSWER%>" method="post" name="name">
    <%= question.getText() %>

    <% for (Answer answer : answerList) { %>
    <label>
        <input type="radio" name="answerId" value="<%= answer.getId()%>"checked>
        <%=answer.getText()%>
    </label>
    <% } %>
    <button type="submit">submit</button>
</form>
</body>
</html>