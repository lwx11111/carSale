/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-25 09:25:05 UTC
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
      out.write("    <title>UserInfo</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        User u=(User) session.getAttribute("user");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    <a href=\"MyPost\">MyPost</a><br>\r\n");
      out.write("    <a href=\"MyAttention\">MyAttention</a><br>\r\n");
      out.write("    <a href=\"MyPurchase\">MyPurchase</a><br>\r\n");
      out.write("    <a href=\"UserInfo.jsp\">个人设置</a>\r\n");
      out.write("    <\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>头像</th>\r\n");
      out.write("            <th><img  width=\"200\" height=\"200\" src=\"");
      out.print(u.getPicPath());
      out.write("\"> </th>\r\n");
      out.write("            <th><button onclick=\"fun(1)\">修改头像</button> </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr id=\"upLoadPic\" style=\"display:none \">\r\n");
      out.write("            <th>\r\n");
      out.write("                <form action=\"upLoadUserPic\" enctype=\"multipart/form-data\" method=\"post\" >\r\n");
      out.write("                    <input type=\"file\" name=\"pic\"><br>\r\n");
      out.write("                    <button type=\"submit\">submit</button>\r\n");
      out.write("                    <button>cancel</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>nickname</th>\r\n");
      out.write("            <th>");
      out.print(u.getNickname());
      out.write(" </th>\r\n");
      out.write("            <th><button >修改nickname</button> </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr id=\"upLoadNickname\" style=\"display:block\">\r\n");
      out.write("            <th>\r\n");
      out.write("                <form action=\"UpLoadUserInfo\"  method=\"post\" >\r\n");
      out.write("                    <input type=\"text\" name=\"nickname\"><br>\r\n");
      out.write("                    <button type=\"submit\">submit</button>\r\n");
      out.write("                    <button>cancel</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>shortInfo</th>\r\n");
      out.write("            <th>");
      out.print(u.getProfile());
      out.write(" </th>\r\n");
      out.write("            <th><button >修改头像</button> </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr id=\"upLoadProfile\" style=\"display:block \">\r\n");
      out.write("            <th>\r\n");
      out.write("                <form action=\"UpLoadUserInfo\"  method=\"post\" >\r\n");
      out.write("                    <textarea name=\"profile\"></textarea>\r\n");
      out.write("                    <button type=\"submit\">submit</button>\r\n");
      out.write("                    <button>cancel</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <button >修改密码</button>\r\n");
      out.write("    <form action=\"UploadUserUpwd\"  method=\"post\" >\r\n");
      out.write("        输入新密码:<input type=\"text\" name=\"upwd\"><br>\r\n");
      out.write("        <button type=\"submit\">submit</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <a href=\"Quit\">Quit</a>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function fun(arg){\r\n");
      out.write("        var tr1 = document.getElementById(\"upLoadPic\");\r\n");
      out.write("\r\n");
      out.write("        if (arg == 1)\r\n");
      out.write("        {\r\n");
      out.write("            tr1.style.display = 'block';\r\n");
      out.write("            arg=0;\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("        {\r\n");
      out.write("            tr1.style.display = 'none';\r\n");
      out.write("            arg=1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
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