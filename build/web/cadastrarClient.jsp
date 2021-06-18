<%-- 

    Created on : 10/05/2021, 18:41:56
    Author     : suporte
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <!--<link type="text/css" href="css/style.css" rel="stylesheet" />-->
        <title>Lista </title>
    </head>
    <body>
            <label>Cadastro Cliente Pf</label>  
            <div>
                <form method="POST" action='ClientPfController' name="frmAddCorrida">
                
                
                 <label>Nome</label>
                <input  type="text" name="name" value="<c:out value="${clientPf.name}" />"/> <br />
                
                <label>Identidade</label>
                <input  type="text" name="identity" value="<c:out value="${clientPf.identity}" />"/> <br />
                
                 <label>cpf</label>
                <input  type="text" name="cpf" value="<c:out value="${clientPf.cpf}" />"/> <br /> 
                
                 <label>cep</label>
                <input  type="text" name="cep" value="<c:out value="${clientPf.Address.name}" />"/> <br /> 
                
                 <label>logradouro</label>
                <input  type="text" name="logradouro" value="<c:out value="${clientPf.Address.logradouro}" />"/> <br />
                
                 <label>complemento</label>
                <input  type="text" name="complement" value="<c:out value="${clientPf.Address.complement}" />"/> <br />
                
                <label>Numero</label>
                <input  type="text" name="numberAddress" value="<c:out value="${clientPf.Address.numberAddress}" />"/> <br />
                
                   <label>Bairro</label>
                <input  type="text" name="district" value="<c:out value="${clientPf.Address.district}" />"/> <br />         
                
                <label>Cidade</label>
                <select name="city" >
                  <c:forEach items="${citys}" var="city">
                    <option value="${city.id}">
                        ${city.name} -
                        ${city.uf.uf} 
                    </option>
                  </c:forEach>
                </select> <br/>          
                
                <label> Email</label>
                <input  type="text" name="email" value="<c:out value="${ClientPf.contact.telephone}" />"/> <br /> 
                
                 <label> Telefone</label>
                <input  type="text" name="telephone" value="<c:out value="${ClientPf.contact.email}" />"/> <br /> 
               <button type="submit" value="Submit" > Cadastrar </button>
 
      </form>
       </div>

        <button onclick="window.location.href='ClientPfController?action=cadastrarClientPf'" >Atualizar lista cidade</button>

    </body>
</html>
