<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bisiesto</title>
</head>
<body>

<% 
String mensaje = (String)request.getAttribute("op");
if(mensaje==null)
	mensaje="";
%>

<form action="<%=request.getContextPath()%>/bisiesto" method="post">
	<!-- 
	Operando 1: <input name="operando1" type="text">
	-->


	Inserte un año: <input name="numero" type="text" value="<%= mensaje %>">


	<input name="Enviar" value="Enviar" type="submit">
	<input name="limpiar" value="Limpiar" type="reset">

</form>

<br>
<input name="resultado" size="50" type="text" value="<%= (String)request.getAttribute("result") %>" disabled="disabled">

</body>
</html>