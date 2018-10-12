<%-- 
    Document   : ejemplo_objetos
    Created on : 12/10/2018, 02:59:59 AM
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
        
        <h1>Objetos predefinidos JSP</h1>
        
        Peticion datos del navegador: <%= request.getHeader("User-Agent") %>
        <br><br>
        Peticion Idioma utilizado: <%=request.getLocale()%>
        
    </body>
</html>
