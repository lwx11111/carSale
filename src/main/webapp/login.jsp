
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
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
</style>
<body>
<jsp:include page="Head.jsp"></jsp:include>
    <form action="login" method="post">
        <p>
            请输入用户名:<input name="uname"><br>
        </p>
        <p>
            请输入密码:<input name="upwd"><br>
        </p>
        <p style="color: red">${messageModel.getResultMsg()}</p>
        <p>
            <button type="submit">登录</button>
            <button type="button" id="register">注册</button>
        </p>


    </form>


    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        $("#register").click(function (){
            window.location.href="register.jsp";
        })
    </script>
</body>
</html>
