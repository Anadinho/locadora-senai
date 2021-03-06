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
            
            <a href="${pageContext.request.contextPath}/index.jsp"> <img class="home-img" src="${pageContext.request.contextPath}/assets/casa.png" height="70px"> </a>
            
            <ul class="gradient">
                
              
                
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
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
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
                    Loca????o
                    <ul class="dropdown">
                        <li><a href="RentalController?action=simularRental">Loca????o-PF</a></li>
                         <li><a href="RentalController?action=simularRentalPj">Loca????o - Pj</a></li>
                        <li><a href="RentalController?action=listarRental">Consultar-PF</a></li>
                        <li><a href="RentalController?action=listarRentalPj">Consultar-PJ</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>
        
        
        <div class="conteudo">
               
            
        <label class="TopdoForm">CADASTRAR NOVO CLIENTE (PJ)</label><br>
        <a href="ClientPfController?action=cadastrarClientPf" class="btn-editar">Cliente (PF)</a> <br><br>
               
            <div>
                <form method="POST" action='ClientPjController' name="frmAddClientPj">
                
                
                 
                <input  type="text" name="fantasyName" value="<c:out value="${clientPj.fantasyName}" />" class="campo" placeholder="Nome Fantasia" style="width: 425px" title="Informar Nome Fantasia."/> <br />
                
                
                <input  type="text" name="razaoSocial" value="<c:out value="${clientPj.razaoSocial}" />" class="campo"    placeholder="Raz??o Social" style="width: 425px" title="Informar Raz??o social."/> <br />
                
             
                <input  type="text" name="cnpj" value="<c:out value="${clientPj.cnpj}" />" class="campo"  placeholder="CNPJ" style="width: 425px" title="Informar CNPJ."/> <br /> 
                
               
                <input  type="text" name="cep" value="<c:out value="${clientPj.Address.name}" />" class="campo"  placeholder="CEP" style="width: 250px" title="Informe o CEP."/> <br /> 
                
                
                <input  type="text" name="logradouro" value="<c:out value="${clientPj.Address.logradouro}" />" class="campo" placeholder="Rua/Logradouro" style="width: 250px" title="Digite sua rua."/>
                
                <input  type="text" name="numberAddress" value="<c:out value="${clientPj.Address.numberAddress}" />" class="campo"     placeholder="N??" style="width: 75px;margin-left:70px;" title="Numero do lote."/> <br />
                
                <input  type="text" name="complement" value="<c:out value="${clientPj.Address.complement}" />" class="campo" placeholder="Complemento" style="width: 425px" title="Complemento(Apartamento, Proximo de... , etc..."/> <br />
                

                <input  type="text" name="district" value="<c:out value="${clientPj.Address.district}" />" class="campo" placeholder="Bairro" style="width: 425px" title="Infome seu Bairro."/> <br />         
                      
                <select name="city" class="campo"   style="width: 250px" title="Informe sua Cidade.">
                  <c:forEach items="${citys}" var="city">
                    <option value="${city.id}">
                        ${city.name} -
                        ${city.uf.uf} 
                    </option>
                  </c:forEach>
                </select> <br/>          
                
                <input  type="text" name="email" value="<c:out value="${ClientPj.contact.telephone}" />" class="campo" placeholder="E-mail" style="width: 425px" title="Digite seu E-mail."/> <br /> 
                
                <input  type="text" name="telephone" value="<c:out value="${ClientPj.contact.email}" />" class="campo" placeholder="Telefone" style="width: 425px" title="Informe seu telefone."/> <br /> 
               <button class="btn" type="submit" value="Submit" > Cadastrar </button>
 
      </form>
       </div>

<!--        <button onclick="window.location.href='ClientPjController?action=cadastrarClientPj'" >Atualizar lista cidade</button>      -->
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>