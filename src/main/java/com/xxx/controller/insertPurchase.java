package com.xxx.controller;

import com.xxx.entity.User;
import com.xxx.entity.vo.MessageModel;

import com.xxx.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insertPurchase")
public class insertPurchase extends HttpServlet {
    private CarService carService=new CarService();
    private MessageModel messageModel=new MessageModel();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("user");
        int uid= u.getUid();

        int cid=Integer.parseInt(req.getParameter("cid"));

        messageModel=carService.insertPurchase(uid,cid);
        req.setAttribute("messageModel1",messageModel);
        req.getRequestDispatcher("Post?cid="+cid).forward(req,resp);


    }
}
