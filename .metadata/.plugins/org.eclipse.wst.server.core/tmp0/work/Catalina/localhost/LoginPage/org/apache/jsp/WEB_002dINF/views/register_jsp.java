/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-30 08:44:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/resources/components/footer.jsp", Long.valueOf(1696930011230L));
    _jspx_dependants.put("/WEB-INF/resources/components/all_links.jsp", Long.valueOf(1696930112520L));
    _jspx_dependants.put("/WEB-INF/resources/components/navbar.jsp", Long.valueOf(1696929624342L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1696917979609L));
    _jspx_dependants.put("jar:file:/C:/Users/DELL/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LoginPage/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.release();
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
      out.write("    	\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Login Page</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- Font Awesome -->\r\n");
      out.write("	<script src=\"https://kit.fontawesome.com/ed2f933003.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- NavBar  -->\r\n");
      out.write("	<div class=\"container-fullwidth\">\r\n");
      out.write("		<!-- NavBar  -->\r\n");
      out.write("\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-primary\">\r\n");
      out.write("			<a class=\"navbar-brand text-white ms-5\" href=\"#\">Home Section</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("				data-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("				aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("				<div class=\"navbar-nav ms-auto\">\r\n");
      out.write("					<a class=\"nav-item nav-link active text-white me-4\" href=\"home\">Home\r\n");
      out.write("						<span class=\"sr-only\"></span>\r\n");
      out.write("					</a> <a class=\"nav-item nav-link text-white me-4\" href=\"login\"\r\n");
      out.write("						id=\"showSignInForm\">SignIn</a> <a href=\"register\"\r\n");
      out.write("						class=\"nav-item nav-link text-white me-4\" id=\"showSignUpForm\">SignUp</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Register page -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"signUpForm\" id=\"signUp\">\r\n");
      out.write("			<section class=\"vh-100\" style=\"background-color: #eee\">\r\n");
      out.write("				<div class=\"container h-100\">\r\n");
      out.write("					<div\r\n");
      out.write("						class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("						<div class=\"col-lg-12 col-xl-11\">\r\n");
      out.write("							<div class=\"card text-black\" style=\"border-radius: 25px\">\r\n");
      out.write("								<div class=\"card-body p-md-5\">\r\n");
      out.write("									<div class=\"row justify-content-center\">\r\n");
      out.write("										<div class=\"col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1\">\r\n");
      out.write("											<p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">\r\n");
      out.write("												Sign up</p>\r\n");
      out.write("												");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("											<form class=\"mx-1 mx-md-4\" action=\"register\" method=\"post\">\r\n");
      out.write("												<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("													<i class=\"fas fa-user fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("													<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("														<input type=\"text\" id=\"form3Example1c\"\r\n");
      out.write("															class=\"form-control\" name=\"userName\" /> <label\r\n");
      out.write("															class=\"form-label\" for=\"form3Example1c\">Your Name</label>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("													<i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("													<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("														<input type=\"email\" id=\"form3Example3c\"\r\n");
      out.write("															class=\"form-control\" name=\"email\" /> <label\r\n");
      out.write("															class=\"form-label\" for=\"form3Example3c\">Your\r\n");
      out.write("															Email</label>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("													<i class=\"fas fa-calendar-days fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("													<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("														<input type=\"date\" id=\"form3Example4cc\"\r\n");
      out.write("															class=\"form-control\" name=\"dateField\" /> <label\r\n");
      out.write("															class=\"form-label\" for=\"form3Example4cc\">Date Of\r\n");
      out.write("															Birth</label>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("													<i class=\"fas fa-lock fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("													<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("														<input type=\"password\" id=\"password\" class=\"form-control\"\r\n");
      out.write("															/> <label class=\"form-label\"\r\n");
      out.write("															for=\"password\">Password</label>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("													<i class=\"fas fa-key fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("													<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("														<input type=\"password\" id=\"conformPassword\"\r\n");
      out.write("															class=\"form-control\" name=\"conformPassword\"\r\n");
      out.write("															onblur=\"passwordvalidation()\" /> <label\r\n");
      out.write("															class=\"form-label\" for=\"conformPassword\">Repeat\r\n");
      out.write("															your password</label>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"form-check d-flex justify-content-center mb-5\">\r\n");
      out.write("													<input class=\"form-check-input me-2\" type=\"checkbox\"\r\n");
      out.write("														value=\"\" id=\"form2Example3c\" /> <label\r\n");
      out.write("														class=\"form-check-label\" for=\"form2Example3c\"> I\r\n");
      out.write("														agree all statements in <a href=\"#!\">Terms of service</a>\r\n");
      out.write("													</label>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n");
      out.write("													<input type=\"submit\" class=\"btn btn-primary btn-lg\"\r\n");
      out.write("														value=\"Register\">\r\n");
      out.write("												</div>\r\n");
      out.write("											</form>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div\r\n");
      out.write("											class=\"col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2\">\r\n");
      out.write("											<img\r\n");
      out.write("												src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp\"\r\n");
      out.write("												class=\"img-fluid\" alt=\"Sample image\" />\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fullwidth\" style=\"margin-top: 90px\">\r\n");
      out.write("		<footer>\r\n");
      out.write("			<div\r\n");
      out.write("				class=\"d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary\">\r\n");
      out.write("				<!-- Copyright -->\r\n");
      out.write("				<div class=\"text-white mb-3 mb-md-0\">Copyright © 2023. All\r\n");
      out.write("					rights reserved by NN Devlopers.</div>\r\n");
      out.write("				<!-- Copyright -->\r\n");
      out.write("\r\n");
      out.write("				<!-- Right -->\r\n");
      out.write("				<div>\r\n");
      out.write("					<a href=\"#!\" class=\"text-white me-4\"> <i\r\n");
      out.write("						class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("					</a> <a href=\"#!\" class=\"text-white me-4\"> <i\r\n");
      out.write("						class=\"fab fa-twitter\"></i>\r\n");
      out.write("					</a> <a href=\"#!\" class=\"text-white me-4\"> <i class=\"fab fa-google\"></i>\r\n");
      out.write("					</a> <a href=\"#!\" class=\"text-white\"> <i class=\"fab fa-linkedin-in\"></i>\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Right -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("	// Password validation\r\n");
      out.write("	function passwordvalidation() {\r\n");
      out.write("		var password = document.getElementById(\"password\").value;\r\n");
      out.write("		var conformpassword = document.getElementById(\"conformPassword\").value;\r\n");
      out.write("\r\n");
      out.write("		if (password !== conformpassword) {\r\n");
      out.write("			alert(\"Password and Confirm Password Does not match.\");\r\n");
      out.write("			document.getElementById(\"conformPassword\").value = \"\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	</script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/register.jsp(30,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty msg }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("												<p class=\"fs-3 fw-bold text-success\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("<p/>\r\n");
          out.write("												");
          if (_jspx_meth_c_005fremove_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("												\r\n");
          out.write("												");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f0_reused = false;
    try {
      _jspx_th_c_005fremove_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/register.jsp(32,12) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setVar("msg");
      int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
      if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      _jspx_th_c_005fremove_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f0_reused);
    }
    return false;
  }
}
