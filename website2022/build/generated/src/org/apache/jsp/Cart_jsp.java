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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Cart</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .tablecart{\n");
      out.write("\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-left: 498px;\n");
      out.write("            }\n");
      out.write("            .bill {\n");
      out.write("\n");
      out.write("                margin-left: 500px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .billl {\n");
      out.write("                padding: 50px ;\n");
      out.write("            } \n");
      out.write("            .billl a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #e52f2f;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Shopping cart table -->\n");
      out.write("        <div class=\"tablecart\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th >\n");
      out.write("                            <div >Sản Phẩm</div>\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            <div>Image</div>\n");
      out.write("                        </th>\n");
      out.write("                        <th >\n");
      out.write("                            <div>Đơn Giá</div>\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            <div>Số Lượng</div>\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            <div>Xóa</div>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td > <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></td>\n");
      out.write("                        <td> <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" width=\"70\" > </td>\n");
      out.write("                        <td ><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></td>\n");
      out.write("                        <td >\n");
      out.write("                            <a href=\"sub?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><button class=\"btnSub\">-</button></a> <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\n");
      out.write("                            <a href=\"cart?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><button class=\"btnAdd\">+</button></a>\n");
      out.write("                        </td>\n");
      out.write("                        <td ><a href=\"remove?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ></a>\n");
      out.write("                            <button type=\"button\">Delete</button>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr> \n");
      out.write("                </c:forEach>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <!-- End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"bill\" >                           \n");
      out.write("            <div class=\"billl\" >\n");
      out.write("                <div >Thành tiền</div>\n");
      out.write("                <div >\n");
      out.write("                    <ul >\n");
      out.write("                        <li><strong>Tổng tiền hàng</strong><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></li> \n");
      out.write("                        <li ><strong>Phí vận chuyển: </strong><strong>Free ship</strong></li>\n");
      out.write("                        <li ><strong>Tổng thanh toán</strong>\n");
      out.write("                            <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" ₫</h5>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"order\" >Mua hàng</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
