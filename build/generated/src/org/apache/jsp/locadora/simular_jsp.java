package org.apache.jsp.locadora;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class simular_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("            <form method=\"POST\" action='RentalController?action=simularRental' name=\"frmAddRental\">\n");
      out.write("             <!--<label>Veiculos</label>-->\n");
      out.write("                <select name=\"vehicle\" class=\"campo\" style=\"width: 425px\" title=\"Digite o nome do Veiculo.\">\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select> <br/>\n");
      out.write("                \n");
      out.write("                 <!--<label>Cliente PF</label>-->\n");
      out.write("                <select name=\"fk_client\" class=\"campo\" style=\"width: 425px\" title=\"Digite o nome do Cliente.\">\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select> <br/> \n");
      out.write("                \n");
      out.write("<!--                 <label>Cliente Pj</label>\n");
      out.write("                <select name=\"clientPj\" >\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select> <br/> -->\n");
      out.write("                \n");
      out.write("                 <!--<label>Motorista</label>-->\n");
      out.write("                <select name=\"driver\" class=\"campo\" style=\"width: 425px\" title=\"Digite o nome do Motorista.\">\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select> <br/> \n");
      out.write("            \n");
      out.write("                 <!--<label>Quantidade de diarias</label>-->\n");
      out.write("                <input  type=\"text\" name=\"diarias\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"  class=\"campo\" placeholder=\"Diarias\" style=\"width: 155px\" title=\"Diarias.\"/> <br />\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                <br> <button class=\"btn-editar\"> Simular </button> <br>\n");
      out.write("                \n");
      out.write("                <!--<label>Valor locação</label>-->\n");
      out.write("                <input  type=\"text\" name=\"priceRental\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" readonly=\"readonly\" class=\"campo\" placeholder=\"Valor da Locação\" style=\"width: 155px\" title=\"Valor de Locação.\"/> <br />\n");
      out.write("            \n");
      out.write("                <!--<label>Valor Caução</label>-->\n");
      out.write("                <input  type=\"text\" name=\"priceGuarantee\" value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\" readonly=\"readonly\" class=\"campo\" placeholder=\"Valor da Caução\" style=\"width: 155px\" title=\"Valor de Caução.\"/> <br /> \n");
      out.write("            \n");
      out.write("                <!--<label>taxa seguro carro</label>-->\n");
      out.write("                <input  type=\"text\" name=\"priceInsuranceRental\" value=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\" readonly=\"readonly\" class=\"campo\" placeholder=\"taxa do Seguro\" style=\"width: 155px\" title=\"Valor do seguro.\"/> <br />\n");
      out.write("                \n");
      out.write("                <!--<label>Valor Total da locação</label>-->\n");
      out.write("                <input  type=\"text\" name=\"priceTotal\" value=\"");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("\" readonly=\"readonly\" class=\"campo\" placeholder=\"Total\" style=\"width: 155px\" title=\"TOTAL.\"/> \n");
      out.write("                \n");
      out.write("                <!--<label>Valor a ser pago pelo seguro do carro</label>-->\n");
      out.write("                <input  type=\"text\" name=\"priceInsuranceCar\" value=\"");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("\" readonly=\"readonly\" class=\"campo\" placeholder=\"Cobertura Seguro\" style=\"width: 155px\" title=\"Valor maximo da cobertura do  Seguro\"/> <br />\n");
      out.write("                \n");
      out.write("                <br> <button class=\"btn\" type=\"submit\" value=\"Submit\" > Realizar Locação </button>\n");
      out.write("               \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("<!--            <input type=\"text\" class=\"campo\" style=\"width: 425px\" title=\"Digite o nome do Veiculo.\"> <br> \n");
      out.write("       <input type=\"radio\" name=\"identifier\" value=\"PF\"> <label class=\"radio-label\" for=\"PF\">PF</label>\n");
      out.write("       <input type=\"radio\" name=\"identifier\" value=\"PJ\"> <label class=\"radio-label\" for=\"PJ\">PJ</label> <br>\n");
      out.write("           \n");
      out.write("       <input type=\"text\" class=\"campo\"  placeholder=\"Cliente\" style=\"width: 425px\" title=\"Digite o nome do Cliente.\">  \n");
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
      out.write("       -->  \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("vehicle");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.licensePlate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.licensePlate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" -\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.model.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("-\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.model.brand.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPfs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("clientPf");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.client.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" -\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPf.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("                        \n");
          out.write("                    </option>\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPjs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("clientPj");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPj.cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPj.cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientPj.fantasyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </option>\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${drivers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("driver");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${driver.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${driver.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("- \n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${driver.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </option>\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${simuladoRental.diarias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${simuladoRental.calculoTotal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${simuladoRental.priceGuarantee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${simuladoRental.priceInsuranceRental}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${simuladoRental.priceTotal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${simuladoRental.priceInsuranceCar}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }
}
