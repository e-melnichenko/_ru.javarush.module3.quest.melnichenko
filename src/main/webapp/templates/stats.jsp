<%@ page import="quest.com.service.user.User" %>

<% User user = (User) session.getAttribute("user");%>
<div class="container">
    <table class="table mt-5" style="width: 500px;">
        <tr>
            <td>user</td>
            <td><%=user.getName()%></td>
        </tr>
        <tr>
            <td>games count</td>
            <td><%=user.getGamesCount()%></td>
        </tr>
        <tr>
            <td>ip</td>
            <td><%=request.getRemoteAddr()%></td>
        </tr>
    </table>
</div>
