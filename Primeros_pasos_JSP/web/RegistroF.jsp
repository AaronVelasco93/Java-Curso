<%-- 
    Document   : RegistroF
    Created on : 12/10/2018, 03:24:03 AM
    Author     : Aaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
<style>

body{
	background-color:#FFC;
}

table{
	background:#FF6;
	padding:10px;
	border:solid 2px #FF0000;
}

td{
	padding:5px 0;
}




</style>
    </head>
    <body>
        
<h1 style="text-align:center">Registro</h1>
<form action="" method="get">

  <table width="25%">
    <tr>
      <td width="13%"><label for="nombre">Nombre: </label></td>
      <td width="87%"><input type="text" name="nombre" id="nombre"></td>
    </tr>
    <tr>
      <td><label for="apellido">Apellido:  </label></td>
      <td><input type="text" name="apellido" id="apellido"></td>
    </tr>
    <tr>
      <td><label for="usuario">Usuario: </label></td>
      <td><input type="text" name="usuario" id="usuario"></td>
    </tr>
    <tr>
      <td><label for="contra">Contraseña: </label></td>
      <td><input type="text" name="contra" id="contra"></td>
    </tr>
    <tr>
      <td> <label for="pais">País:</label></td>
      <td><select name="pais" id="pais">
        <option>México</option>
        <option>Colombia</option>
        <option>Chile</option>
        <option>Perú</option>
        <option>Argentina</option>
        <option>España</option>
      </select></td>
    </tr>
    <tr>
      <td>Tecnologías: </td>
      <td><label>
        <input type="radio" name="tecnologias" value="Java" id="tecnologias_0">
        Java</label>
        <br>
        <label>
          <input type="radio" name="tecnologias" value="PHP" id="tecnologias_1">
          Php</label>
        <br>
        <label>
          <input type="radio" name="tecnologias" value="JavaScript" id="tecnologias_2">
      JavaScript</label></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Enviar"></td>
    </tr>
  </table>
  <p><br>
  </p>
</form>
        
    </body>
</html>
