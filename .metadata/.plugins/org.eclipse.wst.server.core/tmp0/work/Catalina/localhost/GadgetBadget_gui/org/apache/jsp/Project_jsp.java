/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2021-05-06 12:36:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ProjectServlet;

public final class Project_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("model.ProjectServlet");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t\t<title>Project Management - GadgetBadget</title>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<link href=\"myStyle.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"Views/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"Components/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"Components/Project.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<p class=\"font-weight-bold\">\r\n");
      out.write("\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t<h1><u><i><b>Project Management - GadgetBadget</b></i></u></h1>\r\n");
      out.write("\t\t\t\t</center>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<legend><b>Add Project Details</b></legend>\r\n");
      out.write("\t\t\t\t\t<form id=\"PROJECT\" name=\"PROJECT\" class=\"border border-light p-5\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-outline mb-4\">\r\n");
      out.write("\t\t\t\t\t\t    <label class=\"form-label\" for=\"form6Example3\" class=\"col-sm-2 col-form-label col-form-label-sm\">project_type:</label>\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" id=\"project_type\" class=\"form-control\" name=\"project_type\">\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-outline mb-4\">\r\n");
      out.write("\t\t\t\t\t\t    <label class=\"form-label\" for=\"form6Example3\" class=\"col-sm-2 col-form-label col-form-label-sm\">project_name:</label>\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" id=\"project_name\" class=\"form-control\" name=\"project_name\">\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-outline mb-4\">\r\n");
      out.write("\t\t\t\t\t\t    <label class=\"form-label\" for=\"form6Example3\" class=\"col-sm-2 col-form-label col-form-label-sm\">researcher:</label>\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" id=\"researcher\" class=\"form-control\" name=\"researcher\">\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-outline mb-4\">\r\n");
      out.write("\t\t\t\t\t\t    <label class=\"form-label\" for=\"form6Example3\" class=\"col-sm-2 col-form-label col-form-label-sm\">description:</label>\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" id=\"description\" class=\"form-control\" name=\"description\">\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<br> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input id=\"btnSave\" name=\"btnSave\" type=\"button\" value=\"Save\" class=\"btn btn-primary btn-lg btn-block\"> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"hidProjectIDSave\" name=\"hidProjectIDSave\" value=\"\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"alertSuccess\" class=\"alert alert-success\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"alertError\" class=\"alert alert-danger\"></div>\t\t\t\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"container\" id=\"ProjectGrid\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend><b>View Project Details</b></legend>\r\n");
      out.write("\t\t\t\t\t<form method=\"post\" action=\"Project.jsp\" class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t\t\t");

							ProjectServlet viewProject = new ProjectServlet();
											out.print(viewProject.readProject());
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
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
