<%-- 
    Document   : Calculos
    Created on : 12/10/2018, 02:38:04 AM
    Author     : Aaron
--%>
<%@page import="pildorasinformaticas.com.CalculosMatematicos.Calculos" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculos</title>
    </head>
    <body>
        <h1>Calculos con modularizacion</h1>
        
        La suma de 5 y 7 es: <%=Calculos.metodoSuma(5,7) %>
        <br>
        La resta de 5 y 7 es: <%=Calculos.metodoResta(5,7) %>
        <br>    
        La multiplicacion de 5 y 7 es: <%=Calculos.metodoMultiplica(5,7) %>
    </body>
</html>
