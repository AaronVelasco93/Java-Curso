<%-- 
    Document   : EjemploDeclracion
    Created on : 12/10/2018, 02:23:18 AM
    Author     : Aaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="text-align:center" >Ejemplo Declaraciones</h1>
        
        <%!
            private int resultado;
            
            public int metodoSuma(int num1 , int num2){
            resultado = num1+num2;
            return resultado;

            } 
            public int metodoResta(int num1 , int num2){
                resultado = num1-num2;
                return resultado;

            } 

            public int metodoMultiplica(int num1 , int num2){
                resultado = num1*num2;
                return resultado;

            } 
        %>
        <p>El resultado de la suma es: <%=metodoSuma(7,5)%></p>
        <br>
        <p>El resultado de la multiplicacion es: <%=metodoMultiplica(7,5)%></p>
        <br>
        <p>El resultado de la Resta es: <%=metodoResta(7,5)%></p>
    </body>
</html>
