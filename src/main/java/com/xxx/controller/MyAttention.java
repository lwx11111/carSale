package com.xxx.controller;

import com.xxx.dao.AttentionDao;
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

@WebServlet("/MyAttention")
public class MyAttention extends HttpServlet {
    private AttentionDao attentionDao=new AttentionDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("user");
        int uid=u.getUid();

        List<Car> list=attentionDao.selectMyAttention(uid);

        req.getSession().setAttribute("myAttentionList",list);
        req.getRequestDispatcher("MyAttention.jsp").forward(req,resp);
    }
}
