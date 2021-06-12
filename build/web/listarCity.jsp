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
                <label>Citys</label>
                <div>   
                    
                    <select id="dropdown">
                   <c:forEach items="${citys}" var="user">
                        <option value="<c:out value='${city}' />"
                            <c:if test="${param.selectValue == city.id})"> selected </c:if>  >
                            <c:out value="${user.name}" />
                        </option>
                    </c:forEach>
                    </select>
<!--          <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>cidade</th>
                <th>uf</th>
                <th colspan=2 >Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${citys}" var="user">
                <tr >
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.uf.name}" /></td>
                     <td ><a  href="CityController?action=edit&id=<c:out value="${user.id}"/>" >Update</a></td>
                    <td><a href="CityController?action=delete&id=<c:out value="${user.name}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>-->
       </div>
         </div>
        <button onclick="window.location.href='CityController?action=listarCity'" ></button>
           </div>
    </body>
</html>
