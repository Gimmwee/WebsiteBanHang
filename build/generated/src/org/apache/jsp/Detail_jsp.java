package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .gallery-wrap .img-big-wrap img {\n");
      out.write("                height: 450px;\n");
      out.write("                width: auto;\n");
      out.write("                display: inline-block;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .gallery-wrap .img-small-wrap .item-gallery {\n");
      out.write("                width: 60px;\n");
      out.write("                height: 60px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin: 7px 2px;\n");
      out.write("                display: inline-block;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gallery-wrap .img-small-wrap {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .gallery-wrap .img-small-wrap img {\n");
      out.write("                max-width: 100%;\n");
      out.write("                max-height: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("            .img-big-wrap img{\n");
      out.write("                width: 100% !important;\n");
      out.write("                height: auto !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"card bg-light mb-3\">\n");
      out.write("                            <div class=\"card-header bg-primary text-white text-uppercase\"><i class=\"fa fa-list\"></i> Categories</div>\n");
      out.write("                            <ul class=\"list-group category_block\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card bg-light mb-3\">\n");
      out.write("                        <div class=\"card-header bg-success text-white text-uppercase\">Last product</div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            <h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                            <p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p class=\"bloc_left_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <aside class=\"col-sm-5 border-right\">\n");
      out.write("                                    <article class=\"gallery-wrap\"> \n");
      out.write("                                        <div class=\"img-big-wrap\">\n");
      out.write("                                            <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\n");
      out.write("                                        </div> <!-- slider-product.// -->\n");
      out.write("                                        <div class=\"img-small-wrap\">\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\n");
      out.write("                                        </div> <!-- slider-nav.// -->\n");
      out.write("                                    </article> <!-- gallery-wrap .end// -->\n");
      out.write("                                </aside>\n");
      out.write("                                <aside class=\"col-sm-7\">\n");
      out.write("                                    <article class=\"card-body p-5\">\n");
      out.write("                                        <h3 class=\"title mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                                        <p class=\"price-detail-wrap\"> \n");
      out.write("                                            <span class=\"price h3 text-warning\"> \n");
      out.write("                                                <span class=\"currency\">US $</span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                            </span> \n");
      out.write("                                            <!--<span>/per kg</span>--> \n");
      out.write("                                        </p> <!-- price-detail-wrap .// -->\n");
      out.write("                                        <dl class=\"item-property\">\n");
      out.write("                                            <dt>Description</dt>\n");
      out.write("                                            <dd><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p></dd>\n");
      out.write("                                        </dl>\n");
      out.write("<!--                                        <dl class=\"param param-feature\">\n");
      out.write("                                            <dt>Model#</dt>\n");
      out.write("                                            <dd>12345611</dd>\n");
      out.write("                                        </dl>   item-property-hor .// \n");
      out.write("                                        <dl class=\"param param-feature\">\n");
      out.write("                                            <dt>Color</dt>\n");
      out.write("                                            <dd>Black and white</dd>\n");
      out.write("                                        </dl>   item-property-hor .// \n");
      out.write("                                        <dl class=\"param param-feature\">\n");
      out.write("                                            <dt>Delivery</dt>\n");
      out.write("                                            <dd>Russia, USA, and Europe</dd>\n");
      out.write("                                        </dl>   item-property-hor .// -->\n");
      out.write("\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-5\">\n");
      out.write("                                                <dl class=\"param param-inline\">\n");
      out.write("                                                    <dt>Quantity: </dt>\n");
      out.write("                                                    <dd>\n");
      out.write("                                                        <select class=\"form-control form-control-sm\" style=\"width:70px;\">\n");
      out.write("                                                            <option> 1 </option>\n");
      out.write("                                                            <option> 2 </option>\n");
      out.write("                                                            <option> 3 </option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </dd>\n");
      out.write("                                                </dl>  <!-- item-property .// -->\n");
      out.write("                                            </div> <!-- col.// -->\n");
      out.write("                                            \n");
      out.write("                                        </div> <!-- row.// -->\n");
      out.write("                                        <hr>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-primary text-uppercase\"> Buy now </a>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Add to cart </a>\n");
      out.write("                                    </article> <!-- card-body.// -->\n");
      out.write("                                </aside> <!-- col.// -->\n");
      out.write("                            </div> <!-- row.// -->\n");
      out.write("                        </div> <!-- card.// -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"text-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                        <h5>About</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <p class=\"mb-0\">\n");
      out.write("                            Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Informations</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Others links</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                        <h5>Contact</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><i class=\"fa fa-home mr-2\"></i> My company</li>\n");
      out.write("                            <li><i class=\"fa fa-envelope mr-2\"></i> email@example.com</li>\n");
      out.write("                            <li><i class=\"fa fa-phone mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                            <li><i class=\"fa fa-print mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 copyright mt-3\">\n");
      out.write("                        <p class=\"float-left\">\n");
      out.write("                            <a href=\"#\">Back to top</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"text-right text-muted\">created with <i class=\"fa fa-heart\"></i> by <a href=\"https://t-php.fr/43-theme-ecommerce-bootstrap-4.html\"><i>t-php</i></a> | <span>v. 1.0</span></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ALLCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"list-group-item text-white\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
