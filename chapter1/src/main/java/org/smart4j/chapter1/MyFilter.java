package org.smart4j.chapter1;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author tuoluolef
 * @date 2022/1/25 15:13
 */
@WebFilter("/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse rsp = (HttpServletResponse) response;
        int status = rsp.getStatus();
        if (status == 404) {
            System.out.println("404");
        }

        chain.doFilter(request, rsp);

        int status2 = rsp.getStatus();
        if (status2 == 404) {
            System.out.println("404");
//            rsp.setContentType("application/json;charset=UTF8");
            rsp.getWriter().write("我是404");
        }
    }

    @Override
    public void destroy() {

    }
}
