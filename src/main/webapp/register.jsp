<%@ page import="com.xxx.entity.Car" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<style>
    form{
        text-align: center;
        margin-top: 5%;
    }
    p{
        font-size: 20px;
    }
    button{
        font-size: 20px;
    }
    a{
        text-decoration: none;
        color: black;
        font-size: 20px;
    }
</style>
<body>
<jsp:include page="Head.jsp"></jsp:include>
    <form action="register"  enctype="multipart/form-data" method="post">
        <p style="color: red">前俩项必须输入，后面三项可以不输入 </p>
        <p>请输入用户名:<input name="uname"></p>
        <p>请输入密码:<input name="upwd"></p>
        <p>请上传一张头像:<input type="file" name="pic"></p>
        <p>请输入昵称:<input name="nickname"></p>
        <p>请输入个人简介:<input type="text" name="profile"></p>
        <p style="color: red">${messageModel.getResultMsg()}</p>
        <p>
            <button type="submit">注册</button>
            <a href="login.jsp">返回</a>
        </p>


    </form>

</body>
</html>
