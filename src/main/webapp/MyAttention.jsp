<%@ page import="java.util.ArrayList" %>
<%@ page import="com.xxx.entity.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>我的关注</title>
</head>
<style>
    #post{
        border: black 1px solid;
        width: 25%;
        display:inline-block;
    }
    a{
        font-size: 25px;
    }
</style>
<body>
<jsp:include page="Head.jsp"></jsp:include>
<jsp:include page="Left.jsp"></jsp:include>
<%
    ArrayList list = (ArrayList) request.getAttribute("myAttentionList");
%>
<c:forEach items="${myAttentionList}" var="data">
    <div id="post" onclick="fun(${data.cid})" >
        <table>
            <tr>
                <td rowspan="4"><img width="200" height="200" src=${data.getPic()}></td>
                <td style="font-size: 30px;color: black">${data.getBrand()}</td>
            </tr>
            <tr>
                <td>${data.getModel()}</td>
            </tr>
            <tr>
                <td>购买年份：${data.getTime()}年</td>
            </tr>
            <tr>
                <td style="font-size: 25px;color: red">预估价格：${data.getPrice()}万</td>
            </tr>
        </table>
        <a href="DelectAttention?cid=${data.cid}">删除关注</a>
    </div>
</c:forEach>

</body>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">

    // window.onload=fun;
    function fun(cid){

        $.ajax({
            url:"Post",
            type:"post",
            data:{
                cid:cid
            },
            success:function (data) {
                console.log(data);
                window.location.href = "Post.jsp";
            }
        })
    }




</script>
</html>
