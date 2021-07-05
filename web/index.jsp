<%-- 
    Document   : index
    Created on : 28/05/2021, 13:07:41
    Author     : Cabral
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>SENAI-PI-LOCADORA</title>
        <meta name="description" content="Example project demonstrating how to build hover menus in CSS">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
    </head>
    <body class="body">
        <img src="assets/background2.webp" class="img">
        
        <nav>
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

        <div class="container">
           <!--<img src="assets/logo.png" width = "200px">-->
            <h3 class="h3">MULTI-MARCAS</h3>
        </div>
        
        <div class="gradient footer">

        </div>
        
    </body>
</html>