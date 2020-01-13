<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/9/20
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

</head>
<body>
<h1>Index</h1>

<c:forEach var="items" items="${allAds}">
    <div class="card blue-grey darken-1 col s6">
        <div class="card-content white-text">
            <span class="card-title">
               ${items.title}
            </span>
            ${items.description}
        </div>
    </div>
</c:forEach>


</body>
</html>
