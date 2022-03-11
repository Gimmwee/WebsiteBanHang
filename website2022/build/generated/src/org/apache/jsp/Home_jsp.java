package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>SonMotorBike</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .header {\n");
      out.write("            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        .body{\n");
      out.write("            background: radial-gradient(rgb(255, 255, 255), rgb(6, 3, 3));\n");
      out.write("        }\n");
      out.write("        .title::after {\n");
      out.write("\n");
      out.write("            background: #1d1817;\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"Home.jsp\"><img src=\"image/logo.jpg\" width=\"125px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <nav>\n");
      out.write("                            <ul id=\"MenuItems\">\n");
      out.write("                                <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"list\">Products</a></li>                            \n");
      out.write("                                <li><a href=\"\">ManagerProduct</a></li>\n");
      out.write("                                <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                        <a href=\"cart.jsp\"><img src=\"image/imagecart.jpg\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("                        <img src=\"image/menu.png\" class=\"menu-icon\" \n");
      out.write("                             onclick=\"menutoggle()\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("                            <h1>Welcome to<br> SonMotorBike!</h1>\n");
      out.write("                            <p>SonMotorBike chuyên mua bán các dòng xe motor thể thao phong phú của các hãng nổi tiếng: Honda, Yamaha, Suzuki,, DUCATI, Kawasaki... </p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("                            <img src=\"image/anhbiaa.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ------------- featured categorries ---------------- -->\n");
      out.write("            <div class=\"categories\">\n");
      out.write("                <div class=\"small-container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("                            <img src=\"image/image1.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("                            <img src=\"image/image2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("                            <img src=\"image/image3.jpg\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- ------------- featured products ---------------- -->\n");
      out.write("            <div class=\"small-container\">\n");
      out.write("                <h2 class=\"title\">Sản Phẩm Mới Nhất</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <img  src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                        <p >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</p>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ------------footer----------- -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- ------------------- js for toggle menu-------------- -->\n");
      out.write("            <script>\n");
      out.write("                var MenuItems = document.getElementById(\"MenuItems\");\n");
      out.write("\n");
      out.write("                MenuItems.style.maxHeight = \"0px\";\n");
      out.write("\n");
      out.write("                function menutoggle() {\n");
      out.write("                    if (MenuItems.style.maxHeight == \"0px\")\n");
      out.write("                    {\n");
      out.write("                        MenuItems.style.maxHeight = \"200px\";\n");
      out.write("                    } else\n");
      out.write("                    {\n");
      out.write("                        MenuItems.style.maxHeight = \"0px\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        </body>\n");
      out.write("    </html>");
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
