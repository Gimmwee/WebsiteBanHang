package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Printd T-Shirt - RedStore</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/logo.png\" width=\"125px\"></a>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul id=\"MenuItems\">\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"products.html\">Products</a></li>\n");
      out.write("                    <li><a href=\"\">About</a></li>\n");
      out.write("                    <li><a href=\"\">Contact</a></li>\n");
      out.write("                    <li><a href=\"account.html\">Account</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <a href=\"cart.html\"><img src=\"images/cart.png\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("            <img src=\"images/menu.png\" class=\"menu-icon\" onclick=\"menutoggle()\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- -----------------cart item details------------------- -->\n");
      out.write("    <div class=\"small-container cart-page\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Product</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Subtotal</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"cart-info\">\n");
      out.write("                        <img src=\"images/buy-1.jpg\">\n");
      out.write("                        <div>\n");
      out.write("                            <p>Red Printed Tshirt</p>\n");
      out.write("                            <small>Price: $50.00</small>\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"\">Remove</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                <td><input type=\"number\" value=\"1\"></td>\n");
      out.write("                <td>$50.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"cart-info\">\n");
      out.write("                        <img src=\"images/buy-2.jpg\">\n");
      out.write("                        <div>\n");
      out.write("                            <p>Red Printed Tshirt</p>\n");
      out.write("                            <small>Price: $75.00</small>\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"\">Remove</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                <td><input type=\"number\" value=\"1\"></td>\n");
      out.write("                <td>$75.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"cart-info\">\n");
      out.write("                        <img src=\"images/buy-3.jpg\">\n");
      out.write("                        <div>\n");
      out.write("                            <p>Red Printed Tshirt</p>\n");
      out.write("                            <small>Price: $50.00</small>\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"\">Remove</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                <td><input type=\"number\" value=\"1\"></td>\n");
      out.write("                <td>$50.00</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div class=\"total-price\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Subtotal</td>\n");
      out.write("                    <td>175.000$</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tax</td>\n");
      out.write("                    <td>25.00$</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Total</td>\n");
      out.write("                    <td>200.000$</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
