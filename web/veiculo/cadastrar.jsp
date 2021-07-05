<%-- 
    Document   : cadastrar
    Created on : 31/05/2021, 20:08:43
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
            
            <label class="TopdoForm">CADASTRAR NOVO VEICULO</label><br>
            
            
            
            <form method="POST" action='VehicleController' name="frmAddVehicle">
                
                
                <input  type="text" name="licensePlate" value="<c:out value="${vehicle.licensePlate}" />" class="campo"  placeholder="Placa" style="width: 150px" title="Informar a placa do veiculo."/>
                
                
                <select name="model"  class="campo" style="width: 150px;margin-left:20px" title="Informar o modelo do veiculo." >
                  <c:forEach items="${models}" var="model">
                    <option value="${model.id}">
                        ${model.name}
                        -
                        ${model.brand.name}
                    </option>
                  </c:forEach>
                </select> 
                <br/>                
                
                <input  type="text" name="renavam" value="<c:out value="${vehicle.renavam}" />" class="campo"  placeholder="Renavam(Numeros)" style="width: 150px" title="Informe o renavam."/>
                
                <select name="vehicleType" class="campo"   style="width: 150px;margin-left:20px" title="Informe o tipo do veiculo." >
                  <c:forEach items="${vehicleTypes}" var="vehicleType">
                    <option value="${vehicleType.id}">
                        ${vehicleType.name} 
                    </option>
                  </c:forEach>
                </select> 
                
                <select name="category" class="campo"   style="width: 150px;margin-left:42px" title="Informe a categoria do veiculo.">
                  <c:forEach items="${categorys}" var="category">
                    <option value="${category.id}">
                        ${category.name} 
                    </option>
                  </c:forEach>
                </select> 
                <br/> 
                
                <input  type="text" name="yearFabrication" value="<c:out value="${vehicle.yearFabrication}" />" class="campo"  placeholder="anoFabricacao" style="width: 150px" title="Informe o ano de fabricação do veiculo."/>
                
                <input  type="text" name="yearModel" value="<c:out value="${vehicle.yearModel}" />" class="campo"  placeholder="anoModelo" style="width: 150px;margin-left:220px" title="Informe o ano modelo do veiculo."/> <br />
                
                <input  type="text" name="buyPrice" value="<c:out value="${vehicle.buyPrice}" />" class="campo"  placeholder="Preço de Compra" style="width: 150px" title="Informe preço de compra do veiculo."/> 
                
                <input  type="text" name="salePrice" value="<c:out value="${vehicle.salePrice}" />" class="campo"  placeholder="Preço de Venda" style="width: 150px;margin-left:220px" title="Informe o apreço de venda do veiculo."/> <br />
                             
                <input  type="text" name="numberPassengers" value="<c:out value="${vehicle.numberPassengers}" />" class="campo"  placeholder="Nro de passageiros" style="width: 250px" title="Informe a quantidade de assentos/passageiros."/> <br />
   
                <input  type="text" name="typeFuel" value="<c:out value="${vehicle.typeFuel}" />" class="campo"  placeholder="Combustivel" style="width: 250px" title="Informe o combustivel utilizado."/> <br />
                        
                <input  type="text" name="mileage" value="<c:out value="${vehicle.mileage}" />" class="campo"  placeholder="Quilometragem" style="width: 250px" title="Informe a Quilometragem."/> <br /> 
                  
                <select name="situationVehicle" class="campo"   style="width: 250px" title="Informe a disponibilidade do veiculo.">
                  <c:forEach items="${situationVehicles}" var="situationVehicle">
                    <option value="${situationVehicle.id}">
                        ${situationVehicle.name} 
                    </option>
                  </c:forEach>
                </select> <br/>
                
                <button type="submit" value="Submit" class="btn"> Salvar </button>
                

                
 
      </form>
        </div>               


        <div class="gradient footer">

        </div>
    </body>
</html>
