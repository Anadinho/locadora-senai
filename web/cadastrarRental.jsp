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
        <link type="text/css" href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
        <link type="text/css" href="css/style.css" rel="stylesheet" />
        <title>Cadastro Driver</title>
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
    </head>
    <body>
        <script>
        $(function() {
            $('input[name=dateRental]').datepicker();
            $('input[name=dateScheduledDevolution]').datepicker();
        });
        </script>
            <label>Realizar Locação</label>  
            <div>
                <form method="POST" action='RentalController' name="frmAddRental">
                
                
                <label>Veiculos</label>
                <select name="vehicle" >
                  <c:forEach items="${vehicles}" var="vehicle">
                    <option value="${vehicle.licensePlate}">
                        ${vehicle.licensePlate} -
                        ${vehicle.model.name}-
                        ${vehicle.model.brand.name}
                    </option>
                  </c:forEach>
                </select> <br/>
                
                 <label>Cliente PF</label>
                <select name="fk_client" >
                  <c:forEach items="${clientPfs}" var="clientPf">
                    <option value="${clientPf.client.id}">
                        ${clientPf.cpf} -
                        ${clientPf.name}                        
                    </option>
                  </c:forEach>
                </select> <br/> 
                
<!--                 <label>Cliente Pj</label>
                <select name="clientPj" >
                  <c:forEach items="${clientPjs}" var="clientPj">
                    <option value="${clientPj.cnpj}">
                        ${clientPj.cnpj} 
                        ${clientPj.fantasyName}
                    </option>
                  </c:forEach>
                </select> <br/> -->
                
                 <label>Motorista</label>
                <select name="driver" >
                  <c:forEach items="${drivers}" var="driver">
                    <option value="${driver.cpf}">
                        ${driver.cpf}- 
                        ${driver.name}
                    </option>
                  </c:forEach>
                </select> <br/> 
                
                <label>Data Locação </label> 
                <input   type="text" name="dateRental" value="<fmt:formatDate pattern="MM/dd/yyyy" value="${rental.dateRental}"/>" /> <br /> 

                                
                <label>Data Prevista Devolução </label> 
                <input   type="text" name="dateScheduledDevolution" value="<fmt:formatDate pattern="MM/dd/yyyy" value="${rental.dateScheduledDevolution}"/>" /> <br /> 

                
                <label>Kilometragem inicial</label>
                <input  type="text" name="initialMileage" value="<c:out value="${rental.initialMileage}" />"/> <br />
                
                <label>Kilometragem final</label>
                <input  type="text" name="finalMileage" value="<c:out value="${rental.finalMileage}" />"/> <br /> 
                
                <label>Valor locação</label>
                <input  type="text" name="priceRental" value="<c:out value="${rental.priceRental}" />"/> <br />
                
                <label>Valor Caução</label>
                <input  type="text" name="priceGuarantee" value="<c:out value="${rental.priceGuarantee}" />"/> <br /> 
                
                <label>Valor a ser pago pelo seguro do carro</label>
                <input  type="text" name="priceInsuranceCar" value="<c:out value="${rental.priceInsuranceCar}" />"/> <br />
                
                <label>taxa seguro carro</label>
                <input  type="text" name="priceInsuranceRental" value="<c:out value="${rental.priceInsuranceRental}" />"/> <br />
                
                <label>Valor Total da locação</label>
                <input  type="text" name="priceTotal" value="<c:out value="${rental.priceTotal}" />"/> <br />
                
                 <label>Multa por atraso?</label>
                <input  type="text" name="lateFee" value="<c:out value="${rental.lateFee}" />"/> <br />
                
                
                <label>Multa de transito?</label>
                <input  type="text" name="trafficTicket" value="<c:out value="${rental.trafficTicket}" />"/> <br /> 
                
                 <label>Litros de combustivel faltante</label>
                <input  type="text" name="litersFuel" value="<c:out value="${rental.litersFuel}" />"/> <br /> 
               
                
               <button type="submit" value="Submit" > Cadastrar </button>
 
      </form>
       </div>

        <button onclick="window.location.href='RentalController?action=cadastrarRental'" >Atualizar lista cidade</button>
        <button onclick="window.location.href='RentalController?action=cadastrarRental'" >Simular</button> 
        
    </body>
</html>
