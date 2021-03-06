<%-- 
    Document   : locarCarro
    Created on : 31/05/2021, 20:17:35
    Author     : Cabral
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-ui-1.8.18.custom.min.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
        <title>SENAI-PI-LOCADORA</title>
        
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
            <label class="TopdoForm">NOVA LOCA????O DE VEICULO</label><br>
            
            <form method="POST" action='RentalController?action=cadastrarRentalPj' name="frmAddRental">
             <!--<label>Veiculos</label>-->
                <select name="vehicle" class="campo" style="width: 425px" title="Digite o nome do Veiculo.">
                  <c:forEach items="${vehicles}" var="vehicle">
                    <option value="${vehicle.licensePlate}">
                        ${vehicle.licensePlate} -
                        ${vehicle.model.name}-
                        ${vehicle.model.brand.name}   -   -
                        ${vehicle.situationVehicle.name}
                    </option>
                  </c:forEach>
                </select> 
                
                <!--<label>Kilometragem inicial</label>-->
                <input  type="text" name="initialMileage" value="<c:out value="${simuladoRental.initialMileage}" />" class="campo" placeholder="KM atual do veiculo" style="width: 155px" title="Km atual do veiculo."/> <br />
                
                 <!--<label>Cliente PF</label>-->
<!--                <select name="fk_client" class="campo" style="width: 425px" title="Digite o nome do Cliente.">
                  <c:forEach items="${clientPfs}" var="clientPf">
                    <option value="${clientPf.client.id}">
                        ${clientPf.cpf} -
                        ${clientPf.name}                        
                    </option>
                  </c:forEach>
                </select> <br/> -->
                
<!--                 <label>Cliente Pj</label>-->
                <select name="fk_client" class="campo" style="width: 425px" title="Digite o nome do Cliente.">
                  <c:forEach items="${clientPjs}" var="clientPj">
                    <option value="${clientPj.client.id}">
                        ${clientPj.cnpj} 
                        ${clientPj.fantasyName}
                    </option>
                  </c:forEach>
                </select> <br/> 
                
                 <!--<label>Motorista</label>-->
                <select name="driver" class="campo" style="width: 425px" title="Digite o nome do Motorista.">
                  <c:forEach items="${drivers}" var="driver">
                    <option value="${driver.cpf}">
                        ${driver.cpf}- 
                        ${driver.name}
                    </option>
                  </c:forEach>
                </select> <br/> 
            
                 <!--<label>Quantidade de diarias</label>-->
                <input  type="text" name="diarias" value="<c:out value="${simuladoRental.diarias}" />"  class="campo" placeholder="Diarias" style="width: 155px" title="Diarias."/> <br />
            
                
                <!--<br> <button class="btn-editar"> Simular </button> <br>-->
<!--                <br><button class="btn-editar" onclick="window.location.href='RentalController?action=simularRental'" >Simular</button><br>-->
                
                <!--<label>Valor loca????o</label>-->
                <input  type="text" name="priceRental" value="<c:out value="${simuladoRental.calculoTotal}" />" readonly="readonly" class="campo" placeholder="Valor da Loca????o" style="width: 155px" title="Valor de Loca????o."/> <br />
            
                <!--<label>Valor Cau????o</label>-->
                <input  type="text" name="priceGuarantee" value="<c:out value="${simuladoRental.priceGuarantee}" />" readonly="readonly" class="campo" placeholder="Valor da Cau????o" style="width: 155px" title="Valor de Cau????o."/> <br /> 
            
                <!--<label>taxa seguro carro</label>-->
                <input  type="text" name="priceInsuranceRental" value="<c:out value="${simuladoRental.priceInsuranceRental}" />" readonly="readonly" class="campo" placeholder="taxa do Seguro" style="width: 155px" title="Valor do seguro."/> <br />
                
                <!--<label>Valor Total da loca????o</label>-->
                <input  type="text" name="priceTotal" value="<c:out value="${simuladoRental.priceTotal}" />" readonly="readonly" class="campo" placeholder="Total" style="width: 155px" title="TOTAL."/> 
                
                <!--<label>Valor a ser pago pelo seguro do carro</label>-->
                <input  type="text" name="priceInsuranceCar" value="<c:out value="${simuladoRental.priceInsuranceCar}" />" readonly="readonly" class="campo" placeholder="Cobertura Seguro" style="width: 155px" title="Valor maximo da cobertura do  Seguro"/> <br />
                
                <br> <button class="btn" type="submit" value="Submit" > Realizar Loca????o </button>               
                </form>
                <button class="btn-editar" onclick="window.location.href='RentalController?action=simularRentalPj'" >Nova Simula????o</button><br>-->
            
            
<!--            <input type="text" class="campo" style="width: 425px" title="Digite o nome do Veiculo."> <br> 
       <input type="radio" name="identifier" value="PF"> <label class="radio-label" for="PF">PF</label>
       <input type="radio" name="identifier" value="PJ"> <label class="radio-label" for="PJ">PJ</label> <br>
           
       <input type="text" class="campo"  placeholder="Cliente" style="width: 425px" title="Digite o nome do Cliente.">  
       <br> <input type="text" class="campo" value="motoristaLocar" placeholder="Motorista" style="width: 425px" title="Digite o nome do Motorista.">  
      
       <br><input type="date" class="campo" value="dataLocacao" placeholder="Data de Loca????o" style="width: 155px" title="Data de loca????o.">  
           <input type="date" class="campo" value="dataDevolucao" placeholder="Data de Devolu????o" style="width: 155px" title="Data de devolu????o.">  
           <br>
           <br> <button class="btn-editar"> Simular </button> <br>
                                  
                                  
           <input type="number" class="campo" value="diarias" placeholder="Diarias" style="width: 155px" title="Diarias."><br>  
           <input type="number" class="campo" value="valorLocacao" placeholder="Valor da Loca????o" style="width: 155px" title="Valor de Loca????o."> <br>
           <input type="number" class="campo" value="valorCaucao" placeholder="Valor da Cau????o" style="width: 155px" title="Valor de Cau????o."><br>  
           <input type="number" class="campo" value="valorSeguro" placeholder="Valor do Seguro" style="width: 155px" title="Valor do seguro."><br>
           <br>
           <input type="number" class="campo" value="total" placeholder="Total" style="width: 155px" title="TOTAL.">
           <input type="number" class="campo" value="seguroCobertura" placeholder="Cobertura Seguro" style="width: 155px" title="Cobertura Seguro.">
       -->  
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
