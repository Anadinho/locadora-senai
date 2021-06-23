package org.apache.jsp.locadora;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/ui-lightness/jquery-ui-1.8.18.custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-ui-1.8.18.custom.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\"/>\n");
      out.write("        <title>SENAI-PI-LOCADORA</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <img src=\"../assets/background2.webp\" class=\"img blur\" >\n");
      out.write("        \n");
      out.write("        <nav>\n");
      out.write("            \n");
      out.write("            <a href=\"../index.jsp\"> <img class=\"home-img\" src=\"../assets/casa.png\" height=\"70px\"> </a>\n");
      out.write("            \n");
      out.write("            <ul class=\"gradient\">\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    Veiculo\n");
      out.write("                    <ul class=\"dropdown\">\n");
      out.write("                        <li><a href=\"../veiculo/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"../veiculo/consultar.jsp\">Consultar</a></li>\n");
      out.write("                        <li><a href=\"../veiculo/editar.jsp\">Editar</a></li>\n");
      out.write("                        <li><a href=\"../veiculo/excluir.jsp\">Excluir</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    Cliente\n");
      out.write("                    <ul class=\"dropdown\">\n");
      out.write("                        <li><a href=\"../cliente/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"../cliente/consultar.jsp\">Consultar</a></li>\n");
      out.write("                        <li><a href=\"../cliente/editar.jsp\">Editar</a></li>\n");
      out.write("                        <li><a href=\"../cliente/excluir.jsp\">Excluir</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    Motoristas\n");
      out.write("                    <ul class=\"dropdown\">\n");
      out.write("                        <li><a href=\"../motoristas/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"../motoristas/consultar.jsp\">Consultar</a></li>\n");
      out.write("                        <li><a href=\"../motoristas/editar.jsp\">Editar</a></li>\n");
      out.write("                        <li><a href=\"../motoristas/excluir.jsp\">Excluir</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    Locação\n");
      out.write("                    <ul class=\"dropdown\">\n");
      out.write("                        <li><a href=\"cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"consultar.jsp\">Consultar</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul> \n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"conteudo\">\n");
      out.write("            <label class=\"TopdoForm\">NOVA LOCAÇÃO DE VEICULO</label><br>\n");
      out.write("            <input type=\"text\" class=\"campo\" placeholder=\"Veiculo\" style=\"width: 425px\" title=\"Digite o nome do Veiculo.\"> <br> \n");
      out.write("       <input type=\"radio\" name=\"identifier\" value=\"PF\"> <label class=\"radio-label\" for=\"PF\">PF</label>\n");
      out.write("       <input type=\"radio\" name=\"identifier\" value=\"PJ\"> <label class=\"radio-label\" for=\"PJ\">PJ</label> <br>\n");
      out.write("           \n");
      out.write("       <input type=\"text\" class=\"campo\" value=\"clienteLocar\" placeholder=\"Cliente\" style=\"width: 425px\" title=\"Digite o nome do Cliente.\">  \n");
      out.write("       <br> <input type=\"text\" class=\"campo\" value=\"motoristaLocar\" placeholder=\"Motorista\" style=\"width: 425px\" title=\"Digite o nome do Motorista.\">  \n");
      out.write("      \n");
      out.write("       <br><input type=\"date\" class=\"campo\" value=\"dataLocacao\" placeholder=\"Data de Locação\" style=\"width: 155px\" title=\"Data de locação.\">  \n");
      out.write("           <input type=\"date\" class=\"campo\" value=\"dataDevolucao\" placeholder=\"Data de Devolução\" style=\"width: 155px\" title=\"Data de devolução.\">  \n");
      out.write("           <br>\n");
      out.write("           <br> <button class=\"btn-editar\"> Simular </button> <br>\n");
      out.write("                                  \n");
      out.write("                                  \n");
      out.write("           <input type=\"number\" class=\"campo\" value=\"diarias\" placeholder=\"Diarias\" style=\"width: 155px\" title=\"Diarias.\"><br>  \n");
      out.write("           <input type=\"number\" class=\"campo\" value=\"valorLocacao\" placeholder=\"Valor da Locação\" style=\"width: 155px\" title=\"Valor de Locação.\"> <br>\n");
      out.write("           <input type=\"number\" class=\"campo\" value=\"valorCaucao\" placeholder=\"Valor da Caução\" style=\"width: 155px\" title=\"Valor de Caução.\"><br>  \n");
      out.write("           <input type=\"number\" class=\"campo\" value=\"valorSeguro\" placeholder=\"Valor do Seguro\" style=\"width: 155px\" title=\"Valor do seguro.\"><br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"number\" class=\"campo\" value=\"total\" placeholder=\"Total\" style=\"width: 155px\" title=\"TOTAL.\">\n");
      out.write("           <input type=\"number\" class=\"campo\" value=\"seguroCobertura\" placeholder=\"Cobertura Seguro\" style=\"width: 155px\" title=\"Cobertura Seguro.\">\n");
      out.write("       \n");
      out.write("       \n");
      out.write("            \n");
      out.write("     \n");
      out.write("           \n");
      out.write("            \n");
      out.write("       <br> <button class=\"btn\"> Cadastrar Locação </button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"gradient footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
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
}
