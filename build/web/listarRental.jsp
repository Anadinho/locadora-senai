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
           <link type="text/css" href="css/style.css" rel="stylesheet" />
        <title>Lista </title>
    </head>
    <body>
         <div >  
            <div>
                <label>Localçao</label>
                <div>      
          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Placa do veiculo</th>
                <th>Nome Cliente</th>
                 <th>Nome Motorista </th>
                <th>Data da locação</th>
                <th>Data da devolução prevista</th>
                <th>Data da devolução</th>
                <th>Quilometragem antiga</th>
                <th>Quilometragem atual do veiculo</th>
                <th>Valor Da locação</th>
                 <th>Valor Do Caução</th>
                 <th>Valor cobertura do seguro</th>
                 <th>Valor do seguro da locação</th>
                  <th>Multa</th>
                  <th>Litros de combustivel faltando</th>
                <th colspan=2 >Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${rentals}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.vehicle.licensePlate}" /></td>
                    
                     <!--O botão PF -->
                    <!--<td><c:out value="${user.clientPf.name}" /></td>-->
                    <!--O botão PJ -->
                    <td><c:out value="${user.clientPj.fantasyName}" /></td>
                    
                    <td><c:out value="${user.driver.name}" /></td>
                     <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.dateRental}" /></td>
                     <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.dateScheduledDevolution}" /></td>
                      <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.dateDevolution}" /></td>
                    <td><c:out value="${user.initialMileage}" /></td>                   
                    <td><c:out value="${user.finalMileage}" /></td>
                    <td><c:out value="${user.priceRental}" /></td>
                    <td><c:out value="${user.priceGuarantee}" /></td>
                    <td><c:out value="${user.priceInsuranceCar}" /></td>
                    <td><c:out value="${user.priceInsuranceRental}" /></td>
                    <td><c:out value="${user.trafficTicket}" /></td>
                     <td><c:out value="${user.litersFuel}" /></td>
                     <td ><a  href="RentalController?action=edit&cpf=<c:out value="${user.id}"/>" >Update</a></td>
                    <td><a href="RentalController?action=delete&cpf=<c:out value="${user.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
        <button onclick="window.location.href='RentalController?action=listarRental'" >listar</button>
           </div>
    </body>
</html>
