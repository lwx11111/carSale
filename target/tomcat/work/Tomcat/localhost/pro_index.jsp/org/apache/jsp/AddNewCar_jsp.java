/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-26 02:13:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>PostNewCar</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <form action=\"AddNewCar\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        品牌：<select name=\"brand\">\r\n");
      out.write("                <option value=\"奥迪\">奥迪</option>\r\n");
      out.write("                <option value=\"阿斯顿马丁\">阿斯顿马丁</option>\r\n");
      out.write("                <option value=\"阿尔法罗密欧\">阿尔法罗密欧</option>\r\n");
      out.write("                <option value=\"本田\">本田</option>\r\n");
      out.write("                <option value=\"宝马\">宝马</option>\r\n");
      out.write("                <option value=\"奔驰\">奔驰</option>\r\n");
      out.write("                <option value=\"别克\">别克</option>\r\n");
      out.write("                <option value=\"比亚迪\">比亚迪</option>\r\n");
      out.write("\r\n");
      out.write("            </select><br>\r\n");
      out.write("        型号：<input name=\"model\"><br>\r\n");
      out.write("        价格：<input name=\"price\"><br>\r\n");
      out.write("        购买时间：<select name=\"time\">\r\n");
      out.write("                    <option value=\"2000\">2000</option>\r\n");
      out.write("                    <option value=\"2001\">2001</option>\r\n");
      out.write("                    <option value=\"2002\">2002</option>\r\n");
      out.write("                    <option value=\"2003\">2003</option>\r\n");
      out.write("                </select><br>\r\n");
      out.write("        车辆图片：<input type=\"file\" name=\"pic\"><br>\r\n");
      out.write("\r\n");
      out.write("        颜色：<select name=\"color\">\r\n");
      out.write("                <option value=\"红色\">红色</option>\r\n");
      out.write("                <option value=\"绿色\">绿色</option>\r\n");
      out.write("                <option value=\"黑色\">黑色</option>\r\n");
      out.write("                <option value=\"白色\">白色</option>\r\n");
      out.write("            </select><br>\r\n");
      out.write("        车龄：<input name=\"age\"><br>\r\n");
      out.write("        车辆位置：<select name=\"location\">\r\n");
      out.write("                    <option value=\"北京\">北京</option>\r\n");
      out.write("                    <option value=\"上海\">上海</option>\r\n");
      out.write("                    <option value=\"广州\">广州</option>\r\n");
      out.write("                    <option value=\"淄博\">淄博</option>\r\n");
      out.write("                </select><br>\r\n");
      out.write("        历程：<input name=\"mile\"><br>\r\n");
      out.write("        <button type=\"submit\">submit</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
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