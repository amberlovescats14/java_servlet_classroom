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
    <title>Pick Color</title>
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>
<%@include file="../partials/nav.jsp"%>
<h1>Tell us your favorite color...</h1>
<div class="row">
    <form class="col s12" method="post" action="color.jsp">
        <div class="row">
            <div class="input-field col s6">
                <input  id="color" type="text" class="validate" name="color">
                <label for="color">Color</label>
            </div>
        </div>
        <div class="row">
            <input type="submit" class="btn">
        </div>
    </form>
</div>


</body>
</html>
