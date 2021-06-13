package org.apache.jsp.cliente;

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
      out.write("        <title>SENAI-PI-LOCADORA</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../style.css\">\n");
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
      out.write("                        <li><a href=\"cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"consultar.jsp\">Consultar</a></li>\n");
      out.write("                        <li><a href=\"editar.jsp\">Editar</a></li>\n");
      out.write("                        <li><a href=\"excluir.jsp\">Excluir</a></li>\n");
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
      out.write("                        <li><a href=\"../locadora/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"../locadora/consultar.jsp\">Consultar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul> \n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"conteudo\">\n");
      out.write("            \n");
      out.write("              <label class=\"TopdoForm\">CADASTRAR NOVO CLIENTE (PF)</label><br>\n");
      out.write("              <a href=\"cadastrarPJ.jsp\" class=\"btn-editar\">Cliente (PJ)</a> <br><br>\n");
      out.write("              \n");
      out.write("             \n");
      out.write("             <input type=\"text\" class=\"campo\"    value=\"nome\" placeholder=\"Nome\" style=\"width: 425px\" title=\"Digite seu nome.\">\n");
      out.write("       <br> <input type=\"number\" class=\"campo\"   value=\"rg\" placeholder=\"RG\" style=\"width: 425px\" title=\"Numero do RG.\">\n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     value=\"cpf\" placeholder=\"CPF/CNPJ\" style=\"width: 425px\" title=\"Numero do CPF.\">\n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     value=\"cep\" placeholder=\"CEP\" style=\"width: 250px\" title=\"Informe o CEP.\">\n");
      out.write("            \n");
      out.write("       <br>  <input type=\"text\" class=\"campo\"    value=\"logradouro\" placeholder=\"Rua/Logradouro\" style=\"width: 250px\" title=\"Digite sua rua.\">\n");
      out.write("             <input type=\"number\" class=\"campo\"  value=\"numero\" placeholder=\"N°\" style=\"width: 75px;margin-left:70px;\" title=\"Numero do lote.\">\n");
      out.write("            \n");
      out.write("       <br>  <input type=\"text\" class=\"campo\"    value=\"complemento\" placeholder=\"Complemento\" style=\"width: 425px\" title=\"Complemento(Apartamento, Proximo de... , etc...\">\n");
      out.write("       <br>  <input type=\"text\" class=\"campo\"    value=\"bairro\" placeholder=\"Bairro\" style=\"width: 425px\" title=\"Infome seu Bairro.\">\n");
      out.write("            \n");
      out.write("       <br> <input type=\"text\" class=\"campo\"    value=\"cidade\" placeholder=\"Cidade\" style=\"width: 250px\" title=\"Informe sua Cidade.\">\n");
      out.write("            <input type=\"text\" class=\"campo\"    value=\"uf\" placeholder=\"UF\" style=\"width: 75px;margin-left:70px;\" title=\"Informe UF.\">\n");
      out.write("            \n");
      out.write("       <br> <input type=\"text\" class=\"campo\"    value=\"email\" placeholder=\"E-mail\" style=\"width: 425px\" title=\"Digite seu E-mail.\">\n");
      out.write("       <br> <input type=\"text\" class=\"campo\"    value=\"telefone\" placeholder=\"Telefone\" style=\"width: 425px\" title=\"Informe seu telefone.\">\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("       <br> <button class=\"btn\"> Salvar </button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"gradient footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
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
