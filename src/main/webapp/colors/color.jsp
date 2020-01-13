<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/9/20
  Time: 8:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color</title>
    <%
    String color = request.getParameter("color");
    request.setAttribute("color", color);
    %>
    <style>
        body {
            background: ${color};
            color: gray;
        }
    </style>
</head>
<body>
<h1>${color.toUpperCase()}</h1>
</body>
</html>
