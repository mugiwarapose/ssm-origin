<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <script src="resources/js/angular.js"></script>
    <script src="resources/js/angular-ui-router.js"></script>
    <script src="resources/js/angular-resource.js"></script>
    <script src="resources/menu/menuModule.js"></script>
    <script src="resources/menu/menuController.js"></script>
    <script src="resources/menu/menuService.js"></script>
    <script src="resources/menu/toolbarComponent.js"></script>
</head>
<body>
    <div class="panel panel-primary">
        <div class="panel-body">
            <div class="row">
                <div class="col-md-offset-2 col-md-4">BOOTSTRAP</div>
                <div class="col-md-offset-6 col-md-8" ng-controller="toolbarCtrl">
                    <ul class="nav navbar-nav" ng-repeat="toolbar in toolbars">
                        <li class="active"><a href="#">{{toolbar.menuName}}</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</body>
</html>