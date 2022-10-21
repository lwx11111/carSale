package com.xxx.controller;

import com.xxx.entity.Car;
import com.xxx.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectAllCar")
public class SelectCarServlet extends HttpServlet {
    private CarService carService=new CarService();
    /**
     * 从数据库拿到数据放入list
     * 再转入到view
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Car> list=carService.SelectAllCar();
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            Car c=(Car) list.get(i);

        }
       // resp.getWriter().write(list);
        req.setAttribute("list",list);
        req.getRequestDispatcher("BuyCarIndex.jsp").forward(req,resp);

    }
}
