<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css">
<title>Practica</title>
</head>
<body>



<nav class="navbar navbar-dark bg-light">
<a>PROYECTO</a>
<c:forEach items="${ListaCategoria}" var="c">
<!-- BORRAR -->
<a href="Index?id=${c.id}">${c.nombre}</a>
<a class="btn" href="Index?id_borrar=${c.id}">Borrar</a>
</c:forEach>
</nav>


<!-- INSERTAR -->
<form action="/" method="Get">
<input type="text" name="nombre_cat" value=""></input>
<a class="btn" href="Index?id_insertar=${c.id}">Insertar</a>
<buttom type="submit" name="form_insertar" value="true"></buttom>
</form>

<!-- EDITAR -->
<form action="/" method="Get">
<input type="text" name="nombre_cat" value=""></input>
<a class="btn" href="Index?id_editar=${c.id}">Editar</a>
<buttom type="submit" name="form_edit" value="true"></buttom>
</form>



</body>
</html>