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
    <title>Bootstrap Template</title>

    <link rel="stylesheet" href="/assets/css/vendor/bootstrap/bootstrap.min.css"/>
    <link rel="stylesheet" href="/assets/css/color.css"/>
    <!--<link href="/WEB-INF/pages/boostrap/css/color.css" rel="stylesheet" type="text/css" media="screen" />-->

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">New Education</a>
        </div>
        <div class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" role="form">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Sign in</button>
            </form>
        </div>
    </div>
</div>
<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li><a href="#">Overview</a></li>
                <li><a href="#">Overview</a></li>
                <li class="active"><a href="#">Overview</a></li>
                <li><a href="#">Overview</a></li>
                <li><a href="#">Overview</a></li>
                <li><a href="#">Overview</a></li>
                <li class="active"><a href="#">Overview</a></li>
            </ul>
        </div>
        <div class="col-md-8 main">
            <h1 class="page-header">Adicionar Escola</h1>

            <div class="row placeholders">
                <div class="col-xs-12 pager">
                    <div class="row">
                        <form role="form" id="schoolAdd" method="post" modelAtribute="schoolmodel">
                            <div class="form-horizontal" role="form">
                                <label for="titleforschool" class="col-sm-2 control-label">Titulo da Escola</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="title" type="text" class="form-control" id="titleforschool"
                                           placeholder="Digite o titulo da Escola" value="${school.title}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="cityforschool" class="col-sm-2 control-label">Cidade</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="city" class="form-control" id="cityforschool">
                                        <c:forEach var="item" items="${cities}">
                                            <option value="${item}">${item.valor}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="stateforschool" class="col-sm-2 control-label">Estado</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="state" class="form-control" id="stateforschool">
                                        <c:forEach var="item" items="${states}">
                                            <option value="${item}">${item.valor}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer navbar-fixed-bottom">
    <div class="container">
        <p class="text-muted">Roda pe</p>
    </div>
</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/assets/js/vendor/bootstrap/bootstrap.min.js"></script>

</body>
</html>
