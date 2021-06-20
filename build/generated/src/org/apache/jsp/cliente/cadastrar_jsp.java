package org.apache.jsp.cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("        <title>SENAI-PI-LOCADORA</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\"/>\n");
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
      out.write("                        <li><a href=\"VehicleController?action=cadastrarVehicle\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"VehicleController?action=listarVehicle\">Consultar</a></li>\n");
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
      out.write("         \n");
      out.write("            <div>\n");
      out.write("                <form method=\"POST\" action='ClientPfController' name=\"frmAddCorrida\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                <input  type=\"text\" name=\"name\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"     placeholder=\"Nome\" style=\"width: 425px\" title=\"Digite seu nome.\"/> <br />\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <input  type=\"text\" name=\"identity\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"    placeholder=\"RG\" style=\"width: 425px\" title=\"Numero do RG.\"/> <br />\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"cpf\" value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\" class=\"campo\" placeholder=\"CPF/CNPJ\" style=\"width: 425px\" title=\"Numero do CPF.\"/> <br /> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"cep\" value=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"      placeholder=\"CEP\" style=\"width: 250px\" title=\"Informe o CEP.\"/> <br /> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"logradouro\" value=\"");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"     placeholder=\"Rua/Logradouro\" style=\"width: 250px\" title=\"Digite sua rua.\"/>\n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"numberAddress\" value=\"");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"   placeholder=\"N°\" style=\"width: 75px;margin-left:70px;\" title=\"Numero do lote.\"/> <br />\n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"complement\" value=\"");
      if (_jspx_meth_c_out_6(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"     placeholder=\"Complemento\" style=\"width: 425px\" title=\"Complemento(Apartamento, Proximo de... , etc...\"/> <br />\n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"district\" value=\"");
      if (_jspx_meth_c_out_7(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"     placeholder=\"Bairro\" style=\"width: 425px\" title=\"Infome seu Bairro.\"/> <br />         \n");
      out.write("                \n");
      out.write("<!--                <label>Cidade</label>-->\n");
      out.write("                <select name=\"city\"  class=\"campo\" style=\"width: 250px\" title=\"Informe sua Cidade.\">\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select> <br/>          \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"email\" value=\"");
      if (_jspx_meth_c_out_8(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"     placeholder=\"E-mail\" style=\"width: 425px\" title=\"Digite seu E-mail.\"/> <br /> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input  type=\"text\" name=\"telephone\" value=\"");
      if (_jspx_meth_c_out_9(_jspx_page_context))
        return;
      out.write("\" class=\"campo\"     placeholder=\"Telefone\" style=\"width: 425px\" title=\"Informe seu telefone.\"/> <br /> \n");
      out.write("               <button type=\"submit\" value=\"Submit\" > Cadastrar </button>\n");
      out.write(" \n");
      out.write("      </form>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("        <button onclick=\"window.location.href='ClientPfController?action=cadastrarClientPf'\" >Atualizar lista cidade</button>      \n");
      out.write("        \n");
      out.write("              \n");
      out.write("             \n");
      out.write("<!--        <input type=\"text\" class=\"campo\"    value=\"nome\" placeholder=\"Nome\" style=\"width: 425px\" title=\"Digite seu nome.\">\n");
      out.write("       <br> <input type=\"number\" class=\"campo\"   value=\"rg\" placeholder=\"RG\" style=\"width: 425px\" title=\"Numero do RG.\">\n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     value=\"cpf\" placeholder=\"CPF/CNPJ\" style=\"width: 425px\" title=\"Numero do CPF.\">\n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     value=\"cep\" placeholder=\"CEP\" style=\"width: 250px\" title=\"Informe o CEP.\">            \n");
      out.write("       <br>  <input type=\"text\" class=\"campo\"    value=\"logradouro\" placeholder=\"Rua/Logradouro\" style=\"width: 250px\" title=\"Digite sua rua.\">\n");
      out.write("       <input type=\"number\" class=\"campo\"  value=\"numero\" placeholder=\"N°\" style=\"width: 75px;margin-left:70px;\" title=\"Numero do lote.\">\n");
      out.write("            \n");
      out.write("       <br>  <input type=\"text\" class=\"campo\"    value=\"complemento\" placeholder=\"Complemento\" style=\"width: 425px\" title=\"Complemento(Apartamento, Proximo de... , etc...\">\n");
      out.write("       <br>  <input type=\"text\" class=\"campo\"     placeholder=\"Bairro\" style=\"width: 425px\" title=\"Infome seu Bairro.\">\n");
      out.write("            \n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     placeholder=\"Cidade\" style=\"width: 250px\" title=\"Informe sua Cidade.\">\n");
      out.write("            <input type=\"text\" class=\"campo\"    value=\"uf\" placeholder=\"UF\" style=\"width: 75px;margin-left:70px;\" title=\"Informe UF.\">\n");
      out.write("            \n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     placeholder=\"E-mail\" style=\"width: 425px\" title=\"Digite seu E-mail.\">\n");
      out.write("       <br> <input type=\"text\" class=\"campo\"     placeholder=\"Telefone\" style=\"width: 425px\" title=\"Informe seu telefone.\">-->\n");
      out.write("          \n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.identity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.Address.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.Address.logradouro}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.Address.numberAddress}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent(null);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.Address.complement}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent(null);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.Address.district}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${citys}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("city");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" -\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city.uf.uf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                    </option>\n");
          out.write("                  ");
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

  private boolean _jspx_meth_c_out_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent(null);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ClientPf.contact.telephone}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent(null);
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ClientPf.contact.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }
}
