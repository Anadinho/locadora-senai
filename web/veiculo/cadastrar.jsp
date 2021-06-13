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
        <link rel="stylesheet" href="../style.css">
    </head>
    <body>

        <img src="../assets/background2.webp" class="img blur" >

        <nav>

            <a href="../index.jsp"> <img class="home-img" src="../assets/casa.png" height="70px"> </a>

            <ul class="gradient">



                <li>
                    Veiculo
                    <ul class="dropdown">
                        <li><a href="cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="consultar.jsp">Consultar</a></li>
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a href="../cliente/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../cliente/consultar.jsp">Consultar</a></li>
                        <li><a href="../cliente/editar.jsp">Editar</a></li>
                        <li><a href="../cliente/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Motoristas
                    <ul class="dropdown">
                        <li><a href="../motoristas/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../motoristas/consultar.jsp">Consultar</a></li>
                        <li><a href="../motoristas/editar.jsp">Editar</a></li>
                        <li><a href="../motoristas/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Locação
                    <ul class="dropdown">
                        <li><a href="../locadora/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../locadora/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>


        <div class="conteudo">
            
            <label class="TopdoForm">CADASTRAR NOVO VEICULO</label><br>
            
            
            
            <form method="POST" action='VehicleController' name="frmAddVehicle">
                
                <label>Placa do veiculo</label>
                <input  type="text" name="licensePlate" value="<c:out value="${vehicle.licensePlate}" />" class="campo"  placeholder="Placa" style="width: 150px" title="Informar a placa do veiculo."/> <br /> 
                
                <label>Modelo</label>
                <select name="model"  class="campo" style="width: 150px;margin-left:20px" title="Informar o modelo do veiculo." >
                  <c:forEach items="${models}" var="model">
                    <option value="${model.id}">
                        ${model.name} 
                    </option>
                  </c:forEach>
                </select> 
                <br/>
                
                <label>Renavam</label>
                <input  type="text" name="renavam" value="<c:out value="${vehicle.renavam}" />" class="campo"  placeholder="Renavam(Numeros)" style="width: 150px" title="Informe o renavam."/> <br /> 
                
                 <label>Categoria do Veiculo</label>
                <select name="category" class="campo"   style="width: 150px;margin-left:20px" title="Informe a categoria do veiculo.">
                  <c:forEach items="${categorys}" var="category">
                    <option value="${category.id}">
                        ${category.name} 
                    </option>
                  </c:forEach>
                </select> 
                <br/> 
                
                 <label>Valor de Compra do veiculo</label>
                <input  type="text" name="buyPrice" value="<c:out value="${vehicle.buyPrice}" />" class="campo"  placeholder="Preço de Compra" style="width: 150px" title="Informe preço de compra do veiculo."/> <br /> 
                
                 <label>Valor de venda do Veiculo</label>
                <input  type="text" name="salePrice" value="<c:out value="${vehicle.salePrice}" />" class="campo"  placeholder="Preço de Venda" style="width: 150px;margin-left:220px" title="Informe o apreço de venda do veiculo."/> <br />
                
                 <label>Numero de passageiros</label>
                <input  type="text" name="numberPassengers" value="<c:out value="${vehicle.numberPassengers}" />" class="campo"  placeholder="Nro de passageiros" style="width: 250px" title="Informe a quantidade de assentos/passageiros."/> <br />
                
                <label>Ano de fabricação</label>
                <input  type="text" name="yearFabrication" value="<c:out value="${vehicle.yearFabrication}" />" class="campo"  placeholder="anoFabricacao" style="width: 150px" title="Informe o ano de fabricação do veiculo."/> <br />
                
                <label>Ano Model</label>
                <input  type="text" name="yearModel" value="<c:out value="${vehicle.yearModel}" />" class="campo"  placeholder="anoModelo" style="width: 150px;margin-left:220px" title="Informe o ano modelo do veiculo."/> <br />                
                
                <label>Tipo Combustivel</label>
                <input  type="text" name="typeFuel" value="<c:out value="${vehicle.typeFuel}" />" class="campo"  placeholder="Combustivel" style="width: 250px" title="Informe o combustivel utilizado."/> <br />
                
                <label>Quilometragem</label>
                <input  type="text" name="mileage" value="<c:out value="${vehicle.mileage}" />" class="campo"  placeholder="Quilometragem" style="width: 250px" title="Informe a Quilometragem."/> <br /> 
                
                <label>Situação do Veiculo</label>
                <select name="situationVehicle" class="campo"   style="width: 250px" title="Informe a disponibilidade do veiculo.">
                  <c:forEach items="${situationVehicles}" var="situationVehicle">
                    <option value="${situationVehicle.id}">
                        ${situationVehicle.name} 
                    </option>
                  </c:forEach>
                </select> <br/>
                
                <label>Tipo de Veiculo</label>
                <select name="vehicleType" class="campo"   style="width: 150px;margin-left:20px" title="Informe o tipo do veiculo." >
                  <c:forEach items="${vehicleTypes}" var="vehicleType">
                    <option value="${vehicleType.id}">
                        ${vehicleType.name} 
                    </option>
                  </c:forEach>
                </select> <br/>          
                
                 
                <button type="submit" value="Submit" class="btn"> Salvar </button>
 
      </form>
        </div>
                 <button onclick="window.location.href='ClientPfController?action=cadastrarClientPf'" >carregar</button>
                


        <div class="gradient footer">

        </div>
    </body>
</html>
