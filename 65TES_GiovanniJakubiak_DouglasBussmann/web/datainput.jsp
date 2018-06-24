<%-- 
    Document   : datainput
    Created on : 24/06/2018, 11:59:35
    Author     : giova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1><%= request.getAttribute("carro")%></h1>
        <form>
            <ul>
                <li>
                    Distância máxima:     <%= request.getAttribute("distancia")%>   
                </li>
                
               
            </ul>
            <ul>
                <li>
                    Valor gasto para abstecer:     <%= request.getAttribute("valor")%>
                </li>
               
            
            </ul>
                <a href="index.html"><input id="retorno" type="button" value="Retornar" ></a>
        </form>
       
    </body>
</html>
