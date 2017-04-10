<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/3/29
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>添加单位</title>

    <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.2/build/pure-min.css" integrity="sha384-" crossorigin="anonymous">



    <!--[if lte IE 8]>
    <link rel="stylesheet" href="../css/layouts/side-menu-old-ie.css">
    <![endif]-->
    <!--[if gt IE 8]><!-->
    <link rel="stylesheet" href="../css/layouts/side-menu.css">

    <style>

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
                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/jsp/login.jsp" class="pure-menu-link">用户切换</a></li>
                <li class="pure-menu-item"><a href="<%=request.getContextPath()%>/sensor/sensorquery" class="pure-menu-link">我的传感器</a></li>
                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/html/aboutus.html" class="pure-menu-link">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>添加新单位</h1>

        </div>

        <div class="content">
            <legend>
                <br><br>
                <form class="pure-form pure-form-stacked" method="post" action="<%=request.getContextPath()%>/unit/addunit">
                    <fieldset>
                        <div class="pure-g">
                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">新单位名称</label>
                                <input id="email" name="unit" class="pure-u-23-24" type="text"> =
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">换算系数</label>
                                <input id="nickname" name="rate" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">米</label>
                                <input id="m" name="m" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">千克</label>
                                <input id="kg" name="kg" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">秒</label>
                                <input id="s" name="s" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">安培</label>
                                <input id="a" name="a" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">开尔文</label>
                                <input id="k" name="k" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">摩尔</label>
                                <input id="mol" name="mol" class="pure-u-23-24" type="text" required>
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">坎德拉</label>
                                <input id="cd" name="cd" class="pure-u-23-24" type="text" required>
                            </div>

                        </div>


                        <button type="submit" class="pure-button pure-button-primary">添加</button>
                    </fieldset>
                </form>
                <br><br>
            </legend>


        </div>
    </div>
</div>




<script src="/js/ui.js"></script>

</body>
</html>
