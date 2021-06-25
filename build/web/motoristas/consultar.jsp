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
                        <li><a href="../veiculo/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../veiculo/consultar.jsp">Consultar</a></li>
                        <li><a href="../veiculo/editar.jsp">Editar</a></li>
                        <li><a href="../veiculo/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a href="ClientPfController?action=cadastrarClientPf">Cadastrar</a></li>
                        <li><a href="ClientPfController?action=listarClientPf">Consultar</a></li>
                        <li><a href="../cliente/editar.jsp">Editar</a></li>
                        <li><a href="../cliente/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Motoristas
                    <ul class="dropdown">
                        <li><a href="DriverController?action=cadastrarDriver">Cadastrar</a></li>
                        <li><a href="DriverController?action=listarDriver">Consultar</a></li>
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
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
            
            <!--COLOCAR UMA LISTA?-->
              
            <div>
                <label>MOTORISTAS</label>
                <div>      
          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>cpf</th>
                <th>nome</th>
                <th>Identidade</th>
                <th>cnh</th>
                <th>category</th>
                <th>Validade cnh</th>
                <th>UrlCnh</th>                
                 <th>Logradouro</th>
                 <th>Numero endereço</th>
                 <th>Complemento</th>
                  <th>Bairro</th>
                  <th>Cidade</th>
                  <th>Uf</th>
                <th>Telefone</th>
                <th>Email</th>
                <th colspan=2 >Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${drivers}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.cpf}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.identity}" /></td>
                    <td><c:out value="${user.cnh}" /></td>
                    <td><c:out value="${user.category}" /></td>
                    <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.cnhValidity}" /></td>
                    <td><c:out value="${user.urlCnh}" /></td>
                    <td><c:out value="${user.address.logradouro}" /></td>
                    <td><c:out value="${user.address.numberAddress}" /></td>
                    <td><c:out value="${user.address.complement}" /></td>
                    <td><c:out value="${user.address.district}" /></td>
                    <td><c:out value="${user.address.city.name}" /></td>
                     <td><c:out value="${user.address.city.uf.name}" /></td>
                    <td><c:out value="${user.contact.telephone}" /></td>
                    <td><c:out value="${user.contact.email}" /></td>
                     <td ><a  href="DriverController?action=edit&cpf=<c:out value="${user.cpf}"/>" >Update</a></td>
                    <td><a href="DriverController?action=delete&cpf=<c:out value="${user.cpf}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
         
<!--            <br> <button class="btn-editar"> Consultar Motoristas </button>
     -->
        </div>
        
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
