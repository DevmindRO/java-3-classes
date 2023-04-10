<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Home Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container">
    <h3>Hi ${username}</h3>
    <p>User data:</p>
    <dl class="row">
        <dt class="col-sm-3">Email:</dt>
        <dd class="col-sm-9">${email}</dd>

        <dt class="col-sm-3">Phone number:</dt>
        <dd class="col-sm-9">${phoneNumber}</dd>

        <dt class="col-sm-3">Birthday:</dt>
        <dd class="col-sm-9">${birthday}</dd>
    </dl>
</div>
</body>
</html>