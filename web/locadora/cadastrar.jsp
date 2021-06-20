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
            <label class="TopdoForm">NOVA LOCAÇÃO DE VEICULO</label><br>
            <input type="text" class="campo" placeholder="Veiculo" style="width: 425px" title="Digite o nome do Veiculo."> <br> 
       <input type="radio" name="identifier" value="PF"> <label class="radio-label" for="PF">PF</label>
       <input type="radio" name="identifier" value="PJ"> <label class="radio-label" for="PJ">PJ</label> <br>
           
       <input type="text" class="campo" value="clienteLocar" placeholder="Cliente" style="width: 425px" title="Digite o nome do Cliente.">  
       <br> <input type="text" class="campo" value="motoristaLocar" placeholder="Motorista" style="width: 425px" title="Digite o nome do Motorista.">  
      
       <br><input type="date" class="campo" value="dataLocacao" placeholder="Data de Locação" style="width: 155px" title="Data de locação.">  
           <input type="date" class="campo" value="dataDevolucao" placeholder="Data de Devolução" style="width: 155px" title="Data de devolução.">  
           <br>
           <br> <button class="btn-editar"> Simular </button> <br>
                                  
                                  
           <input type="number" class="campo" value="diarias" placeholder="Diarias" style="width: 155px" title="Diarias."><br>  
           <input type="number" class="campo" value="valorLocacao" placeholder="Valor da Locação" style="width: 155px" title="Valor de Locação."> <br>
           <input type="number" class="campo" value="valorCaucao" placeholder="Valor da Caução" style="width: 155px" title="Valor de Caução."><br>  
           <input type="number" class="campo" value="valorSeguro" placeholder="Valor do Seguro" style="width: 155px" title="Valor do seguro."><br>
           <br>
           <input type="number" class="campo" value="total" placeholder="Total" style="width: 155px" title="TOTAL.">
           <input type="number" class="campo" value="seguroCobertura" placeholder="Cobertura Seguro" style="width: 155px" title="Cobertura Seguro.">
       
       
            
     
           
            
       <br> <button class="btn"> Cadastrar Locação </button>
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>