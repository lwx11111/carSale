package com.xxx.controller;

import com.xxx.dao.UserDao;
import com.xxx.entity.User;
import com.xxx.service.UserService;
import com.xxx.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpLoadUserInfo")
public class UploadUserInfo extends HttpServlet {
    private UserService userService=new UserService();
    private UserDao userDao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nickname=req.getParameter("nickname");
        String profile=req.getParameter("profile");
        User u=(User) req.getSession().getAttribute("user");
        String uname=u.getUname();
        System.out.println(nickname+" "+uname);
        if(userService.uploadUserInfo(nickname,profile,uname)){

            StringUtil stringUtil=new StringUtil();
            if(!stringUtil.isEmpty(nickname)){
                u.setNickname(nickname);
            }
            if(!stringUtil.isEmpty(profile)){
                u.setProfile(profile);
            }
            req.getSession().setAttribute("user",u);
            resp.sendRedirect("UserInfo.jsp");
        }else{
            System.out.println("Database Wrong");
        }



    }
}
