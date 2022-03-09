package com.xia.Filter;


import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain filterChain) throws IOException, ServletException {
        Request.setCharacterEncoding("utf-8");
        Response.setCharacterEncoding("utf-8");
        filterChain.doFilter(Request,Response);
    }

    @Override
    public void destroy() {

    }
}
