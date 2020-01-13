<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/8/20
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Nav</title>
<%--    <style>--%>
<%--        nav {--%>
<%--            width: 100%;--%>
<%--            height: 10%;--%>
<%--            background: palevioletred;--%>
<%--            color: antiquewhite;--%>
<%--        }--%>
<%--    </style>--%>
<%--    <link rel="stylesheet" href="./css/nav.css" type="text/css">--%>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<%--<nav>NAV BAR</nav>--%>
<nav>
    <div class="nav-wrapper light-blue lighten-1">
        <a href="#" class="brand-logo">Welcome</a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="/">Home</a></li>
            <li><a href="/login.jsp">Login</a></li>
        </ul>
    </div>
</nav>
</body>
</html>
