<%@page import="com.bugget.entities.Depense"%>
<%@page import="com.bugget.entities.User"%>
<%@page import="com.bugget.service.impl.Service"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
  <%
  String description = request.getParameter("description");
  String categorie = request.getParameter("categorie");
  Double montant  = Double.valueOf(request.getParameter("montant"));
  Depense depense = new Depense(categorie, montant , description);
  Service.getCurrentInstance().creerDepense(depense);
  %>
  <div class="d-flex  justify-content-around">
  <div class="alert alert-success">
     <strong class="text-center ">Votre depense a été creée avec success</strong> 
  </div>
  <a class="btn btn-info" href="./listDepense.jsp">Lister</a>
  </div>
</body>
</html>