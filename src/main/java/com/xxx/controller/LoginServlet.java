package com.xxx.controller;

import com.xxx.entity.User;
import com.xxx.entity.vo.MessageModel;
import com.xxx.service.UserService;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
    private UserService userService=new UserService();

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //接受请求
        String uname=req.getParameter("uname");
        String upwd=req.getParameter("upwd");

        //调用service层方法，返回消息模型
        MessageModel messageModel=userService.UserLogin(uname,upwd);

        //判断消息模型的状态码
        if(messageModel.getResultCode()==1){
            User u=userService.getUser();

            req.getSession().setAttribute("user",u);
            resp.sendRedirect("index.jsp");


        }else{//失败
            //消息模型存到request中，跳转到login，jsp
            req.setAttribute("messageModel",messageModel);
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

}
