package com.xxx.controller;

import com.xxx.dao.UserDao;
import com.xxx.entity.User;
import com.xxx.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UploadUserUpwd")
public class UploadUserUpwd extends HttpServlet {
    private UserService userService=new UserService();
    private UserDao userDao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("user");

        String uname=u.getUname();
        String upwd=req.getParameter("upwd");

        if(userService.uploadUserUpwd(upwd,uname)){
            u.setUpwd(upwd);
            req.getSession().setAttribute("user",u);
            resp.sendRedirect("UserInfo.jsp");
        }else{
            System.out.println("wrong");
        }


    }
}
