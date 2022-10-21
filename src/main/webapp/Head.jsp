<%@ page import="com.xxx.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<style>
    #header{
        width: 100%;
        height: 5%;
        background-color: aquamarine;
        text-align: right;
        font-size: 25px;
        text-decoration: none;
    }
    #header a{
        text-decoration: none;
        color: black;
    }
</style>
<body>
<title>首页</title>
<%
    User u=(User) request.getSession().getAttribute("user");
%>
    <div id="header">
        <a href="index.jsp">首页</a>
        <a href="SelectAllCar">我要买车</a>
        <a href="AddNewCar.jsp">我要卖车</a>

<%--        <c:if test="${u!=null}">--%>
<%--            欢迎你,<%=u.getNickname()%>--%>
<%--            <a href="UserInfo.jsp">个人信息</a>--%>
<%--        </c:if>--%>

<%--        <c:if test="${u==null}">--%>
<%--            <a href="login.jsp">登录</a>--%>
<%--        </c:if>--%>

            <% if(u==null){ %>
                <a href="login.jsp">登录</a>
            <% }else{ %>
                <a href="UserInfo.jsp">个人信息</a>
                (欢迎你,<%=u.getNickname()%>)

            <% } %>
    </div>
</body>
</html>
