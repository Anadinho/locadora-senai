<%-- 
    Document   : cadastroPiloto
    Created on : 16/04/2021, 09:29:20
    Author     : suporte
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.locadora.model.City"%>
<%@page import="br.com.locadora.dal.CityDal"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
        <link type="text/css" href="css/style.css" rel="stylesheet" />
        <title>Cadastro Cliente</title>
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>

    </head>
    <body>   
<!--    <script>
        $(function() {
            $('input[name=dataCorrida]').datepicker();
        });
    </script>-->
    
        <div >  
            <div >               
            <div >
                CADASTRO PESSOA FISICA
         <form method="POST" action='ClientPfController' name="frmAddClient">
        
            
         <label>Nome</label>
         <input  type="text" name="name" value="<c:out value="${name}" />"  /> <br /> 
             
         <label>Identidade </label>
         <input  type="text" name="identity" value="<c:out value="${identity}" />"  /> <br /> 
         
         <label >CPF</label> 
          <input  type="text" name="cpf" value="<c:out value="${cpf}" />"  /> <br /> 
         
         <label>CEP : </label>
         <input  type="text" name="cep" value="<c:out value="${cep}" />"  /> <br /> 
         
         <label>Logradouro: </label> 
         <input  type="text" name="logradouro" value="<c:out value="${logradouro}" />"   /> <br /> 
         
         <label>Complemento : </label> 
         <input  type="text" name="complement" value="<c:out value="${complement}" />"   /> <br />  
         
          <label>Bairro : </label> 
         <input  type="text" name="district" value="<c:out value="${district}" />"   /> <br /> 
         
           <label>Cidade : </label> 
            
         
         <label>UF : </label> 
         <input  type="text" name="carro" value="<c:out value="${corrida.carro.placa}" />"   /> <br />  
         
          <label>Email : </label> 
         <input  type="text" name="email" value="<c:out value="${corrida.carro.placa}" />"  /> <br />
         
           <label>Telefone : </label> 
         <input  type="text" name="telephone" value="<c:out value="${corrida.carro.placa}" />"  /> <br />

        <button type="submit" value="Submit" class="Salvar"> Salvar</button>
          
           
            </form>
             </div>
         
         
        </div>
       
          </div>
      
    </body>
</html>
