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
                        <li><a href="RentalController?action=simularRental">Cadastrar</a></li>
                        <li><a href="RentalController?action=listarRental">Consultar</a></li>
                        
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
                <th>Data da locação</th>
                <!--<th>Data da locação - alternativo</th>-->
                <th>Data da devolução prevista</th>
                <th>Data da devolução</th>
                <th>Quilometragem antiga</th>
                <th>Quilometragem atual do veiculo</th>
                <th>Valor Da locação</th>
                 <th>Valor Do Caução</th>
                 <th>Valor cobertura do seguro</th>
                 <th>Valor do seguro da locação</th>
                 <th>Valor Total locação</th>
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
                    <td><c:out value="${user.clientPf.name}" /></td>
                    <!--O botão PJ -->
                    <!--<td><c:out value="${user.clientPj.fantasyName}" /></td>-->
                    
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
                    <td><a href="RentalController?action=delete&cpf=<c:out value="${user.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
        <button onclick="window.location.href='RentalController?action=listarRental'" >listar</button>
           </div>
           
        
       <br> <button class="btn-editar"> Consultar Locações </button>
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
