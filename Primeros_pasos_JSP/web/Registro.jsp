<%-- 
    Document   : Registro
    Created on : 12/10/2018, 03:07:40 AM
    Author     : Aaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mustra usuarios</title>
    </head>
    <body>
        
        <h1>Usuarios Registrados</h1>
        
        Usuario Confirmado: <br><br>
        
        Nombre: <%= request.getParameter("nombre")%>  <br>
        Apellido:<%=request.getParameter("apellido")%>
        
        <jsp:include page="Fecha.jsp"></jsp:include>
    </body>
</html>
