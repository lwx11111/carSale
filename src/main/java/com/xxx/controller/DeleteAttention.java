package com.xxx.controller;

import com.xxx.entity.Car;
import com.xxx.entity.vo.MessageModel;
import com.xxx.service.AttentionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/DelectAttention")
public class DeleteAttention extends HttpServlet {
    private AttentionService attentionService=new AttentionService();
    private MessageModel messageModel=new MessageModel();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cid=Integer.parseInt(req.getParameter("cid"));

        System.out.println(req.getSession().getAttribute("myAttentionList"));
        List<Car> list=(List<Car>) req.getSession().getAttribute("myAttentionList");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getCid()==cid){
                list.remove(i);
                break;
            }
        }
        messageModel= attentionService.deleteAttention(cid);
        if(messageModel.getResultCode()==0){
            System.out.println(messageModel.getResultMsg());
        }else{
            System.out.println(messageModel.getResultMsg());
            req.getSession().setAttribute("myAttentionList",list);
            resp.sendRedirect("MyAttention.jsp");
        }
    }
}
