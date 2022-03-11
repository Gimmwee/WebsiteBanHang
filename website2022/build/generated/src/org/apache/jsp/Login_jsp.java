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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>SonMoTorBike</title>    \n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"Home.jsp\"><img src=\"image/logo.png\" width=\"125px\"></a>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul id=\"MenuItems\">\n");
      out.write("                    <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"products.html\">Products</a></li>\n");
      out.write("                    <li><a href=\"\">About</a></li>\n");
      out.write("                    <li><a href=\"\">Contact</a></li>\n");
      out.write("                    <li><a href=\"account.html\">Account</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <a href=\"cart.html\"><img src=\"image/cart.png\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("            <img src=\"images/menu.png\" class=\"menu-icon\" onclick=\"menutoggle()\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ------------Account-page------------------- -->\n");
      out.write("    <div class=\"account-page\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <img src=\"image/image1.png\" width=\"100%\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <div class=\"form-container\">\n");
      out.write("                        <div class=\"form-btn\">\n");
      out.write("                            <span onclick=\"login()\">Login</span>\n");
      out.write("                            <span onclick=\"register()\">Register</span>\n");
      out.write("                            <hr id=\"Indicator\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <form id=\"LoginForm\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Username\">\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\">\n");
      out.write("                            <button type=\"submit\" class=\"btn\">Login</button>                           \n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <form id=\"RegForm\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Username\">\n");
      out.write("                            <input type=\"email\" placeholder=\"Email\">\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\">\n");
      out.write("                            <button type=\"submit\" class=\"btn\">Register</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ------------footer----------- -->\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"footer-col-1\">\n");
      out.write("                    <h3>Download Our App</h3>\n");
      out.write("                    <p>Download App for Android and ios mobile phone</p>\n");
      out.write("                    <div class=\"app-logo\">\n");
      out.write("                        <img src=\"images/play-store.png\">\n");
      out.write("                        <img src=\"images/app-store.png\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-col-2\">\n");
      out.write("                    <img src=\"images/logo-white.png\">\n");
      out.write("                    <p>Our Purpose Is To Sustainably Make the Pleasure and\n");
      out.write("                        Benefits of Sports Accessible to the Many</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-col-3\">\n");
      out.write("                    <h3>Useful Links</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Coupons</li>\n");
      out.write("                        <li>Blog Post</li>\n");
      out.write("                        <li>Return Policy</li>\n");
      out.write("                        <li>Join Affiliate</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-col-4\">\n");
      out.write("                    <h3>Follow us</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Facebook</li>\n");
      out.write("                        <li>Twitter</li>\n");
      out.write("                        <li>Instagram</li>\n");
      out.write("                        <li>Youtube </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <p class=\"Copyright\">Copyright 2020 - By QuocHuy</p>\n");
      out.write("        </div>\n");
      out.write("        <!-- ------------------- js for toggle menu-------------- -->\n");
      out.write("        <script>\n");
      out.write("            var MenuItems = document.getElementById(\"MenuItems\");\n");
      out.write("\n");
      out.write("            MenuItems.style.maxHeight = \"0px\";\n");
      out.write("\n");
      out.write("            function menutoggle() {\n");
      out.write("                if (MenuItems.style.maxHeight == \"0px\") {\n");
      out.write("                    MenuItems.style.maxHeight = \"200px\";\n");
      out.write("                }\n");
      out.write("                else {\n");
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
      out.write("</body>\n");
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
