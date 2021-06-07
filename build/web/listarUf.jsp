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
                <label>Ufs</label>
                <div>      
          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Uf</th>
                <th colspan=2 >Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ufs}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                     <td ><a  href="UfController?action=edit&id=<c:out value="${user.id}"/>" >Update</a></td>
                    <td><a href="UfController?action=delete&id=<c:out value="${user.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
       </div>
         </div>
        <button onclick="window.location.href='UfController?action=listarUf'" ></button>
           </div>
    </body>
</html>
