<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 10/08/14
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
