<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 05/08/14
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="" version="2.0">
    <title>School</title>

    <link rel="stylesheet" href="/assets/css/vendor/bootstrap/bootstrap.min.css"/>
    <link rel="stylesheet" href="/assets/css/color.css"/>
    <!--<link href="/WEB-INF/pages/boostrap/css/color.css" rel="stylesheet" type="text/css" media="screen" />-->

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>

<jsp:include page="templates/layout/header.jsp"/>

<jsp:include page="templates/School/form.jsp"/>

<jsp:include page="templates/layout/footer.jsp"/>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/assets/js/vendor/bootstrap/bootstrap.min.js"></script>

</body>
</html>
