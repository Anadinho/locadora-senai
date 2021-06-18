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
                <form method="POST" action='ClientPjController' name="frmAddClientPj">
                
                
                 <label>Nome Fantasia</label>
                <input  type="text" name="fantasyName" value="<c:out value="${clientPj.fantasyName}" />"/> <br />
                
                <label>Razao Social</label>
                <input  type="text" name="razaoSocial" value="<c:out value="${clientPj.razaoSocial}" />"/> <br />
                
                 <label>cnpj</label>
                <input  type="text" name="cnpj" value="<c:out value="${clientPj.cnpj}" />"/> <br /> 
                
                 <label>cep</label>
                <input  type="text" name="cep" value="<c:out value="${clientPj.Address.name}" />"/> <br /> 
                
                 <label>logradouro</label>
                <input  type="text" name="logradouro" value="<c:out value="${clientPj.Address.logradouro}" />"/> <br />
                
                 <label>complemento</label>
                <input  type="text" name="complement" value="<c:out value="${clientPj.Address.complement}" />"/> <br />
                
                <label>Numero</label>
                <input  type="text" name="numberAddress" value="<c:out value="${clientPj.Address.numberAddress}" />"/> <br />
                
                   <label>Bairro</label>
                <input  type="text" name="district" value="<c:out value="${clientPj.Address.district}" />"/> <br />         
                
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
                <input  type="text" name="email" value="<c:out value="${ClientPj.contact.telephone}" />"/> <br /> 
                
                 <label> Telefone</label>
                <input  type="text" name="telephone" value="<c:out value="${ClientPj.contact.email}" />"/> <br /> 
               <button type="submit" value="Submit" > Cadastrar </button>
 
      </form>
       </div>

        <button onclick="window.location.href='ClientPjController?action=cadastrarClientPj'" >Atualizar lista cidade</button>

    </body>
</html>
