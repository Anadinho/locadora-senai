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
            <label>Cadastro Vehicle</label>  
            <div>
                <form method="POST" action='VehicleController' name="frmAddVehicle">
                
                <label>Placa do veiculo</label>
                <input  type="text" name="licensePlate" value="<c:out value="${vehicle.licensePlate}" />"/> <br /> 
                
                <label>Modelo</label>
                <select name="model" >
                  <c:forEach items="${models}" var="model">
                    <option value="${model.id}">
                        ${model.name} 
                    </option>
                  </c:forEach>
                </select> <br/>
                
                <label>Renavam</label>
                <input  type="text" name="renavam" value="<c:out value="${vehicle.renavam}" />"/> <br /> 
                
                 <label>Categoria do Veiculo</label>
                <select name="category" >
                  <c:forEach items="${categorys}" var="category">
                    <option value="${category.id}">
                        ${category.name} 
                    </option>
                  </c:forEach>
                </select> <br/> 
                
                 <label>Valor de Compra do veiculo</label>
                <input  type="text" name="buyPrice" value="<c:out value="${vehicle.buyPrice}" />"/> <br /> 
                
                 <label>Valor de venda do Veiculo</label>
                <input  type="text" name="salePrice" value="<c:out value="${vehicle.salePrice}" />"/> <br />
                
                 <label>Numero de passageiros</label>
                <input  type="text" name="numberPassengers" value="<c:out value="${vehicle.numberPassengers}" />"/> <br />
                
                <label>Ano de fabricação</label>
                <input  type="text" name="yearFabrication" value="<c:out value="${vehicle.yearFabrication}" />"/> <br />
                
                <label>Ano Model</label>
                <input  type="text" name="yearModel" value="<c:out value="${vehicle.yearModel}" />"/> <br />                
                
                <label>Tipo Combustivel</label>
                <input  type="text" name="typeFuel" value="<c:out value="${vehicle.typeFuel}" />"/> <br />
                
                <label>Quilometragem</label>
                <input  type="text" name="mileage" value="<c:out value="${vehicle.mileage}" />"/> <br /> 
                
                <label>Tipo de Veiculo</label>
                <select name="vehicleType" >
                  <c:forEach items="${vehicleTypes}" var="vehicleType">
                    <option value="${vehicleType.id}">
                        ${vehicleType.name} 
                    </option>
                  </c:forEach>
                </select> <br/>          
                
                <label>Situação do Veiculo</label>
                <select name="situationVehicle" >
                  <c:forEach items="${situationVehicles}" var="situationVehicle">
                    <option value="${situationVehicle.id}">
                        ${situationVehicle.name} 
                    </option>
                  </c:forEach>
                </select> <br/> 
                <button type="submit" value="Submit" > Cadastrar </button>
 
      </form>
       </div>

        <button onclick="window.location.href='VehicleController?action=cadastrarVehicle'" ></button>

    </body>
</html>
