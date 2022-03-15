package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DetailProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Detail</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                   <a href=\"Home.jsp\"><img src=\"image/logo.png\" width=\"125px\"></a>\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                    <ul id=\"MenuItems\">\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"products.html\">Products</a></li>\n");
      out.write("                        <li><a href=\"\">About</a></li>\n");
      out.write("                        <li><a href=\"\">Contact</a></li>\n");
      out.write("                        <li><a href=\"account.html\">Account</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <a href=\"cart.html\"><img src=\"images/cart.png\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("                <img src=\"images/menu.png\" class=\"menu-icon\" onclick=\"menutoggle()\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ---------- single Products detail ----------- -->\n");
      out.write("\n");
      out.write("    <div class=\"small-container single-product\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2\">\n");
      out.write("                <img src=\"images/gallery-1.jpg\" width=\"100%\" id=\"productImg\">\n");
      out.write("\n");
      out.write("                <div class=\"small-img-row\">\n");
      out.write("                    <div class=\"small-img-rol\">\n");
      out.write("                        <img src=\"image/gallery-1.jpg\" width=\"100%\" class=\"small-img\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"small-img-rol\">\n");
      out.write("                        <img src=\"image/gallery-2.jpg\" width=\"100%\" class=\"small-img\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"small-img-rol\">\n");
      out.write("                        <img src=\"image/gallery-3.jpg\" width=\"100%\" class=\"small-img\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"small-img-rol\">\n");
      out.write("                        <img src=\"image/gallery-4.jpg\" width=\"100%\" class=\"small-img\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-2\">\n");
      out.write("                <p>Home / T-Shirt</p>\n");
      out.write("                <h1>Red Printd T-Shirt by Huy</h1>\n");
      out.write("                <h4>$50.00</h4>\n");
      out.write("                <select>\n");
      out.write("                    <option>Select Size</option>\n");
      out.write("                    <option>XXL</option>\n");
      out.write("                    <option>XL</option>\n");
      out.write("                    <option>Large</option>\n");
      out.write("                    <option>Medium</option>\n");
      out.write("                    <option>Small</option>\n");
      out.write("                    </section>\n");
      out.write("                    <input type=\"number\" value=\"1\">\n");
      out.write("                    <a href=\"\" class=\"btn\">Add To Card</a>\n");
      out.write("                    <h3>Product Detail\n");
      out.write("                        <i class=\"fa fa-indent\"></i>\n");
      out.write("                    </h3>\n");
      out.write("                    <br>\n");
      out.write("                    <p>Surrounded affronting favourable no mr. Lain knew like half she yet joy. Be than dull as seen\n");
      out.write("                        very shot. Attachment ye so am travelling estimating projecting is. Off fat address attacks his\n");
      out.write("                        besides. Suitable settling mr attended no doubtful feelings. Any over for say bore such sold\n");
      out.write("                        five but hung</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ------------footer----------- -->\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"footer-col-1\">\n");
      out.write("                    <h3>Download Our App</h3>\n");
      out.write("                    <p>Download App for Android and ios mobile phone</p>\n");
      out.write("                    <div class=\"app-logo\">\n");
      out.write("                        <img src=\"image/play-store.png\">\n");
      out.write("                        <img src=\"image/app-store.png\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-col-2\">\n");
      out.write("                    <img src=\"image/logo-white.png\">\n");
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
      out.write("                } else {\n");
      out.write("                    MenuItems.style.maxHeight = \"0px\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- ------------------- JS for  product gallery------------------------         -->\n");
      out.write("        <!--        <script>\n");
      out.write("                    var ProductImg = document.getElementById(\"productImg\");\n");
      out.write("                    var SmallImg = document.getElementsByClassName(\"small-img\");\n");
      out.write("        \n");
      out.write("                    SmallImg[0].onclick = function()\n");
      out.write("                    {\n");
      out.write("                        ProductImg.src = SmallImg[0].src;\n");
      out.write("                    }\n");
      out.write("                    SmallImg[1].onclick = function()\n");
      out.write("                    {\n");
      out.write("                        ProductImg.src = SmallImg[1].src;\n");
      out.write("                    }\n");
      out.write("                    SmallImg[2].onclick = function()\n");
      out.write("                    {\n");
      out.write("                        ProductImg.src = SmallImg[2].src;\n");
      out.write("                    }\n");
      out.write("                    SmallImg[3].onclick = function()\n");
      out.write("                    {\n");
      out.write("                        ProductImg.src = SmallImg[3].src;\n");
      out.write("                    }\n");
      out.write("        \n");
      out.write("                </script>-->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
