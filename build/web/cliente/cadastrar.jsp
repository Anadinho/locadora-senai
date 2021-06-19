<%-- 
    Document   : cadastro
    Created on : 31/05/2021, 20:15:57
    Author     : Cabral
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
                        <li><a href="cadastrar.jsp">Cadastrar</a></li>
                        <li><a href="consultar.jsp">Consultar</a></li>
                        <li><a href="editar.jsp">Editar</a></li>
                        <li><a href="excluir.jsp">Excluir</a></li>
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
            
              <label class="TopdoForm">CADASTRAR NOVO CLIENTE (PF)</label><br>
              <a href="cadastrarPJ.jsp" class="btn-editar">Cliente (PJ)</a> <br><br>
              
              
        
              
             
       <input type="text" class="campo"    value="nome" placeholder="Nome" style="width: 425px" title="Digite seu nome.">
       <br> <input type="number" class="campo"   value="rg" placeholder="RG" style="width: 425px" title="Numero do RG.">
       <br> <input type="text" class="campo"     value="cpf" placeholder="CPF/CNPJ" style="width: 425px" title="Numero do CPF.">
       <br> <input type="text" class="campo"     value="cep" placeholder="CEP" style="width: 250px" title="Informe o CEP.">
            
       <br>  <input type="text" class="campo"    value="logradouro" placeholder="Rua/Logradouro" style="width: 250px" title="Digite sua rua.">
             <input type="number" class="campo"  value="numero" placeholder="N°" style="width: 75px;margin-left:70px;" title="Numero do lote.">
            
       <br>  <input type="text" class="campo"    value="complemento" placeholder="Complemento" style="width: 425px" title="Complemento(Apartamento, Proximo de... , etc...">
       <br>  <input type="text" class="campo"    value="bairro" placeholder="Bairro" style="width: 425px" title="Infome seu Bairro.">
            
       <br> <input type="text" class="campo"    value="cidade" placeholder="Cidade" style="width: 250px" title="Informe sua Cidade.">
            <input type="text" class="campo"    value="uf" placeholder="UF" style="width: 75px;margin-left:70px;" title="Informe UF.">
            
       <br> <input type="text" class="campo"    value="email" placeholder="E-mail" style="width: 425px" title="Digite seu E-mail.">
       <br> <input type="text" class="campo"    value="telefone" placeholder="Telefone" style="width: 425px" title="Informe seu telefone.">
            
           
            
       <br> <button class="btn"> Salvar </button>
        </div>
        
        
    <div class="gradient footer">

        </div>
    </body>
</html>