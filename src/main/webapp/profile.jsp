<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/7/20
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<nav>
    <%@ include file="partials/nav.jsp" %>
</nav>
<header>
    <%@ include file="partials/banner.jsp"%>
</header>
<h1>
    Welcome ${user}
</h1>
</body>
</html>
