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
  String nom = request.getParameter("nom");
  String prenom = request.getParameter("prenom");
  String email = request.getParameter("email");
  String password = request.getParameter("password");
  User user = new User(nom , prenom , email , password);
  Service.getCurrentInstance().creerCompte(user);
  %>
  <div class="d-flex  justify-content-around">
  <div class="alert alert-success ml-auto w-50 mt-5">
     <strong class="text-center ">Vous etes inscrit avec success</strong> 
  </div>
  <a class="btn btn-info" href="connexion.jsp">Se connecter</a>
  </div>
</body>
</html>