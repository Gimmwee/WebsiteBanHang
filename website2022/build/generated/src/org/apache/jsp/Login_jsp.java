package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>SonMoTorBike</title>    \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .account-page {           \n");
      out.write("            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));\n");
      out.write("        }\n");
      out.write("        form .btn {\n");
      out.write("            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("        #Indicator {\n");
      out.write("            background: #271513;\n");
      out.write("        }      \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"home\"><img src=\"image/logo.jpg\" width=\"125px\"></a>\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                    <ul id=\"MenuItems\">\n");
      out.write("                        <li><a href=\"home\">Home</a></li>\n");
      out.write("                        <li><a href=\"list\">Products</a></li>                                                                                \n");
      out.write("                    </ul>\n");
      out.write("                </nav>           \n");
      out.write("                <img src=\"image/menu.jpg\" class=\"menu-icon\" onclick=\"menutoggle()\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ------------Account-page------------------- -->\n");
      out.write("        <div class=\"account-page\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <img src=\"image/anhbiaa.jpg\" width=\"100%\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <div class=\"form-container\">\n");
      out.write("                            <div class=\"form-btn\">\n");
      out.write("                                <span onclick=\"login()\">Login</span>\n");
      out.write("                                <span onclick=\"register()\">Register</span>\n");
      out.write("                                <hr id=\"Indicator\">\n");
      out.write("                            </div>\n");
      out.write("                            <form id=\"LoginForm\" action=\"login\" method=\"post\">\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                <input name=\"user\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                                <input name=\"pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"password\" placeholder=\"Password\">\n");
      out.write("                                <div class=\"remem\">\n");
      out.write("                                    <input name=\"check\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"checkbox\" type=\"checkbox\" > Remember me  \n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn\">Login</button>    \n");
      out.write("                            </form>\n");
      out.write("                            <form id=\"RegForm\" action=\"signup\" method=\"post\" >\n");
      out.write("                                <input name=\"user\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                                <input name=\"name\" type=\"text\" placeholder=\"Name\">\n");
      out.write("                                <input name=\"address\" type=\"text\" placeholder=\"Address\">\n");
      out.write("                                <input name=\"phone\" type=\"text\" placeholder=\"Phone Number\">\n");
      out.write("                                <input name=\"pass\" type=\"password\" placeholder=\"Password\">\n");
      out.write("                                <input name=\"repass\" type=\"password\"placeholder=\"Repeat Password\">\n");
      out.write("                                <button type=\"submit\" class=\"btn\">Register</button>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ------------footer----------- -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- ------------------- js for toggle menu-------------- -->\n");
      out.write("        <script>\n");
      out.write("            var MenuItems = document.getElementById(\"MenuItems\");\n");
      out.write("\n");
      out.write("            MenuItems.style.maxHeight = \"0px\";\n");
      out.write("\n");
      out.write("            function menutoggle() {\n");
      out.write("                if (MenuItems.style.maxHeight == \"0px\") {\n");
      out.write("                    MenuItems.style.maxHeight = \"200px\";\n");
      out.write("                } else {\n");
      out.write("                    MenuItems.style.maxHeight = \"0px\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <!-- ------------------- js for Account form-------------- -->\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var LoginForm = document.getElementById(\"LoginForm\");\n");
      out.write("            var RegForm = document.getElementById(\"RegForm\");\n");
      out.write("            var Indicator = document.getElementById(\"Indicator\");\n");
      out.write("\n");
      out.write("            function register() {\n");
      out.write("                RegForm.style.transform = \"translateX(0px)\";\n");
      out.write("                LoginForm.style.transform = \"translateX(0px)\";\n");
      out.write("                Indicator.style.transform = \"translateX(100px)\";\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function login() {\n");
      out.write("                RegForm.style.transform = \"translateX(300px)\";\n");
      out.write("                LoginForm.style.transform = \"translateX(300px)\";\n");
      out.write("                Indicator.style.transform = \"translateX(0px)\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
