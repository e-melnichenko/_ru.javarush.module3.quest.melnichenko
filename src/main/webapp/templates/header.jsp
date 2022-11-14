<%@ page import="quest.com.Route" %>

<header>
<% if(!request.getRequestURI().startsWith(Route.AUTH)) {%>
  <p><a href="<%=Route.LOGOUT%>">logout</a></p>
<% } %>
</header>

