<%@ page import="com.xxx.entity.Car" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我要卖车</title>
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
        font-size:20px;
    }
</style>
<body>
<jsp:include page="Head.jsp"></jsp:include>
    <%--？JS：前端数据校验：合理范围 必需信息--%>
    <form action="AddNewCar" method="post" enctype="multipart/form-data" id="thisForm">
        <%--？下拉框怎么和后端数组数据交换--%>
       <p>
           品牌：<select name="brand">
                   <option value="奥迪">奥迪</option>
                   <option value="阿斯顿马丁">阿斯顿马丁</option>
                   <option value="阿尔法罗密欧">阿尔法罗密欧</option>
                   <option value="本田">本田</option>
                   <option value="宝马">宝马</option>
                   <option value="奔驰">奔驰</option>
                   <option value="别克">别克</option>
                   <option value="比亚迪">比亚迪</option>
                   <option value="林肯">林肯</option>
                   <option value="标志">标志</option>
                   <option value="观致">观致</option>
                   <option value="路虎">路虎</option>
                   <option value="大众">大众</option>
               </select>
       </p>
        <p>型号：<input id="model" name="model">
            <p id="msg" style="color: red"></p>
        </p>
        <p>价格：<input id="price" name="price">万
            <p id="msg0" style="color: red"></p>
        </p>
        <p>
            购买时间：<select name="time">
                        <option value="2000">2000</option>
                        <option value="2001">2001</option>
                        <option value="2002">2002</option>
                        <option value="2003">2003</option>
                        <option value="2004">2004</option>
                        <option value="2005">2005</option>
                        <option value="2006">2006</option>
                        <option value="2007">2007</option>
                        <option value="2008">2008</option>
                        <option value="2009">2009</option>
                        <option value="2010">2010</option>
                        <option value="2011">2011</option>
                        <option value="2012">2012</option>
                        <option value="2013">2013</option>
                        <option value="2014">2014</option>
                        <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                        <option value="2019">2019</option>
                        <option value="2020">2020</option>
                        <option value="2021">2021</option>
                    </select>年
        </p>
        <p>车辆图片：<input id="fileInput" type="file" name="pic">
            <p id="msgf" style="color: red">
        </p>
        <p>颜色：<select name="color">
                    <option value="红色">红色</option>
                    <option value="绿色">绿色</option>
                    <option value="黑色">黑色</option>
                    <option value="白色">白色</option>
                </select>
        </p>
        <p>车龄：<input id="age" name="age">年
            <p id="msg1" style="color: red"></p>
        </p>
        <p>
            车辆位置：<select name="location">
                        <option value="北京">北京</option>
                        <option value="上海">上海</option>
                        <option value="广州">广州</option>
                        <option value="淄博">淄博</option>
                    </select>
        </p>
        <p>
            历程：<input id="mile" name="mile">万公里
            <p id="msg2" style="color: red"></p>
        </p>
        <p><button id="btn" type="button">确定</button></p>
        <p style="color: red">${message.getResultMsg()}</p>
    </form>
</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
    function isEmpty(str){
        if(str==null||str.trim()==""){
            return true;
        }
        return false;
    }

    $("#btn").click(function (){
        var model=$("#model").val();
        var price=$("#price").val();
        var file= $("#fileInput").get(0).files[0];
        console.info(file);
        var age=$("#age").val();
        var mile=$("#mile").val();
        if(isEmpty(model)){
            $("#msg").html("车型不能为空");
            return ;
        }
        if(isEmpty(price)){
            $("#msg0").html("价格不能为空");
            return ;
        }
        if(!file){
            $("#msgf").html("图片不能为空");
            return ;
        }
        var num=parseFloat(price);
        var num1=parseFloat(age);
        var num2=parseFloat(mile);

       if(isNaN(num)){
            $("#msg0").html("请输入一个正确价格")
           return;
       }
       if(!isEmpty(age)){
           if(isNaN(num1)){
               $("#msg1").html("请输入一个正确车龄");
               return;
           }else{
               if(age!=(parseInt(age))){
                   $("#msg1").html("请输入一个整数车龄");
                   return;
               }
           }
       }
        if(!isEmpty(mile)){
            if(isNaN(num2)){
                $("#msg2").html("请输入一个正确历程");
                return;
            }
        }
        console.log("success");
        $("#thisForm").submit();

    })
</script>
</html>
