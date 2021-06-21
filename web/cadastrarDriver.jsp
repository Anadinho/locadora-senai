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
        <link type="text/css" href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
        <link type="text/css" href="css/style.css" rel="stylesheet" />
        <title>Cadastro Driver</title>
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
    </head>
    <body>
        <script>
        $(function() {
            $('input[name=cnhValidity]').datepicker();
        });
        </script>
            <label>Cadastro Driver</label>  
            <div>
                <form method="POST" action='DriverController' name="frmAddDriver">
                
                
                <label>Nome</label>
                <input  type="text" name="name" value="<c:out value="${driver.name}" />"/> <br />
                
                <label>Identidade</label>
                <input  type="text" name="identity" value="<c:out value="${driver.identity}" />"/> <br />
                
                <label>cpf</label>
                <input  type="text" name="cpf" value="<c:out value="${driver.cpf}" />"/> <br /> 
                
                <label>cnh</label>
                <input  type="text" name="cnh" value="<c:out value="${driver.cnh}" />"/> <br />
                
                <label>Categoria</label>
                <input  type="text" name="category" value="<c:out value="${driver.category}" />"/> <br /> 
                
                <label>Validade Cnh </label> 
                <input   type="text" name="cnhValidity" value="<fmt:formatDate pattern="MM/dd/yyyy" value="${driver.cnhValidity}"/>" /> <br /> 

                 <label>URLCNH</label>
                <input  type="text" name="urlCnh" value="<c:out value="${driver.urlCnh}" />"/> <br /> 
                
                 <label>cep</label>
                <input  type="text" name="cep" value="<c:out value="${driver.Address.cep}" />"/> <br /> 
                
                 <label>logradouro</label>
                <input  type="text" name="logradouro" value="<c:out value="${driver.Address.logradouro}" />"/> <br />
                
                 <label>complemento</label>
                <input  type="text" name="complement" value="<c:out value="${driver.Address.complement}" />"/> <br />
                
                <label>Numero</label>
                <input  type="text" name="numberAddress" value="<c:out value="${driver.Address.numberAddress}" />"/> <br />
                
                   <label>Bairro</label>
                <input  type="text" name="district" value="<c:out value="${driver.Address.district}" />"/> <br />         
                
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
                <input  type="text" name="email" value="<c:out value="${driver.contact.telephone}" />"/> <br /> 
                
                 <label> Telefone</label>
                <input  type="text" name="telephone" value="<c:out value="${driver.contact.email}" />"/> <br /> 
               <button type="submit" value="Submit" > Cadastrar </button>
 
      </form>
       </div>

        <button onclick="window.location.href='DriverController?action=cadastrarDriver'" >Atualizar lista cidade</button>

    </body>
</html>
