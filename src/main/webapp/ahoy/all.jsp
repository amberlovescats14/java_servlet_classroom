<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/9/20
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ahoy</title>
</head>
<body>
<%@include file="../partials/nav.jsp"%>

<%--<h1>Hello ${name}</h1>--%>
<a href="/ahoy/create">Add Ahoy</a>

<%--the URL will be directly to the one specified in @WebServlet()--%>
<%--not the send direct--%>
<div class="row">
<c:forEach var="item" items="${allAhoy}">
    <div class="card blue-grey darken-1 col s6">
        <div class="card-content white-text">
            <span class="card-title">
               ${item.first_name} ${item.last_name}
            </span>
        </div>
    </div>
</c:forEach>
</div>

</body>
</html>
