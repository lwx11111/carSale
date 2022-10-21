package com.xxx.controller;

import com.xxx.entity.Car;
import com.xxx.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Post")
public class Post extends HttpServlet {
    private CarService carService=new CarService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int cid=Integer.parseInt(req.getParameter("cid"));

        Car c=carService.selectCar(cid);

        req.getSession().setAttribute("car",c);

        //用了AJAX无法在后台跳转
        //req.getRequestDispatcher("Post.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cid=Integer.parseInt(req.getParameter("cid"));
        System.out.println("doget");
        Car c=carService.selectCar(cid);

        req.getSession().setAttribute("car",c);
        req.getRequestDispatcher("Post.jsp").forward(req,resp);
    }
}
