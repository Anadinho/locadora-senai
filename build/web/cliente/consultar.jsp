<%-- 
    Document   : consultar
    Created on : 31/05/2021, 20:16:15
    Author     : Cabral
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js" integrity="sha384-lpyLfhYuitXl2zRZ5Bn2fqnhNAKOAaM/0Kr9laMspuaMiZfGmfwRNFh8HlMy49eQ" crossorigin="anonymous"></script>
        <title>SENAI-PI-LOCADORA</title>-->
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
                        <li><a href="../motoristas/editar.jsp">Editar</a></li>
                        <li><a href="../motoristas/excluir.jsp">Excluir</a></li>
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
             <br><br><a href="ClientPfController?action=listarClientPf" class="btn-editar">Consultar Cliente (PF)</a>
            <a href="ClientPjController?action=listarClientPj" class="btn-editar">Consultar Cliente (PJ)</a> <br><br>
            
            <!--COLOCAR UMA LISTA?-->
             <div >  
            <div>
                
                <div>      
          <table border="4" width="80%" >
        <thead>
            <tr>
                <th>Id</th>
                <th>CPF</th>
                <th>identidade</th>
                <th>Nome</th>
                <th>Logradouro</th>
                <th>Numero endereço</th>
                <th>Complemento</th>
                <th>Bairro</th>
                 <th>Cidade</th>
                  <th>Uf</th>
                <th>Telefone</th>
                <th colspan=2 >Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${clientPfs}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.cpf}" /></td>
                    <td><c:out value="${user.identity}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.client.address.logradouro}" /></td>
                    <td><c:out value="${user.client.address.numberAddress}" /></td>
                    <td><c:out value="${user.client.address.complement}" /></td>
                    <td><c:out value="${user.client.address.district}" /></td>
                    <td><c:out value="${user.client.address.city.name}" /></td>
                     <td><c:out value="${user.client.address.city.uf.name}" /></td>
                    <td><c:out value="${user.client.contact.telephone}" /></td>
                     <td ><a  href="ClientPfController?action=edit&id=<c:out value="${user.id}"/>" >Update</a></td>
                   
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
           </div>
            
            
            <!--<br> <button  class="btn-editar"> Consultar Clientes (PF) </button>-->
            
            <!--<button class="btn-editar"> Consultar Clientes (PJ) </button>-->
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
