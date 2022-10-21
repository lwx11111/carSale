/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-27 10:44:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xxx.entity.User;

public final class UserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>个人信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    #table{\r\n");
      out.write("        border: darkorange solid 1px;\r\n");
      out.write("        display:flex;\r\n");
      out.write("        justify-content: center; /*水平居中*/\r\n");
      out.write("        align-items: Center; /*垂直居中*/\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    #table td{\r\n");
      out.write("\r\n");
      out.write("        width: 400px;\r\n");
      out.write("        height: 200px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    #table form{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        justify-content: center; /*水平居中*/\r\n");
      out.write("        align-items: Center; /*垂直居中*/\r\n");
      out.write("        margin-top:25px;\r\n");
      out.write("        font-size: 25px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #div2{\r\n");
      out.write("\r\n");
      out.write("        display:flex;\r\n");
      out.write("        justify-content: center; /*水平居中*/\r\n");
      out.write("        align-items: Center; /*垂直居中*/\r\n");
      out.write("    }\r\n");
      out.write("    #div2 a{\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: red;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Left.jsp", out, false);
      out.write("\r\n");
      out.write("    ");

        User u=(User) session.getAttribute("user");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"table\">\r\n");
      out.write("        <table >\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>我的头像</td>\r\n");
      out.write("                <td><img  width=\"200px\" height=\"100%\" src=\"");
      out.print(u.getPicPath());
      out.write("\"> </td>\r\n");
      out.write("                <td ><button id=\"btn1\" >修改头像</button> </td>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"upicForm\" style=\"display: none;\">\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                    <form action=\"upLoadUserPic\" enctype=\"multipart/form-data\" method=\"post\" >\r\n");
      out.write("                        选择你的头像文件：<input type=\"file\" name=\"pic\"><br>\r\n");
      out.write("                        <button type=\"submit\">确定</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>我的昵称</td>\r\n");
      out.write("                <td>");
      out.print(u.getNickname());
      out.write(" </td>\r\n");
      out.write("                <td><button id=\"btn2\">修改昵称</button> </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"nicknameForm\" style=\"display:none\">\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                    <form action=\"UpLoadUserInfo\"  method=\"post\" >\r\n");
      out.write("                       请输入个人昵称：<input type=\"text\" name=\"nickname\"><br>\r\n");
      out.write("                        <button type=\"submit\">确定</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>个人简介</td>\r\n");
      out.write("                <td>");
      out.print(u.getProfile());
      out.write(" </td>\r\n");
      out.write("                <td><button id=\"btn3\">修改个人简介</button> </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"profileForm\" style=\"display:none \">\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                    <form action=\"UpLoadUserInfo\"  method=\"post\" >\r\n");
      out.write("                        请输入个人简介：<br>\r\n");
      out.write("                        <textarea name=\"profile\"></textarea>\r\n");
      out.write("                        <button type=\"submit\">确定</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"div2\">\r\n");
      out.write("        <button id=\"btn4\" >修改密码</button>\r\n");
      out.write("        <a href=\"Quit\">退出登录</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"div2\">\r\n");
      out.write("        <form id=\"upwdForm\" action=\"UploadUserUpwd\"  method=\"post\" style=\"display: none\">\r\n");
      out.write("            输入新密码:<input type=\"text\" name=\"upwd\"><br>\r\n");
      out.write("            <button type=\"submit\">确定</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    let status1=0;\r\n");
      out.write("    let status2=0;\r\n");
      out.write("    let status3=0;\r\n");
      out.write("    let status4=0;\r\n");
      out.write("    $(\"#btn1\").click(function (){\r\n");
      out.write("        if(status1==0){\r\n");
      out.write("            $(\"#upicForm\").show(\"fast\");\r\n");
      out.write("            $(\"#btn1\").text(\"取消\");\r\n");
      out.write("            status1=1;\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#upicForm\").hide(\"fast\");\r\n");
      out.write("            $(\"#btn1\").text(\"修改头像\");\r\n");
      out.write("            status1=0;\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    $(\"#btn2\").click(function (){\r\n");
      out.write("        if(status2==0){\r\n");
      out.write("            $(\"#nicknameForm\").show(\"fast\");\r\n");
      out.write("            $(\"#btn2\").text(\"取消\");\r\n");
      out.write("            status2=1;\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#nicknameForm\").hide(\"fast\");\r\n");
      out.write("            $(\"#btn2\").text(\"修改昵称\");\r\n");
      out.write("            status2=0;\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    $(\"#btn3\").click(function (){\r\n");
      out.write("        if(status3==0){\r\n");
      out.write("            $(\"#profileForm\").show(\"fast\");\r\n");
      out.write("            $(\"#btn3\").text(\"取消\");\r\n");
      out.write("            status3=1;\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#profileForm\").hide(\"fast\");\r\n");
      out.write("            $(\"#btn3\").text(\"修改个人简介\");\r\n");
      out.write("            status3=0;\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    $(\"#btn4\").click(function (){\r\n");
      out.write("        if(status4==0){\r\n");
      out.write("            $(\"#upwdForm\").show(\"fast\");\r\n");
      out.write("            $(\"#btn4\").text(\"取消\");\r\n");
      out.write("            status4=1;\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#upwdForm\").hide(\"fast\");\r\n");
      out.write("            $(\"#btn4\").text(\"修改密码\");\r\n");
      out.write("            status4=0;\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
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