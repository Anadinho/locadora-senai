<%-- 
    Document   : locarCarro
    Created on : 31/05/2021, 20:17:35
    Author     : Cabral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SENAI-PI-LOCADORA</title>
        <link rel="stylesheet" href="../style.css">
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
                        <li><a href="../cliente/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../cliente/consultar.jsp">Consultar</a></li>
                        <li><a href="../cliente/editar.jsp">Editar</a></li>
                        <li><a href="../cliente/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Motoristas
                    <ul class="dropdown">
                        <li><a href="../motoristas/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../motoristas/consultar.jsp">Consultar</a></li>
                        <li><a href="../motoristas/editar.jsp">Editar</a></li>
                        <li><a href="../motoristas/excluir.jsp">Excluir</a></li>
                    </ul>
                </li>
                <li>
                    Locação
                    <ul class="dropdown">
                        <li><a href="cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="consultar.jsp">Consultar</a></li>
                        
                    </ul>
                </li>
            </ul> 
        </nav>
        
        
        <div class="conteudo">
           
        
       <br> <button class="btn-editar"> Consultar Locações </button>
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>
