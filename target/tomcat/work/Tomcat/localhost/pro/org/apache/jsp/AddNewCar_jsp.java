/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-27 13:12:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xxx.entity.Car;

public final class AddNewCar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>我要卖车</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    form{\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin-top: 5%;\r\n");
      out.write("    }\r\n");
      out.write("    p{\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    button{\r\n");
      out.write("        font-size:20px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <form action=\"AddNewCar\" method=\"post\" enctype=\"multipart/form-data\" id=\"thisForm\">\r\n");
      out.write("        ");
      out.write("\r\n");
<<<<<<< HEAD
      out.write("       <p>\r\n");
      out.write("           品牌：<select name=\"brand\">\r\n");
      out.write("                   <option value=\"奥迪\">奥迪</option>\r\n");
      out.write("                   <option value=\"阿斯顿马丁\">阿斯顿马丁</option>\r\n");
      out.write("                   <option value=\"阿尔法罗密欧\">阿尔法罗密欧</option>\r\n");
      out.write("                   <option value=\"本田\">本田</option>\r\n");
      out.write("                   <option value=\"宝马\">宝马</option>\r\n");
      out.write("                   <option value=\"奔驰\">奔驰</option>\r\n");
      out.write("                   <option value=\"别克\">别克</option>\r\n");
      out.write("                   <option value=\"比亚迪\">比亚迪</option>\r\n");
      out.write("                   <option value=\"林肯\">林肯</option>\r\n");
      out.write("                   <option value=\"标志\">标志</option>\r\n");
      out.write("                   <option value=\"观致\">观致</option>\r\n");
      out.write("                   <option value=\"路虎\">路虎</option>\r\n");
      out.write("                   <option value=\"大众\">大众</option>\r\n");
      out.write("               </select>\r\n");
      out.write("       </p>\r\n");
      out.write("        <p>型号：<input id=\"model\" name=\"model\">\r\n");
      out.write("            <p id=\"msg\" style=\"color: red\"></p>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>价格：<input id=\"price\" name=\"price\">万\r\n");
      out.write("            <p id=\"msg0\" style=\"color: red\"></p>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            购买时间：<select name=\"time\">\r\n");
      out.write("                        <option value=\"2000\">2000</option>\r\n");
      out.write("                        <option value=\"2001\">2001</option>\r\n");
      out.write("                        <option value=\"2002\">2002</option>\r\n");
      out.write("                        <option value=\"2003\">2003</option>\r\n");
      out.write("                        <option value=\"2004\">2004</option>\r\n");
      out.write("                        <option value=\"2005\">2005</option>\r\n");
      out.write("                        <option value=\"2006\">2006</option>\r\n");
      out.write("                        <option value=\"2007\">2007</option>\r\n");
      out.write("                        <option value=\"2008\">2008</option>\r\n");
      out.write("                        <option value=\"2009\">2009</option>\r\n");
      out.write("                        <option value=\"2010\">2010</option>\r\n");
      out.write("                        <option value=\"2011\">2011</option>\r\n");
      out.write("                        <option value=\"2012\">2012</option>\r\n");
      out.write("                        <option value=\"2013\">2013</option>\r\n");
      out.write("                        <option value=\"2014\">2014</option>\r\n");
      out.write("                        <option value=\"2015\">2015</option>\r\n");
      out.write("                        <option value=\"2016\">2016</option>\r\n");
      out.write("                        <option value=\"2017\">2017</option>\r\n");
      out.write("                        <option value=\"2018\">2018</option>\r\n");
      out.write("                        <option value=\"2019\">2019</option>\r\n");
      out.write("                        <option value=\"2020\">2020</option>\r\n");
      out.write("                        <option value=\"2021\">2021</option>\r\n");
      out.write("                    </select>年\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>车辆图片：<input id=\"fileInput\" type=\"file\" name=\"pic\">\r\n");
      out.write("            <p id=\"msgf\" style=\"color: red\">\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>颜色：<select name=\"color\">\r\n");
      out.write("                    <option value=\"红色\">红色</option>\r\n");
      out.write("                    <option value=\"绿色\">绿色</option>\r\n");
      out.write("                    <option value=\"黑色\">黑色</option>\r\n");
      out.write("                    <option value=\"白色\">白色</option>\r\n");
      out.write("                </select>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>车龄：<input id=\"age\" name=\"age\">年\r\n");
      out.write("            <p id=\"msg1\" style=\"color: red\"></p>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            车辆位置：<select name=\"location\">\r\n");
      out.write("                        <option value=\"北京\">北京</option>\r\n");
      out.write("                        <option value=\"上海\">上海</option>\r\n");
      out.write("                        <option value=\"广州\">广州</option>\r\n");
      out.write("                        <option value=\"淄博\">淄博</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            历程：<input id=\"mile\" name=\"mile\">万公里\r\n");
      out.write("            <p id=\"msg2\" style=\"color: red\"></p>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p><button id=\"btn\" type=\"button\">确定</button></p>\r\n");
      out.write("        <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.getResultMsg()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
=======
      out.write("        品牌：<select name=\"brand\">\r\n");
      out.write("                <option value=\"奥迪\">奥迪</option>\r\n");
      out.write("                <option value=\"阿斯顿马丁\">阿斯顿马丁</option>\r\n");
      out.write("                <option value=\"阿尔法罗密欧\">阿尔法罗密欧</option>\r\n");
      out.write("                <option value=\"本田\">本田</option>\r\n");
      out.write("                <option value=\"宝马\">宝马</option>\r\n");
      out.write("                <option value=\"奔驰\">奔驰</option>\r\n");
      out.write("                <option value=\"别克\">别克</option>\r\n");
      out.write("                <option value=\"比亚迪\">比亚迪</option>\r\n");
      out.write("                <option value=\"丰田\">丰田</option>\r\n");
      out.write("                <option value=\"劳斯莱斯\">劳斯莱斯</option>\r\n");
      out.write("                <option value=\"兰博基尼\">兰博基尼</option>\r\n");
      out.write("                <option value=\"福特\">福特</option>\r\n");
      out.write("                <option value=\"大众\">大众</option>\r\n");
      out.write("\r\n");
      out.write("            </select><br>\r\n");
      out.write("        型号：<input name=\"model\"><br>\r\n");
      out.write("        价格：<input name=\"price\"><br>\r\n");
      out.write("        购买时间：<select name=\"time\">\r\n");
      out.write("                    <option value=\"2000\">2000</option>\r\n");
      out.write("                    <option value=\"2001\">2001</option>\r\n");
      out.write("                    <option value=\"2002\">2002</option>\r\n");
      out.write("                    <option value=\"2003\">2003</option>\r\n");
      out.write("                    <option value=\"2004\">2004</option>\r\n");
      out.write("                    <option value=\"2005\">2005</option>\r\n");
      out.write("                    <option value=\"2006\">2006</option>\r\n");
      out.write("                    <option value=\"2007\">2007</option>\r\n");
      out.write("                </select><br>\r\n");
      out.write("        车辆图片：<input type=\"file\" name=\"pic\"><br>\r\n");
      out.write("\r\n");
      out.write("        颜色：<select name=\"color\">\r\n");
      out.write("                <option value=\"红色\">红色</option>\r\n");
      out.write("                <option value=\"绿色\">绿色</option>\r\n");
      out.write("                <option value=\"黑色\">黑色</option>\r\n");
      out.write("                <option value=\"白色\">白色</option>\r\n");
      out.write("                <option value=\"蓝色\">蓝色</option>\r\n");
      out.write("                <option value=\"黄色\">黄色</option>\r\n");
      out.write("                <option value=\"橙色\">橙色</option>\r\n");
      out.write("                <option value=\"紫色\">紫色</option>\r\n");
      out.write("                <option value=\"渐变色\">渐变色</option>\r\n");
      out.write("            </select><br>\r\n");
      out.write("        车龄：<input name=\"age\"><br>\r\n");
      out.write("        车辆位置：<select name=\"location\">\r\n");
      out.write("                    <option value=\"北京\">北京</option>\r\n");
      out.write("                    <option value=\"上海\">上海</option>\r\n");
      out.write("                    <option value=\"广州\">广州</option>\r\n");
      out.write("                    <option value=\"淄博\">淄博</option>\r\n");
      out.write("                    <option value=\"福州\">福州</option>\r\n");
      out.write("                    <option value=\"厦门\">厦门</option>\r\n");
      out.write("                    <option value=\"成都\">成都</option>\r\n");
      out.write("                    <option value=\"海口\">海口</option>\r\n");
      out.write("                    <option value=\"乌鲁木齐\">乌鲁木齐</option>\r\n");
      out.write("                    <option value=\"深圳\">深圳</option>\r\n");
      out.write("                    <option value=\"广州\">广州</option>\r\n");
      out.write("                </select><br>\r\n");
      out.write("        历程：<input name=\"mile\"><br>\r\n");
      out.write("        <button type=\"submit\">submit</button>\r\n");
>>>>>>> a6d474c86ca72d4560bf8cd63611f611a68bd41b
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function isEmpty(str){\r\n");
      out.write("        if(str==null||str.trim()==\"\"){\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(\"#btn\").click(function (){\r\n");
      out.write("        var model=$(\"#model\").val();\r\n");
      out.write("        var price=$(\"#price\").val();\r\n");
      out.write("        var file= $(\"#fileInput\").get(0).files[0];\r\n");
      out.write("        console.info(file);\r\n");
      out.write("        var age=$(\"#age\").val();\r\n");
      out.write("        var mile=$(\"#mile\").val();\r\n");
      out.write("        if(isEmpty(model)){\r\n");
      out.write("            $(\"#msg\").html(\"车型不能为空\");\r\n");
      out.write("            return ;\r\n");
      out.write("        }\r\n");
      out.write("        if(isEmpty(price)){\r\n");
      out.write("            $(\"#msg0\").html(\"价格不能为空\");\r\n");
      out.write("            return ;\r\n");
      out.write("        }\r\n");
      out.write("        if(!file){\r\n");
      out.write("            $(\"#msgf\").html(\"图片不能为空\");\r\n");
      out.write("            return ;\r\n");
      out.write("        }\r\n");
      out.write("        var num=parseFloat(price);\r\n");
      out.write("        var num1=parseFloat(age);\r\n");
      out.write("        var num2=parseFloat(mile);\r\n");
      out.write("\r\n");
      out.write("       if(isNaN(num)){\r\n");
      out.write("            $(\"#msg0\").html(\"请输入一个正确价格\")\r\n");
      out.write("           return;\r\n");
      out.write("       }\r\n");
      out.write("       if(!isEmpty(age)){\r\n");
      out.write("           if(isNaN(num1)){\r\n");
      out.write("               $(\"#msg1\").html(\"请输入一个正确车龄\");\r\n");
      out.write("               return;\r\n");
      out.write("           }else{\r\n");
      out.write("               if(age!=(parseInt(age))){\r\n");
      out.write("                   $(\"#msg1\").html(\"请输入一个整数车龄\");\r\n");
      out.write("                   return;\r\n");
      out.write("               }\r\n");
      out.write("           }\r\n");
      out.write("       }\r\n");
      out.write("        if(!isEmpty(mile)){\r\n");
      out.write("            if(isNaN(num2)){\r\n");
      out.write("                $(\"#msg2\").html(\"请输入一个正确历程\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        console.log(\"success\");\r\n");
      out.write("        $(\"#thisForm\").submit();\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
