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
                        <li><a href="../veiculo/editar.jsp">Editar</a></li>
                        <li><a href="../veiculo/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a href="ClientPfController?action=cadastrarClientPf">Cadastrar</a></li>
                        <li><a href="ClientPfController?action=listarClientPf">Consultar</a></li>
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
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
             <br><br><a href="ClientPfController?action=listarClientPf" class="btn-editar">Consultar Cliente (PF)</a>
            <a href="ClientPjController?action=listarClientPj" class="btn-editar"> ConsultarCliente (PJ)</a> <br><br>
            
            <!--COLOCAR UMA LISTA?-->
             
            <div>
                <label>Clientes pj</label>
                <div>      
          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome Fantasia</th>
                <th>Razao Social</th>
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
            <c:forEach items="${clientPjs}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.fantasyName}" /></td>
                    <td><c:out value="${user.razaoSocial}" /></td>
                    <td><c:out value="${user.client.address.logradouro}" /></td>
                    <td><c:out value="${user.client.address.numberAddress}" /></td>
                    <td><c:out value="${user.client.address.complement}" /></td>
                    <td><c:out value="${user.client.address.district}" /></td>
                    <td><c:out value="${user.client.address.city.name}" /></td>
                     <td><c:out value="${user.client.address.city.uf.name}" /></td>
                    <td><c:out value="${user.client.contact.telephone}" /></td>
                     <td ><a  href="ClientPjController?action=edit&id=<c:out value="${user.id}"/>" >Update</a></td>
                    <td><a href="ClientPjController?action=delete&id=<c:out value="${user.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>  
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
