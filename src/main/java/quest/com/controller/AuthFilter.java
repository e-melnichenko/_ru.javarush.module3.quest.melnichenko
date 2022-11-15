package quest.com.controller;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.util.Objects.isNull;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String path = httpRequest.getRequestURI();

        if(path.startsWith(Route.AUTH)) {
            chain.doFilter(request, response);
            return;
        }

        if(!isAuthorized(httpRequest)) {
            httpResponse.sendRedirect(Route.AUTH);
            return;
        }

        chain.doFilter(request, response);
    }

    private Boolean isAuthorized(HttpServletRequest request) {
        HttpSession session = request.getSession();

        return !isNull(session.getAttribute("user"));
    }
}
