<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/9/20
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ahoy</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
<%@include file="../partials/nav.jsp"%>
<h1>Add an Ahoy</h1>

<div class="row">
    <form class="col s12" action="/ahoy/create" method="post">
        <div class="row">
            <div class="input-field col s6">
                <input  id="number" type="number" class="validate" name="number">
                <label for="number">Employee number:</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s6">
                <input  id="first" type="text" class="validate" name="first">
                <label for="first">First name:</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s6">
                <input  id="last" type="text" class="validate" name="last">
                <label for="last">Last name:</label>
            </div>
        </div>
        <input type="submit" class="waves-effect waves-light btn">
    </form>
</div>


</body>

</html>
