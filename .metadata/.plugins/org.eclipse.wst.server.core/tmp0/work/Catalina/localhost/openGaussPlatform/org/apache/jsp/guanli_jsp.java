/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2023-04-03 18:39:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class guanli_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>管理员主页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("    background-image:url(\"背景1.jpg\");\r\n");
      out.write("    background-size:cover;  \r\n");
      out.write("}\r\n");
      out.write("ul\r\n");
      out.write("      {\r\n");
      out.write("        list-style-type:none;\r\n");
      out.write("        margin:0;\r\n");
      out.write("        padding:0;\r\n");
      out.write("        overflow:hidden;\r\n");
      out.write("        background-color: #00E5EE;\r\n");
      out.write("      }\r\n");
      out.write("       .text0\r\n");
      out.write("      {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 14px 16px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("      .text0:hover\r\n");
      out.write("      {\r\n");
      out.write("        background-color:#00FF7F;\r\n");
      out.write("      }\r\n");
      out.write(".box{\r\n");
      out.write("width: 1400px;\r\n");
      out.write("\r\n");
      out.write("height: 600px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".left-box{\r\n");
      out.write("width:20%;\r\n");
      out.write("height:50%;\r\n");
      out.write("float: left;\r\n");
      out.write("margin-left:20px;\r\n");
      out.write("margin-top:90px;\r\n");
      out.write("}\r\n");
      out.write("textarea {\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            resize: none;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
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
      out.write(".right-box{\r\n");
      out.write("width:60%;\r\n");
      out.write("height:80%;\r\n");
      out.write("float: right;\r\n");
      out.write("margin-top:90px;\r\n");
      out.write("border-left: 3px dotted #000;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<ul>\r\n");
      out.write("      <a class=\"text0\" href=\"guanli.jsp\">SQL实验</a>\r\n");
      out.write("      <a class=\"text0\" href=\"history.jsp\">历史输入</a>\r\n");
      out.write("      <a class=\"text0\" href=\"xinxi_guanli.jsp\">管理信息</a>\r\n");
      out.write("      <a class=\"text0\" href=\"index.jsp\">退出系统</a>\r\n");
      out.write("    </ul>\r\n");
      out.write("<center>Welcome! 管理员使用系统</center>\r\n");
      out.write("\r\n");
      out.write("<div class=\"box\">\r\n");
      out.write("<div class=\"left-box\">\r\n");
      out.write("<form action=\"mingling1\">\r\n");
      out.write("<textarea name=\"strinG\" id=\"\" cols=\"30\" rows=\"10\" placeholder=\"请输入sql语句\">\r\n");
      out.write("</textarea>\r\n");
      out.write("<input type=\"submit\" value=\"执行\"><input type=\"reset\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"right-box\">\r\n");
 
   if(session.getAttribute("存在").equals(1)){//判断是否进行了查询
    int num=(int)session.getAttribute("列数");
    int sum=(int)session.getAttribute("列表数");    
    System.out.println(sum);
    if(sum!=0){
    String[] str=new String[100],str1=new String[1000];
    str=(String[])session.getAttribute("属性名");
    str1=(String[])session.getAttribute("查询数据");

      out.write(" <center> <table border=\"2px\">\r\n");
      out.write("      <tr>\r\n");
          for(int i=1;i<=num;i++){

      out.write("       <th>");
      out.print(str[i]);
      out.write("</th>\r\n");

	        }

      out.write("</tr><tr>\r\n");

	    	for(int i=0;i<sum/num;i++){
	    		
      out.write("<tr>");

	    		for(int y=0;y<num;y++){

      out.write("             <td>");
      out.print(str1[y+i*num] );
      out.write("</td>\r\n");

	    		}
	    		
      out.write("</tr>\r\n");
      out.write("\t    \t\t");

	    	}

      out.write('\r');
      out.write('\n');

	}else{
		
      out.write("<center>当前查询没有数据，请重新输入</center>");

	}
    session.setAttribute("存在", 0);

      out.write("\r\n");
      out.write("    </table></center>\r\n");
  } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"https://docs.opengauss.org/zh/docs/3.1.0/docs/BriefTutorial/%E7%AE%80%E5%8D%95%E6%95%B0%E6%8D%AE%E7%AE%A1%E7%90%86.html\" target=\"_blank\">使用帮助</a>\r\n");
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
