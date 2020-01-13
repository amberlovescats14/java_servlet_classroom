<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/13/20
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Session</title>
</head>
<body>
<h1>TITLE :: Session</h1>
<%--${sessionScope.name}--%>
<%--${sessionScope.cart.numItems}--%>

<%--${pageContext.session.maxInactiveInterval}--%>


<h1>${sessionScope.session}</h1>

<h1>${requestScope.reqAtt}</h1>

<h1>${applicationScope.context}</h1>
</body>
</html>
