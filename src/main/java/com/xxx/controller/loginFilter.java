package com.xxx.controller;

import com.xxx.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class loginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse resp=(HttpServletResponse) servletResponse;

        String url=req.getRequestURI();
      //  System.out.println(url);
        //放行界面
        if(url.equals("/pro/")||url.contains("/login.jsp")||url.contains("/register.jsp")||url.contains("/index.jsp")
            ||url.contains("/BuyCarIndex.jsp")||url.contains("/AddNewCar.jsp")){

            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        if(url.contains("/login")||url.contains("/register")||url.contains("/SelectAllCar")){

            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        if(url.contains("/js")||url.contains("/userpic")||url.contains("/carpic")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        //已经登录
        User u=(User) req.getSession().getAttribute("user");
        if(u!=null){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        resp.sendRedirect("login.jsp");
    }

    @Override
    public void destroy() {

    }
}
