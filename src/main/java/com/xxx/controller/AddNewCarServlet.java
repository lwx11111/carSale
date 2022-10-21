package com.xxx.controller;

import com.xxx.entity.Car;
import com.xxx.entity.Post;
import com.xxx.entity.User;
import com.xxx.entity.vo.MessageModel;
import com.xxx.service.CarService;
import com.xxx.service.PostService;
import com.xxx.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet("/AddNewCar")
@MultipartConfig
public class AddNewCarServlet extends HttpServlet {
    private Car c;
    private CarService carService=new CarService();
    private PostService postService=new PostService();
    private MessageModel messageModel=new MessageModel();
    private StringUtil stringUtil=new StringUtil();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//解决乱码
        String brand=req.getParameter("brand");
        String model=req.getParameter("model");
        float price=Float.parseFloat(req.getParameter("price"));
        int time=Integer.parseInt(req.getParameter("time"));
        String color=req.getParameter("color");

        int age=0;
        if(!stringUtil.isEmpty(req.getParameter("age"))){
            age=Integer.parseInt(req.getParameter("age"));
        }

        String location=req.getParameter("location");
        float mile=0;
        if(!stringUtil.isEmpty(req.getParameter("mile"))){
            mile=Float.parseFloat(req.getParameter("mile"));
        }
        String picPath=null;
        //获取part对象
        Part part=req.getPart("pic");
        //获取HTTP头信息headerInfo=（form-data; name="file" filename="文件名"）
        String headerInfo = part.getHeader("content-disposition");
        //从HTTP头信息中获取文件名fileName=（文件名）
        String fileName = headerInfo.substring(headerInfo.lastIndexOf("=") + 2, headerInfo.length() - 1);

        if(!stringUtil.isEmpty(fileName)){
            //./userpic/default.png
            //获得存储上传文件的文件夹路径
            String filePath = this.getServletContext().getRealPath("/carpic");
            //下载文件  存放在工程目录下out文件夹里
            part.write(filePath+"\\"+fileName);
            picPath="./carpic/"+fileName;
        }

        c=new Car(brand,model,price,time,picPath);
        if(!stringUtil.isEmpty(color)){
            c.setColor(color);
        }
        if(!stringUtil.isEmpty(location)){
            c.setLocation(location);
        }
        if(age!=0){
            c.setAge(age);
        }
        if(mile!=0){
            c.setMile(mile);
        }
        messageModel=carService.AddNewCar(c);
        if(messageModel.getResultCode()==0){
            req.setAttribute("message",messageModel);

        }else{
            int cid=c.getCid();
            User u=(User) req.getSession().getAttribute("user");
            int uid=u.getUid();
            Post p=new Post(uid,cid);
            messageModel=postService.addNewPost(p);
            req.setAttribute("message",messageModel);
        }
        System.out.println(messageModel.getResultMsg());
        req.getRequestDispatcher("AddNewCar.jsp").forward(req,resp);






    }
}
