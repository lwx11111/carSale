package com.xxx.controller;

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

@WebServlet("/register")
@MultipartConfig
public class RegisterServlet extends HttpServlet {
    private UserService userService=new UserService();

    /**
     * 注册成功后根据用户类型跳转到不同界面
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String uname=req.getParameter("uname");
        String upwd=req.getParameter("upwd");

        String nickname=req.getParameter("nickname");
        String profile=req.getParameter("profile");

        String picPath=null;
        //获取part对象
        Part part=req.getPart("pic");
        //获取HTTP头信息headerInfo=（form-data; name="file" filename="文件名"）
        String headerInfo = part.getHeader("content-disposition");
        //从HTTP头信息中获取文件名fileName=（文件名）
        String fileName = headerInfo.substring(headerInfo.lastIndexOf("=") + 2, headerInfo.length() - 1);
        StringUtil stringUtil=new StringUtil();
        if(!stringUtil.isEmpty(fileName)){
            //./userpic/default.png
            //获得存储上传文件的文件夹路径
            String filePath = this.getServletContext().getRealPath("/userpic");
            //下载文件  存放在工程目录下out文件夹里
            part.write(filePath+"\\"+uname+fileName);
            picPath="./userpic/"+uname+fileName;
        }

        User u=new User(uname,upwd,nickname,profile,picPath);
        MessageModel messageModel=userService.UserRegister(u);

        System.out.println(messageModel.getResultMsg());

        if(messageModel.getResultCode()==1){
            req.getSession().setAttribute("user",u);
            resp.sendRedirect("index.jsp");

        }else{//失败
            //消息模型存到request中，跳转到login，jsp
            req.setAttribute("messageModel",messageModel);
            req.getRequestDispatcher("register.jsp").forward(req,resp);
        }

    }
}
