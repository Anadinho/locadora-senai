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
                <label>Clientes Pf</label>
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
                     <td ><a  href="DriverController?action=edit&cpf=<c:out value="${user.cpf}"/>" >Update</a></td>
                    <td><a href="DriverController?action=delete&cpf=<c:out value="${user.cpf}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
        <button onclick="window.location.href='DriverController?action=listarDriver'" ></button>
           </div>
    </body>
</html>
