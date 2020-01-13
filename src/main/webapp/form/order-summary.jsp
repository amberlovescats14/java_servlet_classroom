<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/8/20
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Summary</title>
</head>
<body>
<h1>Order Summary</h1>
<%--<c:set var="item" value="${param.item}"/>--%>
<%--<c:set var="amount" value="${param.amount}"/>--%>

<%--<jsp:useBean id="items" class="java.util.HashMap" scope="request"/>--%>
<%--<c:set target="${items}" property="${item}" value="${amount}"/>--%>

<%--<c:forEach var="entry" items="${items}">--%>
<%--   Item:  ${entry.key}, Amount: ${entry.value}--%>
<%--</c:forEach>--%>

<%
    HashMap<String, String> items = new HashMap<String, String>(){{
        put(request.getParameter("item"), request.getParameter("amount"));
    }};

    request.setAttribute("listOfItems", items);
%>

<c:set target="${listOfItems}" property="${param.item}" value="${param.amount}"/>

<c:forEach var="entry" items="${listOfItems}">
   Item:  ${entry.key} , Amount: ${entry.value}
</c:forEach>








</body>
</html>

<%--<c:out value="item"/>--%>