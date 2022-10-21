<%@ page import="com.xxx.entity.Car" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>帖子</title>
</head>
<style>


    a{
        text-decoration: none;
        color: black;
        font-size: 20px;
    }
</style>
<body>
<jsp:include page="Head.jsp"></jsp:include>
    <%
        Car c=(Car) request.getSession().getAttribute("car");
        System.out.println("post");
    %>
    <div id="post">
        <table>
            <tr>
                <td rowspan="4"><img width="200" height="200" src=<%=c.getPic()%>></td>
                <td style="font-size: 30px;color: black"><%=c.getBrand()%></td>
            </tr>
            <tr>
                <td><%=c.getModel()%></td>
            </tr>
            <tr>
                <td>购买年份：<%=c.getTime()%>年</td>
            </tr>
            <tr>
                <td style="font-size: 25px;color: red">预估价格：<%=c.getPrice()%>万</td>
            </tr>
        </table>
    </div>

    <div id="postMore">
        <table>
            <tr>
                <td>颜色：<%=c.getColor()%></td>
            <tr>
                <td>车龄：<%=c.getAge()%>年</td>
            </tr>
            <tr>
                <td>车辆位置：<%=c.getLocation()%></td>
            </tr>
            <tr>
                <td>里程数：<%=c.getMile()%>万公里</td>
            </tr>
            </tr>
        </table>
    </div>

    <a href="insertAttention?cid=<%=c.getCid()%>">关注</a><br>
    <p style="color: red">${messageModel0.getResultMsg()}</p>
    <a href="insertPurchase?cid=<%=c.getCid()%>">购买</a>
    <p style="color: red">${messageModel1.getResultMsg()}</p>



</body>
</html>
