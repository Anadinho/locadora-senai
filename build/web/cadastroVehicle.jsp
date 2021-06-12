<%-- 
    Document   : cadastroPiloto
    Created on : 16/04/2021, 09:29:20
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
        <title>Cadastro Veiculo</title>
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>

    </head>
    <body>   
<!--    <script>
        $(function() {
            $('input[name=data]').datepicker();
        });
    </script>-->
    
        <div>  
            <div >               
            <div >
         <form method="POST" action='VehicleController' name="frmAddVehicle">
        
            
           <label >Placa : </label> 
         <input  type="text" name="licensePlate"  value="<c:out value="${vehicle.licensePlate}" />"  /> <br />
         
         <label>Modelo</label>
                    <select id="cits">
                   <c:forEach items="${citys}" var="city">
                        <option value="<c:out value='${city}' />"
                            <c:if test="${param.selectValue == city.id})"> selected </c:if>  >
                            <c:out value="${city.name}" />                 
                        </option>
                    </c:forEach>
                    </select>
         
         <label>renavam : </label>
         <input  type="text" name="renavam" value="<c:out value="${vehicle.renavam}" />"  /> <br /> 
         
         <label>Modelo : </label>
         <input  type="text" name="model" value="<c:out value="${vehicle.model}" />" /> <br /> 
         
         <label>Renavam : </label> 
         <input  type="text" name="renavam" value="<c:out value="${vehicle.renavam}" />"   /> <br /> 
         
         <label>Categoria : </label> 
         <input  type="text" name="placa" value="<c:out value="${carro.placa}" />"  class="botaoPlaca" /> <br /> 
         
         <label>Preço de compra : </label> 
            <input  type="text" name="buyPrice" value="<c:out value="${vehicle.buyPrice}" />"  class="botaoPlaca" /> <br /> 
            
           <label>Preço de venda : </label> 
           <input  type="text" name="salePrice" value="<c:out value="${vehicle.salvePrice}" />"  class="botaoPlaca" /> <br /> 
           
              <label>Passageiros</label> 
           <input  type="text" name="numberPassengers" value="<c:out value="${vehicle.numberPassengers}" />"  class="botaoPlaca" /> <br />
           
           <label>Passageiros</label> 
           <input  type="text" name="yearFabrication" value="<c:out value="${vehicle.numberPassengers}" />"  class="botaoPlaca" /> <br /> 
         
        <label class="textCategoria">Categoria: : </label>  
         <input  type="text" name="categoria" value="<c:out value="${carro.categoria}" />" class="botaoCategoria" /> <br /> 
         
         <label class="textCombustivel">Combustivel : </label> 
         <input  type="text" name="combustivel" value="<c:out value="${carro.combustivel}" />"  class="botaoCombustivel"/> <br />
         
         <label class="textKM">Km : </label>
         <input  type="text" name="km" value="<c:out value="${carro.km}" />"  class="botaoKm"/> <br /> 

        <button type="submit" value="Submit" class="botaoCadastrarCarros"> Salvar </button>
  
          
           
            </form>
         <button onclick="window.location.href='CarroController?action=listarCarro'" class="botaoVoltarCarros"></button>
             </div>
         
         
        </div>
       
          </div>
      
    </body>
</html>
