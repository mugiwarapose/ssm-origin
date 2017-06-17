<%--
  Created by IntelliJ IDEA.
  User: pose
  Date: 2017/6/12
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" ng-app="myApp">
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <style type="text/css" >

        .container{
            width:500px;
            display:table;
            height:100%;
        }



    </style>
</head>
<body>
        <div class="container">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h4>LOGIN</h4>
                    </div>
                    <div class="panel-body">
                        <div class="row">

                            <form id="login_form" role="form" class="form-horizontal">
                                    <div class="form-group">
                                        <label  class="col-md-3 control-label">用户名：</label>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control" placeholder="用户名/邮箱/手机号码">
                                        </div>
                                    </div>

                                <div class="form-group">
                                    <label  class="col-md-3 control-label">密码：</label>
                                    <div class="col-md-8">
                                        <input type="text" class="form-control" placeholder="密码">
                                    </div>
                                </div>

                                <div class="form-group">

                                    <div class="col-md-offset-5 col-md-12">
                                        <input type="button" class="btn btn-default" value="登录">
                                    </div>
                                </div>


                            </form>


                        </div>

                    </div>
                </div>
        </div>
</body>
</html>
