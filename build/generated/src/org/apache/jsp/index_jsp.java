package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.user;
import java.util.List;
import entity.LapDtls;
import DAO.LapDAOImpl;
import java.sql.Connection;
import DB.DBConnect;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/allComponent/allCss.jsp");
    _jspx_dependants.add("/allComponent/navbar.jsp");
    _jspx_dependants.add("/allComponent/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lapstore:Home Page</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \n");
      out.write("      integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" \n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \n");
      out.write("integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" \n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" \n");
      out.write("integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" \n");
      out.write("      integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" \n");
      out.write("      crossorigin=\"anonymous\" \n");
      out.write("      referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"allComponent/style.css\">");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .back.img{\n");
      out.write("                background: url(\"img/lap.jpeg\");\n");
      out.write("                height: 50vh;\n");
      out.write("                width: 100%;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("            .crd-ho:hover{\n");
      out.write("                background-color: #fcf7f7; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background-color:#f7f7f7;\">\n");
      out.write("        ");

            user u = (user) session.getAttribute("userobj");
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"height: 10px;background-color: #ab47bc;\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3 text-success\">\n");
      out.write("            <h3><i class=\"fa-solid fa-laptop\"></i> Laptops</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" \n");
      out.write("                       aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa-solid fa-house-chimney\"></i></a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \n");
      out.write("            data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" \n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\"> \n");
      out.write("                    Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"all_recent_laps.jsp\"><i class=\"fa-solid fa-laptop\"></i> Recent</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link disabled\" href=\"all_new_laps.jsp\"><i class=\"fa-solid fa-laptop\"></i> New</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link disabled\" href=\"all_old_laps.jsp\"><i class=\"fa-solid fa-laptop\"></i> Old</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0 \" type=\"submit\">\n");
      out.write("                <i class=\"fa-solid fa-gear\"></i> Setting</button>\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0 ml-1\" type=\"submit\">\n");
      out.write("                <i class=\"fa-solid fa-phone\"></i> Contact us</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid back img\">\n");
      out.write("            <h2 class=\"text-center text-danger\">Laptop store</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!---Start Recent Laptops-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <h3 class=\"text-center\">Recent Laptops</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    LapDAOImpl dao2 = new LapDAOImpl(DBConnect.getConn());
                    List<LapDtls> list2 = dao2.getRecentLap();
                    for (LapDtls b : list2) {
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"laptop/");
      out.print(b.getPhotoName());
      out.write("\" style=\"width:200px; height: 200px;\" class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getLapName());
      out.write("</p>\n");
      out.write("                            <p>\n");
      out.write("\n");
      out.write("                                ");

                                    if (b.getLapCategory().equals("Old")) {
      out.write("\n");
      out.write("                                Categories:");
      out.print(b.getLapCategory());
      out.write("</p>\n");
      out.write("                            <div class=\"row text-center\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm ml-5\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write("</a>\n");
      out.write("                            </div>\n");
      out.write("                            ");
} else {
      out.write("\n");
      out.write("                            Categories:");
      out.print(b.getLapCategory());
      out.write("</p>\n");
      out.write("                            <div class=\"row text-center\">\n");
      out.write("                                \n");
      out.write("                                ");
if (u == null) {
      out.write("\n");
      out.write("                                   <a href=\"login.jsp\" class=\"btn btn-danger btn-sm ml-3\"><i class=\"fa-solid fa-cart-plus\"></i>Add</a>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                    <a href=\"../CartServlet?bid=");
      out.print(b.getlapId() );
      out.write("&&uid=");
      out.print(u.getId());
      out.write("\" class=\"btn btn-danger btn-sm ml-3\"><i class=\"fa-solid fa-cart-plus\"></i>Add</a>\n");
      out.write("                                 ");
}
                                 
      out.write("\n");
      out.write("                                \n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm ml-1\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write("</a>\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
                            
      out.write("    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
                
      out.write("  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-2\">\n");
      out.write("                <a href=\"all_recent_laps.jsp\" class=\"btn btn-danger btn-sm text-white\"> View All</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!---End Recent Laptops-->\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!---Start New Laptops-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <h3 class=\"text-center\">New Laptops</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    LapDAOImpl dao = new LapDAOImpl(DBConnect.getConn());
                    List<LapDtls> list = dao.getNewLap();
                    for (LapDtls b : list) {
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"laptop/");
      out.print(b.getPhotoName());
      out.write("\" style=\"width:200px; height: 200px;\" class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getLapName());
      out.write("</p>\n");
      out.write("                            <p>Categories:");
      out.print(b.getLapCategory());
      out.write("</p>\n");
      out.write("                            <div class=\"row text-center\">\n");
      out.write("                                ");
if (u == null) {
      out.write("\n");
      out.write("                                   <a href=\"login.jsp\" class=\"btn btn-danger btn-sm ml-3\"><i class=\"fa-solid fa-cart-plus\"></i>Add</a>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                    <a href=\"CartServlet?bid=");
      out.print(b.getlapId() );
      out.write("&&uid=");
      out.print(u.getId());
      out.write("\" class=\"btn btn-danger btn-sm ml-3\"><i class=\"fa-solid fa-cart-plus\"></i>Add</a>\n");
      out.write("                                 ");
}
                                 
      out.write("\n");
      out.write("                                \n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm ml-1\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write("</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-2\">\n");
      out.write("                <a href=\"all_new_laps.jsp\" class=\"btn btn-danger btn-sm text-white\"> View All</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!---End New Laptops-->\n");
      out.write("        <hr>\n");
      out.write("        <!---Start Old Laptops-->\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <h3 class=\"text-center\">Old Laptops</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    LapDAOImpl dao3 = new LapDAOImpl(DBConnect.getConn());
                    List<LapDtls> list3 = dao3.getOldLaps();
                    for (LapDtls b : list3) {
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"laptop/");
      out.print(b.getPhotoName());
      out.write("\" style=\"width:200px; height: 200px;\" class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getLapName());
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getLapCategory());
      out.write("</p>\n");
      out.write("                            <div class=\"row text-center\">\n");
      out.write("\n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm ml-5\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write("</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
                
      out.write("  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-2\">\n");
      out.write("                <a href=\"all_old_laps.jsp\" class=\"btn btn-danger btn-sm text-white\"> View All</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!---End Old Laptops-->\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"container-fluid text-center text-white p-3 mt-2\" \n");
      out.write("     style=\"background-color: #ab47bc\">\n");
      out.write("    <p></p>\n");
      out.write("</div>");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty userobj}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"col-md-3\">\n");
        out.write("                \n");
        out.write("                <a href=\"Checkout.jsp\"> <i class=\"fa-solid fa-cart-plus fa-2x\"></i></a>\n");
        out.write("                \n");
        out.write("                <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-user-plus\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userobj.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                <a href=\"LogoutServlet\" class=\"btn btn-primary text-white\"><i class=\"fa-solid fa-right-to-bracket\"></i> logout</a>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty userobj}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"col-md-3\">\n");
        out.write("                <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-right-to-bracket\"></i> Login</a>\n");
        out.write("                <a href=\"register.jsp\" class=\"btn btn-primary text-white\"><i class=\"fa-solid fa-user-plus\"></i> Register</a>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
