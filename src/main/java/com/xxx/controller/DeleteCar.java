package com.xxx.controller;

import com.xxx.entity.vo.MessageModel;
import com.xxx.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeletePost")
public class DeleteCar extends HttpServlet {
    private CarService carService=new CarService();
    private MessageModel messageModel=new MessageModel();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cid=Integer.parseInt(req.getParameter("cid"));
        System.out.println(cid);

        messageModel= carService.deleteCar(cid);
        if(messageModel.getResultCode()==0){
            System.out.println(messageModel.getResultMsg());
        }else{
            System.out.println(messageModel.getResultMsg());
            resp.sendRedirect("MyPost.jsp");
        }

    }
}
