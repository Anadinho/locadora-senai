<%-- 
    Document   : editar
    Created on : 31/05/2021, 20:09:35
    Author     : Cabral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SENAI-PI-LOCADORA</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
    </head>
    <body>
        
        <img src="../assets/background2.webp" class="img blur" >
        
        <nav>
            
            <a href="../index.jsp"> <img class="home-img" src="../assets/casa.png" height="70px"> </a>
            
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
                    <li><a href="../locadora/cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="../locadora/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
            </ul> 
        </nav>
        
           <div class="conteudo">
            
               <label class="TopdoForm">EDITAR CADASTRO VEICULO</label><br>
            <input type="text" class="campo" value="placa" placeholder="Placa" style="width: 150px" title="Informar a placa do veiculo."> 
            <input type="text" class="campo" value="modelo" placeholder="Modelo" style="width: 150px;margin-left:20px" title="Informar o modelo do veiculo."> 
            <input type="text" class="campo" value="marca" placeholder="Marca" style="width: 150px;margin-left:20px" title="Informar a marca do veiculo."> 
            <br>
            <input type="number" class="campo" value="renavam" placeholder="Renavam(Numeros)" style="width: 150px" title="Informe o renavam."> 
            <input type="text" class="campo" value="tipo" placeholder="Tipo" style="width: 150px;margin-left:20px" title="Informe o tipo do veiculo."> 
            <input type="text" class="campo" value="categoria" placeholder="Categoria" style="width: 150px;margin-left:20px" title="Informe a categoria do veiculo."> 
            <br>
            <input type="number" class="campo" value="Ano-Fabricação" placeholder="anoFabricacao" style="width: 150px" title="Informe o ano de fabricação do veiculo."> 
            <input type="number" class="campo" value="Ano-Modelo" placeholder="anoModelo" style="width: 150px;margin-left:220px" title="Informe o ano modelo do veiculo.">
            <br>
            <input type="number" class="campo" value="precoCompra" placeholder="Preço de Compra" style="width: 150px" title="Informe preço de compra do veiculo."> 
           <input type="number" class="campo" value="precoVenda" placeholder="Preço de Venda" style="width: 150px;margin-left:220px" title="Informe o apreço de venda do veiculo.">
            <br>
            <input type="number" class="campo" value="passageiros" placeholder="Nro de passageiros" style="width: 250px" title="Informe a quantidade de assentos/passageiros.">
            <br>
            <input type="text" class="campo" value="combustivel" placeholder="Combustivel" style="width: 250px" title="Informe o combustivel utilizado.">
            <br>
            <input type="text" class="campo" value="quilometragem" placeholder="Quilometragem" style="width: 250px" title="Informe a Quilometragem.">
            <br>
            <input type="text" class="campo" value="situacao" placeholder="Situação" style="width: 250px" title="Informe a disponibilidade do veiculo.">

            <br> <button class="btn-editar"> Editar </button>
        </div>

        
        
    <div class="gradient footer">

        </div>
    </body>
</html>