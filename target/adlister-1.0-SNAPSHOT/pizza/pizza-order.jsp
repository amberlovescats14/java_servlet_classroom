<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/9/20
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza-Order</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    <script language="JavaScript">
        $(document).ready(function(){
            $('select').not('.disabled').formSelect();
        });

        $(document).ready(function() {
            $('select').attr("class", "browser-default")
        });

    </script>

</head>
<body>
<%@include file="../partials/nav.jsp"%>
<h1>Pizza Order</h1>


<div class="row">
    <form class="col s12">
        <div class="row">
            <div class="input-field col s6">
                <input placeholder="1" id="amount" type="number" class="validate">
                <label for="amount">Quantity</label>
            </div>
        </div>
        <div class="row">
            <select name="crust" id="select" >
                <option value="" disabled selected>Choose your crust</option>
                <option value="regular">Regular</option>
                <option value="thin">Thin</option>
                <option value="deep">Deep Dish</option>
            </select>
            <label>Crust: </label>
        </div>
        <div class="row">
            <input type="submit" class="btn">
        </div>
    </form>
</div>


</body>
</html>
