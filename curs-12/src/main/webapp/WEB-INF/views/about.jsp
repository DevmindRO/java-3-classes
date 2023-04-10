<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>About Us</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container">
    <h1>This is the about page</h1>
    <p>Contact us at: <strong>random-email@theinternet.ro</strong></p>
    <img src="${pageContext.request.contextPath}/resources/images/meme.jpg" alt="Meme">
</div>
</body>
</html>