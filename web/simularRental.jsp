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
<!--        <script>
        $(function() {
            $('input[name=dateRental]').datepicker();
            $('input[name=dateScheduledDevolution]').datepicker();
        });
        </script>-->
            <label>SIMULAÇÂO</label>  
            <div>
                <form method="POST" action='RentalController?action=simularRental' name="frmAddRental">
                
                
                <label>Veiculos</label>
                <select name="vehicle" >
                  <c:forEach items="${vehicles}" var="vehicle">
                    <option value="${vehicle.licensePlate}">
                        ${vehicle.licensePlate} -
                        ${vehicle.model.name}-
                        ${vehicle.model.brand.name}-
                        ${vehicle.situationVehicle.name}
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
                
                <label>Quantidade de diarias</label>
                <input  type="text" name="diarias" value="<c:out value="${simuladoRental.diarias}" />"/> <br />
                
<!--                <label>Data Locação </label> 
                <input   type="text"  /> <br /> 
                          
                <label>Data Prevista Devolução </label> 
                <input   type="text"  /> <br /> -->
              
                <label>Kilometragem inicial</label>
                <input  type="text"  readonly="readonly"/> <br />
                
<!--                <label>Kilometragem final</label>
                <input  type="text" /> <br /> -->
                
                <label>Valor locação</label>
                 <input  type="text" name="priceRental" value="<c:out value="${simuladoRental.calculoTotal}" />" readonly="readonly"/> <br />
                
                <label>Valor Caução</label>
                <input  type="text" /> <br /> 
                
                <label>Valor a ser pago pelo seguro do carro</label>
                <input  type="text" /> <br />
                
                <label>taxa seguro carro</label>
                <input  type="text" /> <br />
                
                <label>Valor Total da locação</label>
                <input  type="text" /> <br />
                
                 <label>Multa por atraso?</label>
                <input  type="text"/> <br />
                
                
                <label>Multa de transito?</label>
                <input  type="text" /> <br /> 
                
                 <label>Litros de combustivel faltante</label>
                <input  type="text" /> <br /> 
               
                
               <button type="submit" value="Submit" > Simular </button>
 
      </form>
       </div>

        <button onclick="window.location.href='RentalController?action=simularRental'" >Atualizar lista cidade</button>
        
        
    </body>
</html>
