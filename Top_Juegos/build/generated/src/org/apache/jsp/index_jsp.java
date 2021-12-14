package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\"/>\n");
      out.write("         <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12\">\n");
      out.write("                    <nav>\n");
      out.write("                        <div class=\"nav-wrapper\">\n");
      out.write("                            <a href=\"#!\" class=\"brand-logo\">Logo</a>\n");
      out.write("                            <a href=\"#\" data-target=\"mobile-demo\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                            <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                                <li><a href=\"sass.html\">Sass</a></li>\n");
      out.write("                                <li><a href=\"badges.html\">Components</a></li>\n");
      out.write("                                <li><a href=\"collapsible.html\">Javascript</a></li>\n");
      out.write("                                <li><a href=\"mobile.html\">Mobile</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <ul class=\"sidenav\" id=\"mobile-demo\">\n");
      out.write("                        <li><a href=\"sass.html\">Sass</a></li>\n");
      out.write("                        <li><a href=\"badges.html\">Components</a></li>\n");
      out.write("                        <li><a href=\"collapsible.html\">Javascript</a></li>\n");
      out.write("                        <li><a href=\"mobile.html\">Mobile</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12\">\n");
      out.write("                    <img src=\"imagen/imagen_1.jpg\" class=\"responsive-img\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 m6 l4\">\n");
      out.write("                    <h1>NOTICIA 1</h1>\n");
      out.write("                    <img src=\"imagen/d8345-1-152437-1.jpg\" alt=\"\"/>\n");
      out.write("                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Commodi quidem sequi minus nemo deleniti exercitationem vel fugit nam repellendus possimus. Inventore illo, sequi repellat expedita non odit maiores dolorem quidem?</p><p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Commodi quidem sequi minus nemo deleniti exercitationem vel fugit nam repellendus possimus. Inventore illo, sequi repellat expedita non odit maiores dolorem quidem?</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 m6 l4\">\n");
      out.write("                    <h1>NOTICIA 2</h1>\n");
      out.write("                    <img src=\"imagen/d8345-1-152437-1.jpg\" alt=\"\"/>\n");
      out.write("                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Commodi quidem sequi minus nemo deleniti exercitationem vel fugit nam repellendus possimus. Inventore illo, sequi repellat expedita non odit maiores dolorem quidem?</p><p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Commodi quidem sequi minus nemo deleniti exercitationem vel fugit nam repellendus possimus. Inventore illo, sequi repellat expedita non odit maiores dolorem quidem?</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 m12 l4\">\n");
      out.write("                    <h1>NOTICIA 3</h1>\n");
      out.write("                    <img src=\"imagen/d8345-1-152437-1.jpg\" alt=\"\"/>\n");
      out.write("                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Commodi quidem sequi minus nemo deleniti exercitationem vel fugit nam repellendus possimus. Inventore illo, sequi repellat expedita non odit maiores dolorem quidem?</p><p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Commodi quidem sequi minus nemo deleniti exercitationem vel fugit nam repellendus possimus. Inventore illo, sequi repellat expedita non odit maiores dolorem quidem?</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 m6 l6\">\n");
      out.write("                    <h1>pie 1</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 m6 l6\">\n");
      out.write("                    <form action=\"registro?action=insert\" method=\"POST\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <i class=\"material-icons prefix\">brightness_7</i>\n");
      out.write("                            <input type=\"text\" id=\"autocomplete-input\" class=\"autocomplete\">\n");
      out.write("                            <label for=\"autocomplete-input\">Nombre</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <i class=\"material-icons prefix\">flare</i>\n");
      out.write("                            <input type=\"text\" id=\"autocomplete-input\" class=\"autocomplete\">\n");
      out.write("                            <label for=\"autocomplete-input\">Apellido</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <i class=\"material-icons prefix\">flare</i>\n");
      out.write("                            <input type=\"number\" id=\"autocomplete-input\" class=\"autocomplete\">\n");
      out.write("                            <label for=\"autocomplete-input\">edad</label>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"waves-effect waves-light btn\"><i class=\"material-icons right\">cloud</i>button</a>\n");
      out.write("        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 l2 m2\">\n");
      out.write("                    <h1>1</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 l2 m2\">\n");
      out.write("                    <h1>2</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 l2 m2\">\n");
      out.write("                    <h1>3</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 l2 m2\">\n");
      out.write("                    <h1>4</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 l2 m2\">\n");
      out.write("                    <h1>5</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s12 l2 m2\">\n");
      out.write("                    <h1>6</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                M.AutoInit();\n");
      out.write("  });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
