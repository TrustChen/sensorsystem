<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/3/20
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>login</title>

    <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.2/build/pure-min.css" integrity="sha384-" crossorigin="anonymous">



    <!--[if lte IE 8]>
    <link rel="stylesheet" href="../css/layouts/side-menu-old-ie.css">
    <![endif]-->
    <!--[if gt IE 8]><!-->
    <link rel="stylesheet" href="../css/layouts/side-menu.css">
    <!--<![endif]-->

    <style>
        .content{
            text-align:center;
        }

        .pure-menu-item {
            height: auto;
        }
    </style>

</head>
<body>

<div id="layout">
    <!-- Menu toggle -->
    <a href="#menu" id="menuLink" class="menu-link">
        <!-- Hamburger icon -->
        <span></span>
    </a>

    <div id="menu">
        <div class="pure-menu">
            <a class="pure-menu-heading" href="#">管理系统</a>

            <ul class="pure-menu-list">


                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/html/aboutus.html" class="pure-menu-link">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>用户管理</h1>
            <h2>没有注册的用户点击<a href="http://localhost:8080/sensor/jsp/register.jsp">注册</a></h2>
        </div>

        <div class="content">

            <form class="pure-form" action="<%=request.getContextPath()%>/users/login" method="post">
                <fieldset>
                    <legend>
                        <br><br><br><br>
                        <div class="form-contain">
                            <input type="text" placeholder="id" id="id" name="id">
                            <input type="password" placeholder="Password" id="password" name="password">

                            <label for="remember">
                                <input id="remember" type="checkbox"> 记住我
                            </label>

                            <button type="submit" name="submit" class="pure-button pure-button-primary">登录</button>
                        </div>
                        <br><br><br><br>
                    </legend>
                </fieldset>
            </form>

        </div>
    </div>
</div>




<script src="/js/ui.js"></script>

</body>
</html>
