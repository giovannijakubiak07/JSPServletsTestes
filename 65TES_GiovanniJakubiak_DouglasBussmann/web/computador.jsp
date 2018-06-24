<%-- 
    Document   : computador
    Created on : 24/06/2018, 11:46:35
    Author     : giova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Computador de bordo</title>
    </head>
    <body>
        <h1 id="nome"><%= request.getAttribute("carro")%></h1>
        <form action="datainput" method="POST">
            Total de Combustivel (Litros)<br>
            <input type="text" size="10" name="total" pattern="[0-9]+$" title="somente numeros"><br>
            Preço Litro (R$)<br>
            <input type="text" size="10" name="preco" pattern="[0-9]+$" title="somente numeros" > <br>
            Consumo médio (Km/l)<br>
            <input type="text" size="10" name="consumo" pattern="[0-9]+$" title="somente numeros"><br>
            <input id="calculate" type="submit" value="Calcular">
        </form>
       
    </body>
</html>
