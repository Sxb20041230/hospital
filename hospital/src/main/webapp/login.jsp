<%--
  Created by IntelliJ IDEA.
  User: dell998
  Date: 2024/7/8
  Time: 上午11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <style>
        .group1 {
            display: flex;
            flex-direction: column;
            margin-bottom: 15px;
        }

        .group1 select {
            padding: 10px;
            border: 2px solid #ccc;
            border-radius: 5px;
            font-size: 1em;
            background-color: #f9f9f9;
            transition: border-color 0.3s ease, box-shadow 0.3s ease;
            appearance: none; /* Remove default arrow */
            -webkit-appearance: none; /* Remove default arrow in Safari */
            -moz-appearance: none; /* Remove default arrow in Firefox */
            background-image: url('data:image/svg+xml;charset=US-ASCII,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 4 5"><path fill="none" stroke="%23999" stroke-width="1" d="M2 0L0 2h4z"/></svg>'); /* Custom arrow */
            background-repeat: no-repeat;
            background-position: right 10px center;
            background-size: 10px;
        }

        .group1 select:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
            outline: none;
        }

    </style>

    }
    </style>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Site Metas -->
    <title>Login and Register tabbed form</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
    <!-- Site CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/all.min.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/responsive.css">
    <!-- Custom CSS -->




    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div id="particles-js" class="main-form-box">
    <div class="md-form">
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="panel panel-login">
                        <div class="logo-top">
                            <a href="#"><img src="images/logo.png" alt="" /></a>
                        </div>
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-lg-6 col-sm-6 col-xl-6">
                                    <a href="#" class="active" id="login-form-link">登录</a>
                                </div>
                                <div class="col-lg-6 col-sm-6 col-xl-6">
                                    <a href="#" id="register-form-link">注册</a>
                                </div>
                                <div class="or">或</div>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="<%=request.getContextPath()%>/backend/loginServlet" method="post" role="form" style="display: block;">
                                        <div class="form-group">
                                            <label class="icon-lp"><i class="fas fa-user-tie"></i></label>
                                            <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="请输入用户名" value="" required="">
                                        </div>
                                        <div class="form-group">
                                            <label class="icon-lp"><i class="fas fa-key"></i></label>
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="请输入密码" required="">
                                        </div>

                                        <div class="form-group">
                                        <div class="group1">
                                           <select name="roleId">
                                               <option value="0">管理员</option>
                                               <option value="1">医生</option>

                                           </select>
                                        </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="icon-lp"></label>
                                                <input type="text" class="input input-big" name="code" placeholder="填写右侧的验证码" data-validate="required:请填写右侧的验证码" />
                                                <img src="<%=request.getContextPath()%>/backend/captServlet" alt="" width="100" height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="this.src=this.src+'?'">


                                        </div>




                                        <div class="che-box">
                                            <label class="checkbox-in">
                                                <input name="checkbox" type="checkbox" tabindex="3" id="remember"> <span></span>
                                                记住我
                                            </label>
                                        </div>
                                        <ul>

                                        </ul>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 offset-sm-3">
                                                    <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="text-center">
                                                        <a href="#" tabindex="5" class="forgot-password">Forgot Password?</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                            ${captError}


                                    </form>
                                    <form id="register-form" action="#" method="post" role="form" style="display: none;">
                                        <div class="form-group">
                                            <label class="icon-lp"><i class="fas fa-user-tie"></i></label>
                                            <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="请输入用户名" value="" required="">
                                        </div>
                                        <div class="form-group">
                                            <label class="icon-lp"><i class="fas fa-envelope"></i></label>
                                            <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="请输入邮件" value="" required="">
                                        </div>
                                        <div class="form-group">
                                            <label class="icon-lp"><i class="fas fa-key"></i></label>
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="请输入密码" required="">
                                        </div>
                                        <div class="form-group">
                                            <label class="icon-lp"><i class="fas fa-key"></i></label>
                                            <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="确认密码" required="">
                                        </div>
                                        <ul>

                                        </ul>

                                        <div class="che-box">
                                            <label class="checkbox-in">

                                            </label>
                                        </div>

                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 offset-sm-3">
                                                    <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="注册">
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>



                </div>
            </div>
        </div>
    </div>

</div>


<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/particles.min.js"></script>
<script src="<%=request.getContextPath()%>/js/index.js"></script>
<script type="text/javascript">
    $(function() {
        $('#login-form-link').click(function(e) {
            $("#login-form").delay(100).fadeIn(100);
            $("#register-form").fadeOut(100);
            $('#register-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $('#register-form-link').click(function(e) {
            $("#register-form").delay(100).fadeIn(100);
            $("#login-form").fadeOut(100);
            $('#login-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
    });

    $('.form-group input').focus(function () {
        $(this).parent().addClass('addcolor');
    }).blur(function () {
        $(this).parent().removeClass('addcolor');
    });

</script>

</body>

</html>
