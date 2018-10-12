<%-- 
    Document   : EjmploScriptlet
    Created on : 12/10/2018, 02:19:57 AM
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
        <h1>Ejemplo scriptlet</h1>
        <%
            for(int i =0 ;i<10; i++){
                
                out.println("<br>numero: "+i);
            }
        %>
        
    </body>
</html>
