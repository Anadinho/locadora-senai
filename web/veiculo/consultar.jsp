<%-- 
    Document   : consultar
    Created on : 31/05/2021, 20:09:28
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

        <img src="../assets/background2.webp" class="img blur" >

        <nav>

            <a href="../index.jsp"> <img class="home-img" src="../assets/casa.png" height="70px"> </a>

            <ul class="gradient">



                <li>
                    Veiculo
                    <ul class="dropdown">
                        <li><a href="VehicleController?action=cadastrarVehicle">Cadastrar</a></li>
                        <li><a href="VehicleController?action=listarVehicle">Consultar</a></li>
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
            
            <!--COLOCAR UMA LISTA?-->
            
            
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
            <br> <button onclick="window.location.href='VehicleController?action=listarVehicle'" class="btn-editar"> Consultar Veiculos </button>
        </div>


        <div class="gradient footer">

        </div>
    </body>
</html>