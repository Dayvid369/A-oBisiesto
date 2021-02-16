<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultado</title>
</head>
<body>

<% 

String mensaje = (String) request.getAttribute("result");
System.out.println(mensaje);	


%>

 <!--
<input name="resultado" type="text" value="<%= //mensaje %>">
-->
</body>
</html>