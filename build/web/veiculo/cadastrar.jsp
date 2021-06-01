<%-- 
    Document   : cadastrar
    Created on : 31/05/2021, 20:08:43
    Author     : Cabral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../style.css">
    </head>
    <body>
        <nav>
            <ul class="gradient">
                <li>
                    Veiculo
                    <ul class="dropdown">
                        <li><a href="cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="consultar.jsp">Consultar</a></li>
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
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
                        <li><a>Cadastrar</a></li>
                        <li><a>Consultar</a></li>
                        <li><a>Editar</a></li>
                        <li><a>Excluir</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>
    </body>
</html>
