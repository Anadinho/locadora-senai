<%-- 
    Document   : index
    Created on : 28/05/2021, 13:07:41
    Author     : Cabral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>CSS Hover Menu Demo</title>
        <meta name="description" content="Example project demonstrating how to build hover menus in CSS">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <img src="assets/background2.png" class="img">
        <nav>
            <ul class="gradient">
                <li>
                    Veiculo
                    <ul class="dropdown">
                        <li><a>Cadastrar</a></li>
                        <li><a>Consultar</a></li>
                        <li><a>Editar</a></li>
                        <li><a>Excluir</a></li>
                    </ul>
                </li>
                  <li>
                    Cliente
                    <ul class="dropdown">
                        <li><a>Cadastrar</a></li>
                        <li><a>Consultar</a></li>
                        <li><a>Editar</a></li>
                        <li><a>Excluir</a></li>
                    </ul>
                </li>
                  <li>
                    Motoristas
                    <ul class="dropdown">
                        <li><a>Cadastrar</a></li>
                        <li><a>Consultar</a></li>
                        <li><a>Editar</a></li>
                        <li><a>Excluir</a></li>
                    </ul>
                </li>
                  <li>
                    Locação
                    <ul class="dropdown">
                        <li><a>Cadastrar</a></li>
                        <li><a>Consultar</a></li>
                        <li><a>Editar</a></li>
                        <li><a>Excluir</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>

        <div class="container">
            <span>[LOGO]</span>
            <h1>Locadora</h1>
        </div>
        
        <div class="gradient footer">

        </div>
        
    </body>
</html>