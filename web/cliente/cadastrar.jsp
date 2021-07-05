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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SENAI-PI-LOCADORA</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
    </head>
    <body>
        
        <img src="${pageContext.request.contextPath}/assets/background2.webp" class="img blur" >
        
        <nav>
            
            <a  href="${pageContext.request.contextPath}/index.jsp"> <img class="home-img" src="${pageContext.request.contextPath}/assets/casa.png" height="90px"> </a>
            
            <ul class="gradient">
                
                
                  <li> 
                  <a  href="${pageContext.request.contextPath}/index.jsp"> INICIO </a>
                  </li>
              
                
                <li>                   
                    Veiculo
                    <ul class="dropdown">
                        <li><a href="VehicleController?action=cadastrarVehicle">Cadastrar</a></li>
                        <li><a href="VehicleController?action=listarVehicle">Consultar</a></li>
                        
                    </ul>
                </li>
                <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a href="ClientPfController?action=cadastrarClientPf">Cadastrar</a></li>
                        <li><a href="ClientPfController?action=listarClientPf">Consultar</a></li>
                        
                    </ul>
                </li>
                <li>
                    Motoristas
                    <ul class="dropdown">
                        <li><a href="DriverController?action=cadastrarDriver">Cadastrar</a></li>
                        <li><a href="DriverController?action=listarDriver">Consultar</a></li>
                       
                    </ul>
                </li>
                <li>
                    Locação
                    <ul class="dropdown">
                        <li><a href="RentalController?action=simularRental">Locação-PF</a></li>
                         <li><a href="RentalController?action=simularRentalPj">Locação - Pj</a></li>
                        <li><a href="RentalController?action=listarRental">Consultar-PF</a></li>
                        <li><a href="RentalController?action=listarRentalPj">Consultar-PJ</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>
        
        
        <div class="conteudo">
            
              <label class="TopdoForm">CADASTRAR NOVO CLIENTE (PF)</label><br>
              <a href="ClientPjController?action=cadastrarClientPj" class="btn-editar">Cliente (PJ)</a> <br><br>
              
         
            <div>
                <form method="POST" action='ClientPfController' name="frmAddClientPf">
                
                
                 
                <input  type="text" name="name" value="<c:out value="${clientPf.name}"  />" class="campo"     placeholder="Nome" style="width: 425px" title="Digite seu nome."/> <br />
                
               
                <input  type="text" name="identity" value="<c:out value="${clientPf.identity}" />" class="campo"    placeholder="RG" style="width: 425px" title="Numero do RG."/> <br />
                
                
                <input  type="text" name="cpf" value="<c:out value="${clientPf.cpf}" />" class="campo" placeholder="CPF/CNPJ" style="width: 425px" title="Numero do CPF."/> <br /> 
                
                
                <input  type="text" name="cep" value="<c:out value="${clientPf.Address.name}" />" class="campo"      placeholder="CEP" style="width: 250px" title="Informe o CEP."/> <br /> 
                
                
                <input  type="text" name="logradouro" value="<c:out value="${clientPf.Address.logradouro}" />" class="campo"     placeholder="Rua/Logradouro" style="width: 250px" title="Digite sua rua."/>
                
                <input  type="text" name="numberAddress" value="<c:out value="${clientPf.Address.numberAddress}" />" class="campo"   placeholder="N°" style="width: 75px;margin-left:70px;" title="Numero do lote."/> <br />
                
                <input  type="text" name="complement" value="<c:out value="${clientPf.Address.complement}" />" class="campo"     placeholder="Complemento" style="width: 425px" title="Complemento(Apartamento, Proximo de... , etc..."/> <br />
                
                <input  type="text" name="district" value="<c:out value="${clientPf.Address.district}" />" class="campo"     placeholder="Bairro" style="width: 425px" title="Infome seu Bairro."/> <br />         
                

                <select name="city"  class="campo" style="width: 250px" title="Informe sua Cidade.">
                  <c:forEach items="${citys}" var="city">
                    <option value="${city.id}">
                        ${city.name} -
                        ${city.uf.uf} 
                    </option>
                  </c:forEach>
                </select> <br/>          
                
                
                <input  type="text" name="email" value="<c:out value="${ClientPf.contact.telephone}" />" class="campo"     placeholder="E-mail" style="width: 425px" title="Digite seu E-mail."/> <br /> 
                
                
                <input  type="text" name="telephone" value="<c:out value="${ClientPf.contact.email}" />" class="campo"     placeholder="Telefone" style="width: 425px" title="Informe seu telefone."/> <br /> 
               
                <br> <button class="btn" type="submit" value="Submit" > Cadastrar </button>
      </form>
       </div>

        <!--<button onclick="window.location.href='ClientPfController?action=cadastrarClientPf'" >Atualizar lista cidade</button>-->      
        
              
             
<!--        <input type="text" class="campo"    value="nome" placeholder="Nome" style="width: 425px" title="Digite seu nome.">
       <br> <input type="number" class="campo"   value="rg" placeholder="RG" style="width: 425px" title="Numero do RG.">
       <br> <input type="text" class="campo"     value="cpf" placeholder="CPF/CNPJ" style="width: 425px" title="Numero do CPF.">
       <br> <input type="text" class="campo"     value="cep" placeholder="CEP" style="width: 250px" title="Informe o CEP.">            
       <br>  <input type="text" class="campo"    value="logradouro" placeholder="Rua/Logradouro" style="width: 250px" title="Digite sua rua.">
       <input type="number" class="campo"  value="numero" placeholder="N°" style="width: 75px;margin-left:70px;" title="Numero do lote.">
            
       <br>  <input type="text" class="campo"    value="complemento" placeholder="Complemento" style="width: 425px" title="Complemento(Apartamento, Proximo de... , etc...">
       <br>  <input type="text" class="campo"     placeholder="Bairro" style="width: 425px" title="Infome seu Bairro.">
            
       <br> <input type="text" class="campo"     placeholder="Cidade" style="width: 250px" title="Informe sua Cidade.">
            <input type="text" class="campo"    value="uf" placeholder="UF" style="width: 75px;margin-left:70px;" title="Informe UF.">
            
       <br> <input type="text" class="campo"     placeholder="E-mail" style="width: 425px" title="Digite seu E-mail.">
       <br> <input type="text" class="campo"     placeholder="Telefone" style="width: 425px" title="Informe seu telefone.">-->
          
           
            
       
       <!--<button class="btn"> Salvar </button>-->
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>