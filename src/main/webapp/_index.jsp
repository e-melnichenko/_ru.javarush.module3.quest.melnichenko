<%@ page import="service.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="/logout">Выйти</a>
<% User user = (User) request.getSession().getAttribute("user"); %>
user: <%= user.getName() %>

<form action="/game" method="post" name="name">
    question
    <label>
        <input type="radio" name="answer" value="id1"checked>
        answer1
    </label>
    <button type="submit">submit</button>
</form>
</body>
</html>