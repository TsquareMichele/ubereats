<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!-- Adding Spring url Tag library -->
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- Creating variables named css, js and image. Note the value is coming from the dispatcher -->
<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${title} - Uber Eats </title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/${css}/bootstrap.min.css" rel="stylesheet">
     <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">
    
    <!-- Repective Favicons For the Respective devices -->
    
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="${images}/icon/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="${images}/icon/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="${images}/icon/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="${images}/icon/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="${images}/icon/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="${images}/icon/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="${images}/icon/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="${images}/icon/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"  href="${images}/icon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32" href="${images}/icon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96" href="${images}/icon/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16" href="${images}/icon/favicon-16x16.png">
<link rel="manifest" href="${images}/icon/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
<meta name="theme-color" content="#ffffff">
    
    

  </head>

  <body>

    <!-- Navigation -->
 <%@include file="./shared/navbar.jsp" %>
    <!-- Page Content -->
  
  
   <!--Loading Home Page Content-->
   	<!-- when user clicks on home return to home.jsp -->
   <c:if test="${userClickHome==true }">
   	<%@include file="home.jsp"%>
   </c:if>
   
   
   <!--Loading About Page Content-->
   	<!-- when user clicks on about go to about.jsp -->
   <c:if test="${userClickAbout==true }">
   	<%@include file="about.jsp"%>
   </c:if>
   
    <!--Loading Contact Page Content-->
   	<!-- when user clicks on contact go to contact.jsp -->
   <c:if test="${userClickContact==true }">
   	<%@include file="contact.jsp"%>
   </c:if>
   
   
    <!-- /.container -->

<!-- Foot comes here -->
<%@include file="./shared/footer.jsp" %>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="${js}/jquery.js"></script>
     <script src="${js}/bootstrap.bundle.min.js"></script>
    
    <script src="vendor/bootstrap/${js}/bootstrap.bundle.min.js"></script>

  </body>

</html>
