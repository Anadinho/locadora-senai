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
            
            <div >  
            <div>
                
                <div>      
          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Placa do veiculo</th>
                <th>Nome Cliente</th>
                 <th>Nome Motorista </th>
                <th>Data da loca????o</th>
                <!--<th>Data da loca????o - alternativo</th>-->
                <th>Data da devolu????o prevista</th>
                <th>Data da devolu????o</th>
                <th>Quilometragem antiga</th>
                <th>Quilometragem atual do veiculo</th>
                <th>Valor Da loca????o</th>
                 <th>Valor Do Cau????o</th>
                 <th>Valor cobertura do seguro</th>
                 <th>Valor do seguro da loca????o</th>
                 <th>Valor Total loca????o</th>
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
                    
                     <!--O bot??o PF -->
                    <!--<td><c:out value="${user.clientPf.name}" /></td>-->
                    <!--O bot??o PJ -->
                    <td><c:out value="${user.clientPj.fantasyName}" /></td>
                    
                    <td><c:out value="${user.driver.name}" /></td>
                     <!--<td><fmt:formatDate pattern="yyyy-MMM-dd HH:mm:ss" value="${user.dateRental}" /></td>-->
                     <td><c:out value="${user.dateTimeRental}" /></td>
                     <!--<td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.dateScheduledDevolution}" /></td>-->
                     <td><c:out value="${user.dateTimeScheduledDevolution}" /></td>
                      <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.dateDevolution}" /></td>
                    <td><c:out value="${user.initialMileage}" /></td>                   
                    <td><c:out value="${user.finalMileage}" /></td>
                    <td><c:out value="${user.priceRental}" /></td>
                    <td><c:out value="${user.priceGuarantee}" /></td>
                    <td><c:out value="${user.priceInsuranceCar}" /></td>
                    <td><c:out value="${user.priceInsuranceRental}" /></td>
                    <td><c:out value="${user.priceTotal}" /></td>
                    <td><c:out value="${user.trafficTicket}" /></td>
                     <td><c:out value="${user.litersFuel}" /></td>
                     <td ><a  href="RentalController?action=edit&cpf=<c:out value="${user.id}"/>" >Update</a></td>
                    <td><a href="RentalController?action=delete&cpf=<c:out value="${user.id}"/>">Devolu????o</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
        <!--<button onclick="window.location.href='RentalController?action=listarRental'" >listar</button>-->
           </div>
           
        
       <br> 
       <button  class="btn-editar" onclick="window.location.href='RentalController?action=listarRentalPj'" >Atualizar listar</button>
       <!--<button class="btn-editar"> Consultar Loca????es </button>-->
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
