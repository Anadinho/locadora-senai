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
         <div >  
            <div>
                <label>Clientes Pf</label>
                <div>      
          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>licensePlate</th>
                <th>Modelo</th>
                <th>Marca</th>
                <th>renavam</th>
                <th>Categoria</th>
                <th>Preço de compra</th>
                <th>Preço de Venda</th>
                <th>Quantidade de passageiros</th>
                 <th>Ano de fabricação</th>
                  <th>Ano do modelo</th>
                <th>Combustivel</th>
                <th>Quilometragem</th>
                 <th>TipoVeiculo</th>
                 <th>Situação</th>
                <th colspan=2 >Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${vehicles}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.licensePlate}" /></td>
                    <td><c:out value="${user.model.name}" /></td>
                    <td><c:out value="${user.model.brand.name}" /></td>
                    <td><c:out value="${user.renavam}" /></td>
                    <td><c:out value="${user.category.name}" /></td>
                    <td><c:out value="${user.buyPrice}" /></td>
                    <td><c:out value="${user.salePrice}" /></td>
                    <td><c:out value="${user.numberPassengers}" /></td>
                    <td><c:out value="${user.yearFabrication}" /></td>
                    <td><c:out value="${user.yearModel}" /></td>
                     <td><c:out value="${user.typeFuel}" /></td>
                    <td><c:out value="${user.mileage}" /></td>
                     <td><c:out value="${user.vehicleType.name}" /></td>
                     <td ><a  href="VehicleController?action=edit&.licensePlate=<c:out value="${user.licensePlate}"/>" >Update</a></td>
                    <td><a href="VehicleController?action=delete&.licensePlate=<c:out value="${user.licensePlate}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
        <button onclick="window.location.href='VehicleController?action=listarVehicle'" >Listar</button>
           </div>
    </body>
</html>
