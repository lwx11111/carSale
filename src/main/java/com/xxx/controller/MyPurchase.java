package com.xxx.controller;

import com.xxx.entity.Car;
import com.xxx.entity.User;
import com.xxx.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/MyPurchase")
public class MyPurchase extends HttpServlet {
    private CarService carService=new CarService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("user");
        int uid=u.getUid();

        List<Car> list=carService.selectMyPurchase(uid);
        req.setAttribute("myPurchaseList",list);
        req.getRequestDispatcher("MyPurchase.jsp").forward(req,resp);
    }
}
