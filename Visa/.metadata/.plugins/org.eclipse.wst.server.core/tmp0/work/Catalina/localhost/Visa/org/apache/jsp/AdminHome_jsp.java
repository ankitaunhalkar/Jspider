/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.29
 * Generated at: 2018-02-16 06:57:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".floatleft\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write(".floatright\r\n");
      out.write("{\r\n");
      out.write("float:right;\r\n");
      out.write("}\r\n");
      out.write("header, footer {\r\n");
      out.write("    padding: 1em;\r\n");
      out.write("    color: white;\r\n");
      out.write("    background-color: grey;\r\n");
      out.write("    clear: left;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<img src=\"airplane-take-off.png\" height=\"150\" width=\"150\">\r\n");
      out.write("<h1>VISA INFORMATION PROCESSING SYSTEM</h1>\r\n");
      out.write("</header>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"floatleft\">\r\n");
      out.write("<a href=\"CreateAdmin.jsp\" target=\"iframe\">Create Admin</a><br>\r\n");
      out.write("<a href=\"CreateAgent.jsp\" target=\"iframe\">Create Agent</a><br>\r\n");
      out.write("<a href=\"CreateBranch.jsp\" target=\"iframe\">Create Branch</a><br>\r\n");
      out.write("<a href=\"SearchAdmin.jsp\" target=\"iframe\">Search Admin</a><br>\r\n");
      out.write("<a href=\"SearchAgent.jsp\" target=\"iframe\">Search Agent</a><br>\r\n");
      out.write("<a href=\"SearchBranch.jsp\" target=\"iframe\">Search Branch</a><br>\r\n");
      out.write("<a href=\"AppointDetails.jsp\" target=\"iframe\">Appointment Details</a><br>\r\n");
      out.write("<a href=\"Approval.jsp\" target=\"iframe\">Approval</a><br>\r\n");
      out.write("<a href=\"\" target=\"iframe\">View Cancel Appointment</a><br>\r\n");
      out.write("<a href=\"Logout\">Logout</a><br><br>\r\n");
      out.write("</div>\r\n");
 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires", "0");

      out.write("\r\n");
      out.write("<div class=\"floatright\"><iframe name=\"iframe\" frameborder=\"0\" height=\"500px\" width=\"900px\"></iframe></div>\r\n");
      out.write("  <br><br><br><br><br>\r\n");
      out.write("<!--  <footer>Copyright &copy; Februray 2018</footer> -->\r\n");
      out.write("\r\n");
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
