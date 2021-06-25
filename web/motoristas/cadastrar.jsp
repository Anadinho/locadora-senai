<%-- 
    Document   : cadastro
    Created on : 31/05/2021, 20:15:57
    Author     : Cabral
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="${pageContext.request.contextPath}/css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-ui-1.8.18.custom.min.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
        
        <title>SENAI-PI-LOCADORA</title>                
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
         <script>
        $(function() {
            $('input[name=cnhValidity]').datepicker();
        });
        </script>
        
        <img src="../assets/background2.webp" class="img blur" >
        
        <nav>
            
            <a href="../index.jsp"> <img class="home-img" src="../assets/casa.png" height="70px"> </a>
            
            <ul class="gradient">
                
              
                
                <li>
                    Veiculo
                    <ul class="dropdown">
                        <li><a href="../veiculo/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../veiculo/consultar.jsp">Consultar</a></li>
                        <li><a href="../veiculo/editar.jsp">Editar</a></li>
                        <li><a href="../veiculo/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a href="ClientPfController?action=cadastrarClientPf">Cadastrar</a></li>
                        <li><a href="ClientPfController?action=listarClientPf">Consultar</a></li>
                        <li><a href="../cliente/editar.jsp">Editar</a></li>
                        <li><a href="../cliente/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Motoristas
                    <ul class="dropdown">
                       <li><a href="DriverController?action=cadastrarDriver">Cadastrar</a></li>
                        <li><a href="DriverController?action=listarDriver">Consultar</a></li>
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Locação
                    <ul class="dropdown">
                        <li><a href="RentalController?action=simularRental">Cadastrar</a></li>
                        <li><a href="RentalController?action=listarRental">Consultar</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>
        
         <div class="conteudo">
            
              <label class="TopdoForm">CADASTRAR NOVO MOTORISTA </label><br>

                <form method="POST" action='DriverController' name="frmAddDriver">

                <input  type="text" name="name" value="<c:out value="${driver.name}" />" class="campo" placeholder="Nome" style="width: 425px" title="Digite seu nome."/> <br />
                 
                <input  type="text" name="identity" value="<c:out value="${driver.identity}" />" class="campo" placeholder="RG" style="width: 425px" title="Numero do RG."/> <br />
                
                <input  type="text" name="cpf" value="<c:out value="${driver.cpf}" />" class="campo"   placeholder="CPF" style="width: 425px" title="Numero do CPF."/> <br /> 
                
                <input  type="text" name="cnh" value="<c:out value="${driver.cnh}" />" class="campo"   placeholder="CNH" style="width: 200px" title="Numero da CNH."/>
                    
                <input  type="text" name="category" value="<c:out value="${driver.category}" />" class="campo"  placeholder="Categoria" style="width: 80px" title="Categoria da CNH."/>
                
                <input   type="text" name="cnhValidity" value="<fmt:formatDate pattern="MM/dd/yyyy" value="${driver.cnhValidity}"/>" class="campo"  placeholder="Validade" style="width: 80px" title="Data de expiração da CNH"/> <br /> 
 
                <input  type="text" name="urlCnh" value="<c:out value="${driver.urlCnh}" />" class="campo"  placeholder="Colocar Update foto cnh" style="width: 130px" title="Local pra update foto cnh"/> <br /> 
                      
                <input  type="text" name="cep" value="<c:out value="${driver.Address.cep}" />" class="campo"  placeholder="CEP" style="width: 250px" title="Informe o CEP."/> <br /> 
                
                <input  type="text" name="logradouro" value="<c:out value="${driver.Address.logradouro}" />" class="campo"  placeholder="Rua/Logradouro" style="width: 250px" title="Digite sua rua."/>

                <input  type="text" name="numberAddress" value="<c:out value="${driver.Address.numberAddress}" />" class="campo"  placeholder="N°" style="width: 75px;margin-left:70px;" title="Numero do lote."/> <br />
                
                <input  type="text" name="complement" value="<c:out value="${driver.Address.complement}" />" class="campo" placeholder="Complemento" style="width: 425px" title="Complemento(Apartamento, Proximo de... , etc..."/> <br />

                <input  type="text" name="district" value="<c:out value="${driver.Address.district}" />" class="campo" placeholder="Bairro" style="width: 425px" title="Infome seu Bairro."/> <br />         
     
                <select name="city" class="campo"    style="width: 250px" title="Informe sua Cidade." >
                  <c:forEach items="${citys}" var="city">
                    <option value="${city.id}">
                        ${city.name} -
                        ${city.uf.uf} 
                    </option>
                  </c:forEach>
                </select> <br/>                    
                
                <input  type="text" name="email" value="<c:out value="${driver.contact.telephone}" />" class="campo" placeholder="E-mail" style="width: 425px" title="Digite seu E-mail."/> <br /> 
     
                <input  type="text" name="telephone" value="<c:out value="${driver.contact.email}" />" class="campo" placeholder="Telefone" style="width: 425px" title="Informe seu telefone."/> <br /> 
               <button  class="btn" type="submit" value="Submit" > Cadastrar </button>
 
      </form>
             
              
             
<!--        <input type="text" class="campo" placeholder="Nome" style="width: 425px" title="Digite seu nome.">
       <br> <input type="number" class="campo" placeholder="RG" style="width: 425px" title="Numero do RG.">
       <br> <input type="text" class="campo"   placeholder="CPF/CNPJ" style="width: 425px" title="Numero do CPF.">
       <br> <button class="btn-editar"> Importar Foto CNH </button>
       <input type="text" class="campo"  placeholder="Validade" style="width: 75" title="Data de expiração da CNH">
       <input type="text" class="campo"  placeholder="Categoria" style="width: 60px" title="Categoria da CNH.">
       
       
       <br>  <input type="text" class="campo"  placeholder="CEP" style="width: 250px" title="Informe o CEP.">     
       <br>  <input type="text" class="campo"  placeholder="Rua/Logradouro" style="width: 250px" title="Digite sua rua.">
             <input type="number" class="campo"  placeholder="N°" style="width: 75px;margin-left:70px;" title="Numero do lote.">
            
       <br>  <input type="text" class="campo" placeholder="Complemento" style="width: 425px" title="Complemento(Apartamento, Proximo de... , etc...">
       <br>  <input type="text" class="campo" placeholder="Bairro" style="width: 425px" title="Infome seu Bairro.">
            
       <br> <input type="text" class="campo"    style="width: 250px" title="Informe sua Cidade.">
            <input type="text" class="campo"    value="uf" placeholder="UF" style="width: 75px;margin-left:70px;" title="Informe UF.">
            
       <br> <input type="text" class="campo" placeholder="E-mail" style="width: 425px" title="Digite seu E-mail.">
       <br> <input type="text" class="campo" placeholder="Telefone" style="width: 425px" title="Informe seu telefone.">
            
           
            
       <br> <button class="btn"> Salvar </button>-->
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
