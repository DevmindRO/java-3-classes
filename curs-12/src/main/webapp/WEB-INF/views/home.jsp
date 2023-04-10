<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container">
    <div class="row">
        <h1>The Spring MVC App</h1>
        <p>Current server time is: <span class="text-decoration-underline">${serverTime}</span>.</p>
    </div>

    <div class="row">
        <form action="user" method="post">
            <div class="col-lg-12 mb-3">
                <label for="username" class="form-label">Username:</label>
                <input type="text" name="username" id="username" class="form-control">
            </div>

            <div class="col-lg-12 mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" name="email" id="email" class="form-control">
            </div>

            <div class="col-lg-12 mb-3">
                <label for="phoneNumber" class="form-label">Phone number:</label>
                <input type="text" name="phoneNumber" id="phoneNumber" class="form-control">
            </div>

            <div class="col-lg-12 mb-3">
                <label for="birthday" class="form-label">Birthday</label>
                <input type="date" name="birthday" id="birthday" class="form-control">
            </div>

            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</div>
</body>
</html>