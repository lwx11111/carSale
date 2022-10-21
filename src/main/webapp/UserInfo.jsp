<%@ page import="com.xxx.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<style>
    #table{
        border: darkorange solid 1px;
        display:flex;
        justify-content: center; /*水平居中*/
        align-items: Center; /*垂直居中*/

    }
    #table td{

        width: 400px;
        height: 200px;
        text-align: center;
    }
    #table form{
        width: 100%;
        height: 100%;
        justify-content: center; /*水平居中*/
        align-items: Center; /*垂直居中*/
        margin-top:25px;
        font-size: 25px;
    }

    #div2{

        display:flex;
        justify-content: center; /*水平居中*/
        align-items: Center; /*垂直居中*/
    }
    #div2 a{
        text-decoration: none;
        color: red;
    }



</style>
<body>
<jsp:include page="Head.jsp"></jsp:include>
<jsp:include page="Left.jsp"></jsp:include>
    <%
        User u=(User) session.getAttribute("user");%>
<%--    设计为点击之后，在界面生成输入框和富文本，上传图片--%>


    <div id="table">
        <table >

            <tr>
                <td>我的头像</td>
                <td><img  width="200px" height="100%" src="<%=u.getPicPath()%>"> </td>
                <td ><button id="btn1" >修改头像</button> </td>

            </tr>
            <tr id="upicForm" style="display: none;">
                <td colspan="3">
                    <form action="upLoadUserPic" enctype="multipart/form-data" method="post" >
                        选择你的头像文件：<input type="file" name="pic"><br>
                        <button type="submit">确定</button>
                    </form>
                </td>
            </tr>

            <tr>
                <td>我的昵称</td>
                <td><%=u.getNickname()%> </td>
                <td><button id="btn2">修改昵称</button> </td>
            </tr>
            <tr id="nicknameForm" style="display:none">
                <td colspan="3">
                    <form action="UpLoadUserInfo"  method="post" >
                       请输入个人昵称：<input type="text" name="nickname"><br>
                        <button type="submit">确定</button>
                    </form>
                </td>
            </tr>


            <tr>
                <td>个人简介</td>
                <td><%=u.getProfile()%> </td>
                <td><button id="btn3">修改个人简介</button> </td>
            </tr>
            <tr id="profileForm" style="display:none ">
                <td colspan="3">
                    <form action="UpLoadUserInfo"  method="post" >
                        请输入个人简介：<br>
                        <textarea name="profile"></textarea>
                        <button type="submit">确定</button>
                    </form>
                </td>
            </tr>
        </table>
    </div>

    <div id="div2">
        <button id="btn4" >修改密码</button>
        <a href="Quit">退出登录</a>
    </div>
    <div id="div2">
        <form id="upwdForm" action="UploadUserUpwd"  method="post" style="display: none">
            输入新密码:<input type="text" name="upwd"><br>
            <button type="submit">确定</button>
        </form>
    </div>


</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
    let status1=0;
    let status2=0;
    let status3=0;
    let status4=0;
    $("#btn1").click(function (){
        if(status1==0){
            $("#upicForm").show("fast");
            $("#btn1").text("取消");
            status1=1;
        }else{
            $("#upicForm").hide("fast");
            $("#btn1").text("修改头像");
            status1=0;
        }
    })

    $("#btn2").click(function (){
        if(status2==0){
            $("#nicknameForm").show("fast");
            $("#btn2").text("取消");
            status2=1;
        }else{
            $("#nicknameForm").hide("fast");
            $("#btn2").text("修改昵称");
            status2=0;
        }
    })

    $("#btn3").click(function (){
        if(status3==0){
            $("#profileForm").show("fast");
            $("#btn3").text("取消");
            status3=1;
        }else{
            $("#profileForm").hide("fast");
            $("#btn3").text("修改个人简介");
            status3=0;
        }
    })

    $("#btn4").click(function (){
        if(status4==0){
            $("#upwdForm").show("fast");
            $("#btn4").text("取消");
            status4=1;
        }else{
            $("#upwdForm").hide("fast");
            $("#btn4").text("修改密码");
            status4=0;
        }
    })


</script>
</html>
