package com.xxx.controller;

import com.xxx.dao.UserDao;
import com.xxx.entity.User;
import com.xxx.entity.vo.MessageModel;
import com.xxx.service.UserService;
import com.xxx.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet("/upLoadUserPic")
@MultipartConfig
public class UploadUserPic extends HttpServlet {
    private UserService userService=new UserService();
    private UserDao userDao=new UserDao();
    /**
     * 1.更新头像
     * 2.更新Session中的User
     * 3.发送到jsp
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u=(User) req.getSession().getAttribute("user");
        System.out.println(u.getUname());
        String uname=u.getUname();

        String picPath=null;
        Part part=req.getPart("pic");
        String headerInfo = part.getHeader("content-disposition");
        String fileName = headerInfo.substring(headerInfo.lastIndexOf("=") + 2, headerInfo.length() - 1);
        StringUtil stringUtil=new StringUtil();
        if(!stringUtil.isEmpty(fileName)){
            String filePath = this.getServletContext().getRealPath("/userpic");
            part.write(filePath+"\\"+uname+fileName);
            picPath="./userpic/"+uname+fileName;
        }

        MessageModel messageModel=userService.uploadUserPic(picPath,uname);
        if(messageModel.getResultCode()==1){
            u.setPicPath(picPath);
            req.getSession().setAttribute("user",u);
            resp.sendRedirect("UserInfo.jsp");
        }else{
            System.out.println(messageModel.getResultMsg());
        }
    }
}
