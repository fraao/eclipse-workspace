/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2023-04-03 18:03:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import openGaussPlatform.openGausslink;
import java.sql.Connection;
import java.sql.*;

public final class xinxi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("openGaussPlatform.openGausslink");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>个人信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("        border-collapse: collapse;\r\n");
      out.write("        width: 80%;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        font-family: Arial, sans-serif;\r\n");
      out.write("      }\r\n");
      out.write("      th {\r\n");
      out.write("        background-color: #2d2d2d;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("      }\r\n");
      out.write("      td {\r\n");
      out.write("        border: 1px solid #ddd;\r\n");
      out.write("        padding: 8px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("      td:hover{\r\n");
      out.write("      background-color: #33FF33;\r\n");
      out.write("      }\r\n");
      out.write("      tr:nth-child(even) {\r\n");
      out.write("        background-color: #f2f2f2;\r\n");
      out.write("      }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
 
   session.setAttribute("存在", 0);
   String s=(String)session.getAttribute("当前用户");
   openGausslink obj=new openGausslink();
   Connection con= obj.GetConnection("jack", "Aowei103");
   String sql="select *from users where code="+s+";";
   PreparedStatement preparedStatement=con.prepareStatement(sql);
   ResultSet resultSet=preparedStatement.executeQuery();

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<table border=\"2px\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>学号</th><th>密码</th><th>操作</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
 int i=1;
while(resultSet.next()){ 

      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("code") );
      out.write("</td><td>");
      out.print(resultSet.getString("password") );
      out.write("</td><td><a href=\"pass_update.jsp\">修改</a></td>\r\n");
      out.write("</tr>\r\n");
 }; 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<a href=\"main_system.jsp\">返回</a>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
