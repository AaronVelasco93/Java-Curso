<%-- 
    Document   : Recoje_datos
    Created on : 12/10/2018, 03:30:15 AM
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
        
        <%
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            String usuario=request.getParameter("usuario");
            String contra=request.getParameter("contra");
            String pais=request.getParameter("pais");
            String tecno=request.getParameter("tecnologias");
            
        %>
    </body>
</html>
