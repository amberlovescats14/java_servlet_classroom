<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/8/20
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Order Form</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

</head>
<body>
<h1>Order Form</h1>

<div class="row">
    <form class="col s12" action="order-summary.jsp" method="post">
        <div class="row">
            <div class="input-field col s6">
                <input  id="item" type="text" class="validate" name="item">
                <label for="item">Item</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s6">
                <input  id="amount" type="number" class="validate" name="amount">
                <label for="amount">Amount</label>
            </div>
        </div>
        <input type="submit" class="waves-effect waves-light btn">
    </form>
</div>


</body>
</html>
