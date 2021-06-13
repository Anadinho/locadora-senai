<%-- 
    Document   : index
    Created on : 28/05/2021, 13:07:41
    Author     : Cabral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>SENAI-PI-LOCADORA</title>
        <meta name="description" content="Example project demonstrating how to build hover menus in CSS">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css">
    </head>
    <body class="body">
        <img src="assets/background2.webp" class="img">
        
        <nav>
            <ul class="gradient">
                <li>
                    Veiculo
                    <ul class="dropdown">
                        <li><a href="veiculo/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="veiculo/consultar.jsp">Consultar</a></li>
                        <li><a href="veiculo/editar.jsp">Editar</a></li>
                        <li><a href="veiculo/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                  <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a href="cliente/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="cliente/consultar.jsp">Consultar</a></li>
                        <li><a href="cliente/editar.jsp">Editar</a></li>
                        <li><a href="cliente/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                  <li>
                    Motoristas
                    <ul class="dropdown">
                       <li><a href="motoristas/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="motoristas/consultar.jsp">Consultar</a></li>
                        <li><a href="motoristas/editar.jsp">Editar</a></li>
                        <li><a href="motoristas/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                  <li>
                    Locação
                    <ul class="dropdown">
                        <li><a href="locadora/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="locadora/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>

        <div class="container">
           <img src="assets/logo.png" width = "200px">
            <h3 class="h3">MULTI-MARCAS</h3>
        </div>
        
        <div class="gradient footer">

        </div>
        
    </body>
</html>